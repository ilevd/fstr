# fstr

[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.ilevd/fstr.svg)](https://clojars.org/org.clojars.ilevd/fstr)

**Experimental** fast string concatenation for Clojure implemented in Java.

## Usage

```clojure 
(require '[fstr.core :as f])

(f/str)  ; => ""
(f/str nil)  ; => ""
(f/str "hello" "world")  ; => "helloworld"
(apply f/str [1 2 3])  ; => "123"
```

## Performance

Usually it's about **~3x** faster than `clojure.core/str` function.
```clojure
(do
    (criterium/quick-bench
      (str "Lorem" "Ipsum" "is" "simply" "dummy" "text" "of" "the" "printing" "and" "typesetting" "industry."))
    (criterium/quick-bench
      (f/str "Lorem" "Ipsum" "is" "simply" "dummy" "text" "of" "the" "printing" "and" "typesetting" "industry.")))
Evaluation count : 1789986 in 6 samples of 298331 calls.
             Execution time mean : 341.467720 ns
    Execution time std-deviation : 16.059433 ns
   Execution time lower quantile : 329.927222 ns ( 2.5%)
   Execution time upper quantile : 361.950803 ns (97.5%)
                   Overhead used : 7.837712 ns
Evaluation count : 5983572 in 6 samples of 997262 calls.
             Execution time mean : 102.446681 ns
    Execution time std-deviation : 13.831588 ns
   Execution time lower quantile : 92.017935 ns ( 2.5%)
   Execution time upper quantile : 119.960635 ns (97.5%)
                   Overhead used : 7.837712 ns
=> nil
```

It's comparable to inlining `StringBuilder`.
```clojure 
(do
    (criterium/quick-bench
      (.toString
        (doto (StringBuilder. "Lorem")
          (.append "Ipsum") (.append "is") (.append "simply") (.append "dummy") (.append "text")
          (.append "of") (.append "the") (.append "printing") (.append "and") (.append "typesetting")
          (.append "industry."))))
    (criterium/quick-bench
      (f/str "Lorem" "Ipsum" "is" "simply" "dummy" "text" "of" "the" "printing" "and" "typesetting" "industry.")))
Evaluation count : 5396484 in 6 samples of 899414 calls.
             Execution time mean : 116.024831 ns
    Execution time std-deviation : 10.652410 ns
   Execution time lower quantile : 104.181137 ns ( 2.5%)
   Execution time upper quantile : 125.789789 ns (97.5%)
                   Overhead used : 7.818820 ns
Evaluation count : 5302530 in 6 samples of 883755 calls.
             Execution time mean : 117.508842 ns
    Execution time std-deviation : 17.212965 ns
   Execution time lower quantile : 105.548643 ns ( 2.5%)
   Execution time upper quantile : 144.886630 ns (97.5%)
                   Overhead used : 7.818820 ns

Found 1 outliers in 6 samples (16.6667 %)
	low-severe	 1 (16.6667 %)
 Variance from outliers : 31.9848 % Variance is moderately inflated by outliers
=> nil
```

Also it's faster than `clojure.string/join` using without separator (internally
it's `(apply str xs)`).
```clojure 
(let [xs (vec (range 10000))]
    (criterium/quick-bench
      (str/join xs))
    (criterium/quick-bench
      (apply f/str xs)))
Evaluation count : 1440 in 6 samples of 240 calls.
             Execution time mean : 482.846408 µs
    Execution time std-deviation : 74.645269 µs
   Execution time lower quantile : 416.713692 µs ( 2.5%)
   Execution time upper quantile : 568.493024 µs (97.5%)
                   Overhead used : 2.799492 ns
Evaluation count : 2562 in 6 samples of 427 calls.
             Execution time mean : 265.731661 µs
    Execution time std-deviation : 37.065308 µs
   Execution time lower quantile : 235.160576 µs ( 2.5%)
   Execution time upper quantile : 311.249615 µs (97.5%)
                   Overhead used : 2.799492 ns
```

## License

Copyright © 2026 ilevd


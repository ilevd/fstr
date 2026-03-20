(ns fstr.core
  (:refer-clojure :exclude [str])
  (:import (fstr Strings)))

(def str
  ^{:doc      "String concatenation"
    :arglists '([& xs])}
  Strings/strFn)

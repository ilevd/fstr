(defproject fstr "0.1.0"
  :description "Fast string concatenation"
  :url "https://github.com/ilevd/fstr"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.4"]]
  :java-source-paths ["src-java"]
  :repl-options {:init-ns fstr.core}
  :main fstr.core
  :profiles {:uberjar {:aot :all}}
  )

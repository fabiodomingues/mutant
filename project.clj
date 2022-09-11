(defproject mutant "0.3.0"
  :description "Mutation testing for Clojure"
  :url "https://github.com/jstepien/mutant"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.11.1" :scope "provided"]
                 [clj-diffmatchpatch "0.0.9.3" :exclusions [org.clojure/clojure]]
                 [org.clojure/tools.namespace "1.3.0"]
                 [jansi-clj "1.0.1"]
                 [rewrite-clj "1.1.45"]])

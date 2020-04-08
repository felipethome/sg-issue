(defproject simple-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"]
                 [com.google.javascript/closure-compiler-unshaded "v20191027"]
                 [org.clojure/google-closure-library "0.0-20191016-6ae1f72f"]
                 [org.clojure/google-closure-library-third-party "0.0-20191016-6ae1f72f"]

                 [org.clojure/test.check "1.0.0"]
                 [prismatic/schema "1.1.12"]
                 [prismatic/schema-generators "0.1.3"]

                 [org.clojure/core.async "0.6.532"]]

  :source-paths ["src"]

  :profiles
  {:cljs
   {:source-paths ["src"]
    :dependencies [[thheller/shadow-cljs "2.8.84"]]}})


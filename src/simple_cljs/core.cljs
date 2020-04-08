(ns simple-cljs.core
  (:require [schema-generators.generators :as g]
            [schema.core :as s]))

(enable-console-print!)

(println "gen:" (g/generate {:a s/Int}))

(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'simple-cljs.core
   :output-to "out/simple_cljs.js"
   :output-dir "out"})

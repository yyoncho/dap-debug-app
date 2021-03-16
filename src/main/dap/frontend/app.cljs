(ns dap.frontend.app)

(defn sum [a b]
  (+ a b))

(defn init []
  (sum 1 2)
  (println "Hello World"))

(ns try-clj-interop.hello)
(gen-class
  :name try_clj_interop.Hello
  :methods [^:static [hello [String] void]])

(defn- -hello
  [msg]
  (println (str "Hello " msg)))

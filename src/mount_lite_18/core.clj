(ns mount-lite-18.core
  (:require [mount.lite :as mount]
            [mount.extensions.namespace-deps :as namespace-deps]
            mount-lite-18.a))

(defn -main
  "I don't do a whole lot."
  [& args]
  (prn (mount/status))
  (prn (namespace-deps/start))
  (prn (mount/status)))

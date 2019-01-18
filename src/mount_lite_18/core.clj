(ns mount-lite-18.core
  (:require [mount.lite :as mount]
            [mount.extensions.namespace-deps :as namespace-deps]
            mount-lite-18.a))

(defn -main
  "I don't do a whole lot."
  [& args]
  (prn (mount/status))
  ;; Start up to a, should also start c because it's needed for a
  (prn (namespace-deps/start #'mount-lite-18.a/a))
  (prn (mount/status)))

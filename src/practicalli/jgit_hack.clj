(ns practicalli.jgit-hack
  (:gen-class))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))


;;Call `cider-find-var` emacs function to jump to definition
;;(org.eclipse.jgit.annotations.NonNull)

(ns fpluk.core
  (:gen-class)
  (:require [fpluk.heron :as heron])
  (:require [fpluk.db :as db])
  (:require [fpluk.treeroot :as v3])
  (:require [fpluk.euler5 :as euler5]))



(defn -main
  [& args]
  (println "Clojure programs:")
  (println "1.-------------------------------------------")
  (print "heron: y(1) x(300) steps(5) = ")
  (println (double (heron/heron-sqrt-steps 1 300 5)))
  (print "heron: y(5) x(25) steps(0) = ")
  (println (double (heron/heron-sqrt-steps 5 25 0)))

  (println "2.-------------------------------------------")
  (print "(1) (35) = ")
  (println (double (v3/heron-cube 1 35)))
  (print "(10) (10) = ")
  (println (double (v3/heron-cube 10 10)))


  (println "3.-------------------------------------------")
  (println (str "euler5 = " (euler5/euler 2520)))
  (time (euler5/euler 2520))

  (println "4.-------------------------------------------")
  (db/add-person! "gmail@gmail.com" "Go" "Ogle" "Lodz" "Piotrkowska" "21/37" "90-321")
  (println (str (db/first-name "gmail@gmail.com") " "
                (db/last-name "gmail@gmail.com") " - "
                (db/address "gmail@gmail.com")))
  (db/add-person! "lukasz@gmail.com" "Lukasz" "Pietr" "Lodz" "Piotrkowska" "45/645" "90-321")
  (println (str (db/first-name "lukasz@gmail.com") " "
                (db/last-name "lukasz@gmail.com") " - "
                (db/address "lukasz@gmail.com")))
  )




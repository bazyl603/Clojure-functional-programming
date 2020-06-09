(ns fpluk.treeroot)

(def precision 0.1)

(defn cube [x]
  (* x x x))

(defn abs
  [x]
  (if (neg? x) (- x) x))

(defn good-enough?
  [y x]
  (< (abs (- x (cube y))) precision))
;;abs zwraza wartość bezwzględną

(defn improve
  [y x]
  (/ (+ (/ x (* y y )) (* y 2)) 3))
;;(x/(y*y) + 2y) /3  Exercise 1.8  https://mitpress.mit.edu/sites/default/files/sicp/full-text/book/book-Z-H-10.html

(defn heron-cube
  [y x]
  (if (good-enough? y x)
    y

    (heron-cube (improve y x) x)))


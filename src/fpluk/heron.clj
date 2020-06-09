(ns fpluk.heron)

;; liczba kroków 0
(defn steps-limit?
  [steps]
  (= 0 steps))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [y x]
  (avg y (/ x y)))

(defn heron-sqrt-steps
  [y x steps]
  (if (steps-limit? steps)
    y

    (heron-sqrt-steps (improve y x) x (dec steps))))







;;(defn square
;;  [x]
;;  (* x x))


;;(defn abs
;;  [x]
;;  (if (< x 0)
;;    (- x)
;;    x))

;;(defn good-enough?
;;  [y x]
;;  (< (abs (- x (square y))) 0.00001))

;;(defn avg
;;  [x y]
;;  (/ (+ x y) 2))

;;(defn improve
;;  [y x]
;;  (avg y (/ x y)))

;;(defn heron-sqrt
;;  [y x]
;;  (if (good-enough? y x)
;;    y

;;    (heron-sqrt (improve y x) x)))

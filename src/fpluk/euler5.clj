(ns fpluk.euler5)

(defn var20
  [number]
  (+ number 20))

(defn remainder
  [sm-number]
  (reduce + (map mod (repeat 20 sm-number) (range 2 21))))

(defn euler
  [number]
  (if (zero? (remainder number))
    number
    (recur (var20 number)))
  )

;;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

;;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
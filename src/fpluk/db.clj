(ns fpluk.db)

(defonce persons-atom (atom {}))

(defn add-person!
  [email first-name last-name city street nr-street post-code]
  (swap! persons-atom assoc
         email {:first-name first-name
                :last-name   last-name
                :city city
                :street street
                :nr-street nr-street
                :post-code post-code}
         ))

(defn first-name
  [email]
  (:first-name (@persons-atom email)))

(defn last-name
  [email]
  (:last-name (@persons-atom email)))

(defn address
  [email]
  (str (:street (@persons-atom email))    " "
       (:nr-street (@persons-atom email)) " "
       (:city (@persons-atom email)) ", "
       (:post-code (@persons-atom email))))
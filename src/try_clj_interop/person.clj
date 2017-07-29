(ns try-clj-interop.person)
(gen-class
  :name try_clj_interop.Person
  :state state
  :init init
  :prefix "-"
  :main false
  :constructors {[]              []
                 [String]        []
                 [String String] []}
  :methods [[setCountry [String] void]
            [getCountry [] String]
            [setName [String] void]
            [getName [] String]])

(defn -init
  ([] [[] (atom {:name nil :country nil})])
  ([name] [[] (atom {:name name :country nil})])
  ([name country] [[] (atom {:name name :country country})]))

(defn set-value
  [this key value]
  (swap! (.state this) into {key value}))

(defn get-value
  ([this key]
   (@(.state this) key)))

(defn -setName
  [this name]
  (set-value this :name name))

(defn -getName
  [this]
  (get-value this :name))

(defn -setCountry
  [this country]
  (set-value this :country country))

(defn -getCountry
  [this]
  (get-value this :country))

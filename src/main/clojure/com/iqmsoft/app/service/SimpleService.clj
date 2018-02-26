(ns com.iqmsoft.app.service.SimpleService
  (:import (org.springframework.web.bind.annotation RestController RequestMapping RequestMethod)))

;; Class definition

(gen-class
  :name ^{RestController {} 
          RequestMapping {:value ["simple"]} } com.iqmsoft.app.service.SimpleService 
  :methods [[^{RequestMapping {:value ["simple"] :method [RequestMethod/GET]}} greet [] Object ]
            ]
  :state injected
  :init init)

;; Response types

(defrecord Address [^String street ^String city])

(defrecord GreetResponse [^String person 
                          ^String stuff 
                          ^long things 
                          ^Address address])

;; Business logic functions

; TODO

;; Class method implementations
(defn -init 
  "Initialize the class by setting the state to an empty map, which can be populated with injected dependencies."
  []
  [[] (atom {})])


(defn -greet
  "Handler for the /simple/simple resource using defrecord."
  [this]
  (GreetResponse. "A test" "of defrecord" 12345 (Address. "123 fake" "Springfield")))
  ;(str "This is a greeting " (:player-repo @(.injected this) )))



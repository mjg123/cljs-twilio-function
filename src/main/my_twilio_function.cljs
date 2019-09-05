(ns my-twilio-function
  (:require-macros [hiccups.core :as hiccups :refer [html]])
  (:require [hiccups.runtime :as hiccupsrt]
            [quotes :as q]))

(defn my-function [context event callback]
  
  (callback nil
            (doto (new js/Twilio.Response)
              (.appendHeader "content-type" "application/xml")
              (.setBody (html [:Response
                               [:Message
                                (rand-nth q/hickey-quotes)]])))))

(ns my-twilio-function
  (:require-macros [hiccups.core :as hiccups :refer [html]])
  (:require [hiccups.runtime :as hiccupsrt]))

(defn my-function [context event callback]
 
  (callback nil
            (doto (new js/Twilio.Response)
              (.appendHeader "content-type" "application/xml")
              (.setBody (html [:Response
                               [:Message "This is a ClojureScript Function!"]])))))

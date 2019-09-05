(ns my-twilio-function)

(defn my-function [context event callback]
  (callback nil "This is a ClojureScript Function!"))

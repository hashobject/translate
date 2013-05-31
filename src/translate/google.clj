(ns translate.google
  (:require [clojure.string :as string]
            [clj-http.client :as http]))

(defn empty-str [] "")

(defn translate [s options]
  (if (string/blank? s) (empty-str)
    (:translatedText (first (:translations (:data (:body (http/post "https://www.googleapis.com/language/translate/v2"
            {:as :json
             :debug true
             :headers {"X-HTTP-Method-Override" "GET"}
             :form-params {"key" (:key options)
                           "source" (:source options)
                           "target" (:target options)
                           "q" s}}))))))))

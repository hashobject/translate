(ns translate.google
  (:require [clojure.string :as string]
            [clj-http.client :as http]))

(defn empty-str [] "")

(defn translate [s options]
  (if (string/blank? s) (empty-str)
    (let [params {"key" (:key options)
                  "source" (:source options)
                  "target" (:target options)
                  "q" s}
          resp (http/post "https://www.googleapis.com/language/translate/v2"
                  {:as :json
                   :debug true
                   :headers {"X-HTTP-Method-Override" "GET"}
                   :form-params params})]
      (:translatedText (first (:translations (:data (:body resp))))))))

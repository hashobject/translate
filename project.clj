(defproject translate "0.3.0"
  :description "Translate library in Clojure. Google Translate API v2 support."
  {:signing {:gpg-key "HashObject Ltd <team@hashobject.com>"}}
  :url "https://github.com/hashobject/translate"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.2"]])

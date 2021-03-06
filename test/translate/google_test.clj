(ns translate.google-test
  (:use clojure.test
        translate.google))

(deftest empty-str-text-test
  (testing "Empty string expected if text is empty string"
    (is (= "" (translate "" {})))))


(deftest nil-text-test
  (testing "Empty string expected if text is nil"
    (is (= "" (translate nil {})))))


(comment
  ; this code is commented because you need to specify your own Google Translate API key.
  (deftest hello-text-test
    (testing "Hello should be ¡Hola in Spanish"
      (is (= "¡Hola" (translate "Hello"
                   {:key "your google translate key"
                    :source "en"
                    :target "es"})))))
  (deftest hola-text-test
    (testing "Hola should be Hello in English"
      (is (= "Hello" (translate "Hola"
                   {:key "your google translate key"
                    :source "es"
                    :target "en"})))))
  )




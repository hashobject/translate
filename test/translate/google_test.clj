(ns translate.google-test
  (:use clojure.test
        translate.google))

(deftest empty-str-text-test
  (testing "Empty string expected if text is empty string"
    (is (= "" (translate "" {})))))


(deftest nil-text-test
  (testing "Empty string expected if text is nil"
    (is (= "" (translate nil {})))))
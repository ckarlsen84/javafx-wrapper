(defproject javafx-wrapper "0.1.1"
  :description  "Very thin wrapper around JavaFX objects"

  :url          "https://github.com/mtnygard/javafx-wrapper"

  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [org.clojure/tools.macro "0.1.2"]]

  :plugins      [[codox "0.8.10"]]

  :aot          :all)

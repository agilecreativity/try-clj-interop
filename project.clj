(defproject try-clj-interop "0.1.0-SNAPSHOT"
  :description "Clojure-Java interop example project."
  :url "https://github.com/agilecreativity/try-clj-interop"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src/java"]
  :source-paths ["src/clj"]
  :aot [try-clj-interop.hello]
  :prep-tasks [["compile" "try-clj-interop.hello" "try-clj-interop.person"]
               "javac" "compile"]

  ;;:main try-clj-interop.TestHello
  :main try_clj_interop.TestPerson
  :dependencies [[org.clojure/clojure "1.8.0"]])

(defproject onyx-redis "0.7.0.4"
  :description "Onyx plugin for redis"
  :url "FIX ME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.onyxplatform/onyx "0.7.4-SNAPSHOT"]
                 [com.taoensso/carmine "2.11.1" :exclusions [com.taoensso/timbre]]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :profiles {:dev {:dependencies [[midje "1.7.0"]]
                   :plugins [[lein-midje "3.1.3"]
                             [lein-set-version "0.4.1"]
                             [lein-pprint "1.1.1"]]}
             :circle-ci {:jvm-opts ["-Xmx4g"]}}
  :jvm-opts ["-XX:-OmitStackTraceInFastThrow"])

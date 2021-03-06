(defproject pedestal-api "0.2.0-SNAPSHOT"
  :description "A batteries-included API for Pedestal using Swagger"
  :url "https://github.com/oliyh/pedestal-api"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[frankiesardo/route-swagger "0.1.0"]]
  :repl-options {:init-ns user}
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.8.0"]
                                       [io.pedestal/pedestal.service "0.4.1"]]}
             :dev {:source-paths ["dev" "example"]
                   :dependencies [[potemkin "0.4.3"]
                                  [org.clojure/tools.namespace "0.2.5"]
                                  [io.pedestal/pedestal.jetty "0.4.1"]
                                  [clj-http "2.0.1"]

                                  [ch.qos.logback/logback-classic "1.1.2"
                                   :exclusions [org.slf4j/slf4j-api]]
                                  [org.slf4j/jcl-over-slf4j "1.7.7"]
                                  [org.slf4j/jul-to-slf4j "1.7.7"]
                                  [org.slf4j/log4j-over-slf4j "1.7.7"]]}}

  ;; for heroku deployment of example
  :min-lein-version "2.0.0"
  :plugins [[lein-sub "0.3.0"]]
  :sub ["example"]
  :aliases {"uberjar" ["sub" "uberjar"]}
  :uberjar-name "")

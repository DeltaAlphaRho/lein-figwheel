(defproject figwheel-example "0.1.0-SNAPSHOT"
  :description "Just an example of using the lein-figwheel plugin"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [sablono "0.2.16"]
                 [crate "0.2.4"]
                 [jayq "2.4.0"]
                 [figwheel "0.1.4-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-figwheel "0.1.4-SNAPSHOT"]]

  :source-paths ["src"] 
  
  :resource-paths ["resources" "other_resources"]
  
  :cljsbuild {
              :builds [{ :id "example"
                         :source-paths ["src"]
                         :compiler { :output-to "resources/public/js/compiled/example.js"
                                     :output-dir "resources/public/js/compiled/out"
                                     :optimizations :none}}]}
  
  :figwheel {
             :http-server-root "public" ;; default and assumes "resources" 
             :server-port 3449 ;; default
             :css-dirs ["resources/public/css"]
             :ring-handler example.server/handler
             })


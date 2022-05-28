(ns oo-reagent.main
  (:require [oo-reagent.core :as core]
            [reagent.dom]))

;; (defn ^:export init []
;;   (js/console.log "hello"))

;; (defn ^:dev/after-load after-reload []
;;   (js/console.log ""))

(enable-console-print!)

(defn mount []
  (reagent.dom/render [#'core/main-ui] (.getElementById js/document "app")))

(defn ^:export run []
  (mount))

(defn ^:dev/after-load after-reload []
  (mount))

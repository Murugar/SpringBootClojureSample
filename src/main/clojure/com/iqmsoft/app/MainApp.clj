(ns com.iqmsoft.app.MainApp)

(gen-class 
  :name ^{org.springframework.boot.autoconfigure.SpringBootApplication []} com.iqmsoft.app.MainApp
  :main  true)

(defn -main
  [  ]
  (org.springframework.boot.SpringApplication/run (Class/forName "com.iqmsoft.app.MainApp") (into-array String '())))
  
  

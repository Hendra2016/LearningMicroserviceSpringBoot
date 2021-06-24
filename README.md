Tujuan project ini hanya di pergunakan untuk pembelajaran
jika ada yang ingin dalam lihat yang asli-nya dalam bahasa ingris bisa dilihat di channel ini https://www.youtube.com/watch?v=BnknNTN8icw

# LearningMicroserviceSpringBoot
di project belajar ini saya menggunakan 
  - spring boot
  - spring cloud
  - spring cloud gateway
  - spring eureka
  - spring Hystrix
  - Zipkin server
  - microservices

#Spring boot
didalam spring boot ini kita ada memiliki 2 web service yaitu : user dan department sebagai contoh, dan kita tidak menggunakan database, hanya untuk melihat struktur-nya untuk belajar.
 - User-Service
   didalam user service ini kita ada 2 webservice post dan get, dan dimana kita di service ini kita menggunakan rest-template untuk komunikasi antar service
 - Department-Service
   didalam department service ini kita ada 2 webservice post dan get

#Spring Cloud
didalam Spring cloud ini kita menggunakan git untuk configurasi setiap server yang terhubung ke eurika, atau hanya sebagai configurasi server

#Spring cloud gateway
didalam spring cloud gateway ini, kita hanya gunakan untuk routing dari API gateway ke masing-masing sub service yaitu user-service dan department-service, dan fallback message jika salah satu service dalam kondisi mati

#Spring eurika
didalam spring eurika ini kita hanya gunakan untuk monitoring service-service yang hidup.

#Spring Hystrix
didalam spring hystrix ini dipergunakan untuk memonitoring seluruh service baik service gateway, service user dan service department

#Zipkin server
didalam zipkin server ini kita untuk memonitoring logger-logger yang di gunakan ketika service tersebut di hit 

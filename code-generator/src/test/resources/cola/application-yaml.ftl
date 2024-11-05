server:
  port: 8084
spring:
  profiles:
    active: local
  application:
    name: micro-service-cola
logging:
  config: classpath:logback/logback-${r'${spring.profiles.active}'}.xml
# springdoc-openapi config
springdoc:
  swagger-ui:
    path: /swagger-ui.html
    tags-sorter: alpha
    operations-sorter: alpha
  api-docs:
    path: /v3/api-docs
  group-configs:
    - group: 'default'
      paths-to-match: '/**'
      packages-to-scan: ${package}.web
# knife4j config
knife4j:
  enable: true
  setting:
    language: zh_cn
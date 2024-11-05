# Spring boot actuator
management:
  endpoints:
    enabled-by-default: on
    web:
      base-path: /actuator
      exposure:
        include: '*'
  endpoint:
    health:
      show-components: always
      show-details: always
  health:
    defaults:
      enabled: on


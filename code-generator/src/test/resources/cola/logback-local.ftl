<configuration>
    <include resource="org/springframework/boot/logging/logback/defaults.xml" />

    <!--Define properties-->
    <property name="APP_NAME" value="start" />
    <property name="LOG_PATH" value="${r'${user.home}'}/${r'${APP_NAME}'}/logs" />
    <property name="LOG_FILE" value="${r'${LOG_PATH}'}/application.log" />

    <appender name="APPLICATION"
        class="ch.qos.logback.core.rolling.RollingFileAppender">
        <!--Log file path-->
        <file>${r'${LOG_FILE}'}</file>
        <encoder>
            <pattern>${r'${FILE_LOG_PATTERN}'}</pattern>
        </encoder>
        <rollingPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
            <fileNamePattern>${r'${LOG_FILE}'}.%d{yyyy-MM-dd}.%i.log</fileNamePattern>
            <maxHistory>7</maxHistory>
            <maxFileSize>50MB</maxFileSize>
            <totalSizeCap>20GB</totalSizeCap>
        </rollingPolicy>
    </appender>

    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>${r'${CONSOLE_LOG_PATTERN}'}</pattern>
            <charset>utf8</charset>
        </encoder>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE" />
        <appender-ref ref="APPLICATION" />
    </root>

    <!--Application log-->
    <logger name="${r'com.erpang.scaffold'}" level="DEBUG"/>

    <!--Datasource log-->
    <logger name="com.apache.ibatis" level="TRACE" additivity="false">
        <appender-ref ref="CONSOLE"/>
    </logger>
</configuration>

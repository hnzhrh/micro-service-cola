<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>${root_group_id}</groupId>
        <artifactId>${root_artifact_id}</artifactId>
        <version>${root_version}</version>
    </parent>

    <artifactId>${root_artifact_id}-client</artifactId>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!--COLA-->
        <dependency>
            <groupId>com.alibaba.cola</groupId>
            <artifactId>cola-component-dto</artifactId>
        </dependency>
        <!--COLA end-->

        <!--JSR 303-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
            <scope>provided</scope>
        </dependency>
        <!--JSR 303 end-->

        <!--Knife4j-->
        <dependency>
            <groupId>com.github.xiaoymin</groupId>
            <artifactId>knife4j-openapi3-jakarta-spring-boot-starter</artifactId>
            <scope>provided</scope>
        </dependency>
        <!--Knife4j end-->
    </dependencies>

</project>
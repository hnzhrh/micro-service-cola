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

    <artifactId>${root_artifact_id}-app</artifactId>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!--Module dependencies-->
        <dependency>
            <groupId>com.erpang.scaffold</groupId>
            <artifactId>${root_artifact_id}-client</artifactId>
        </dependency>
        <dependency>
            <groupId>com.erpang.scaffold</groupId>
            <artifactId>${root_artifact_id}-infrastructure</artifactId>
        </dependency>
        <!--Module dependencies end-->

        <!--COLA-->
        <dependency>
            <groupId>com.alibaba.cola</groupId>
            <artifactId>cola-component-catchlog-starter</artifactId>
        </dependency>
        <!--COLA end-->
    </dependencies>

</project>
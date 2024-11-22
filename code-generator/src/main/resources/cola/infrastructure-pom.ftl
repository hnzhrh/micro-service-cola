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

    <artifactId>${root_artifact_id}-infrastructure</artifactId>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!--Module dependencies-->
        <dependency>
            <groupId>${root_group_id}</groupId>
            <artifactId>${root_artifact_id}-domain</artifactId>
        </dependency>
        <!--Module dependencies end-->

        <#if mybatis_plus_spring_boot3_starter?has_content && com_baomidou?has_content>
        <!--MyBatis plus-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-spring-boot3-starter</artifactId>
        </dependency>
        <!--MyBatis plus end-->

        <!--MySQL driver-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <!--MySQL driver end-->

        </#if>
        <#if org_redisson?has_content && redisson_spring_boot_starter?has_content>
        <!--Redis-->
        <dependency>
            <groupId>org.redisson</groupId>
            <artifactId>redisson-spring-boot-starter</artifactId>
        </dependency>
        <!--Redis end-->

        </#if>
        <#if com_alibaba_cloud?has_content && spring_cloud_starter_alibaba_nacos_config?has_content>
        <!--Nacos config-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>
        <!--Nacos config end-->

        </#if>
        <#if com_alibaba_cloud?has_content && spring_cloud_starter_alibaba_nacos_config?has_content>
        <!--Nacos discovery-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
        <!--Nacos discovery end-->

        </#if>
        <#if com_alibaba_cloud?has_content && spring_cloud_starter_stream_rocketmq?has_content>
        <!--Rocket MQ-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-rocketmq</artifactId>
            <!--https://github.com/alibaba/spring-cloud-alibaba/issues/3880-->
            <exclusions>
                <exclusion>
                    <groupId>com.alibaba.fastjson2</groupId>
                    <artifactId>fastjson2</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <!--Rocket MQ end-->

        </#if>
    </dependencies>

</project>
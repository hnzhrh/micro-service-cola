<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>${root_group_id}</groupId>
    <artifactId>${root_artifact_id}</artifactId>
    <version>${root_version}</version>
    <packaging>pom</packaging>

    <modules>
        <module>${root_artifact_id}-adapter</module>
        <module>${root_artifact_id}-app</module>
        <module>${root_artifact_id}-client</module>
        <module>${root_artifact_id}-domain</module>
        <module>${root_artifact_id}-infrastructure</module>
        <module>${root_artifact_id}-start</module>
    </modules>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <cola.version>5.0.0</cola.version>
        <spring-boot.version>3.2.4</spring-boot.version>
        <spring-cloud.version>2023.0.1</spring-cloud.version>
        <spring-cloud-alibaba.version>2023.0.1.0</spring-cloud-alibaba.version>
        <mybatis-plus-starter.version>3.5.7</mybatis-plus-starter.version>
        <mysql-connect-java.version>8.0.26</mysql-connect-java.version>
        <redisson-spring-boot-starter.version>3.37.0</redisson-spring-boot-starter.version>
        <knife4j.version>4.4.0</knife4j.version>
        <fastjson.version>1.2.83</fastjson.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <dependencyManagement>
        <dependencies>
            <!--Project modules-->
            <dependency>
                <groupId>${root_group_id}</groupId>
                <artifactId>${root_artifact_id}-adapter</artifactId>
                <version>${r'${project.version}'}</version>
            </dependency>
            <dependency>
                <groupId>${root_group_id}</groupId>
                <artifactId>${root_artifact_id}-app</artifactId>
                <version>${r'${project.version}'}</version>
            </dependency>
            <dependency>
                <groupId>${root_group_id}</groupId>
                <artifactId>${root_artifact_id}-client</artifactId>
                <version>${r'${project.version}'}</version>
            </dependency>
            <dependency>
                <groupId>${root_group_id}</groupId>
                <artifactId>${root_artifact_id}-domain</artifactId>
                <version>${r'${project.version}'}</version>
            </dependency>
            <dependency>
                <groupId>${root_group_id}</groupId>
                <artifactId>${root_artifact_id}-infrastructure</artifactId>
                <version>${r'${project.version}'}</version>
            </dependency>
            <!--Project modules end-->

            <!--COLA-->
            <dependency>
                <groupId>com.alibaba.cola</groupId>
                <artifactId>cola-components-bom</artifactId>
                <version>${r'${cola.version}'}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--COLA end-->

            <!--Spring cloud alibaba-->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>${r'${spring-boot.version}'}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${r'${spring-cloud.version}'}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>${r'${spring-cloud-alibaba.version}'}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--Spring cloud alibaba start-->

            <#if mybatis_plus_spring_boot3_starter?has_content && com_baomidou?has_content>
            <!--MyBatis plus-->
            <dependency>
                <groupId>com.baomidou</groupId>
                <artifactId>mybatis-plus-spring-boot3-starter</artifactId>
                <version>${r'${mybatis-plus-starter.version}'}</version>
            </dependency>
            <!--MyBatis plus end-->

            <!--MySQL driver-->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${r'${mysql-connect-java.version}'}</version>
            </dependency>
            <!--MySQL driver end-->

            </#if>
            <#if org_redisson?has_content && redisson_spring_boot_starter?has_content>
            <!--Redis-->
            <dependency>
                <groupId>org.redisson</groupId>
                <artifactId>redisson-spring-boot-starter</artifactId>
                <version>${r'${redisson-spring-boot-starter.version}'}</version>
            </dependency>
            <!--Redis end-->

            </#if>
            <!--Knife4j-->
            <dependency>
                <groupId>com.github.xiaoymin</groupId>
                <artifactId>knife4j-openapi3-jakarta-spring-boot-starter</artifactId>
                <version>${r'${knife4j.version}'}</version>
            </dependency>
            <!--Knife4j end-->

            <!--Misc-->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>fastjson</artifactId>
                <version>${r'${fastjson.version}'}</version>
            </dependency>
            <!--Misc end-->
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-archetype-plugin</artifactId>
                <version>3.2.0</version>
            </plugin>
        </plugins>
        <pluginManagement>
            <plugins>
                <plugin>
                    <artifactId>maven-resources-plugin</artifactId>
                    <version>3.3.0</version>
                </plugin>
                <plugin>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.10.1</version>
                </plugin>
                <plugin>
                    <artifactId>maven-source-plugin</artifactId>
                    <version>3.2.1</version>
                </plugin>
                <plugin>
                    <artifactId>maven-javadoc-plugin</artifactId>
                    <version>3.4.0</version>
                </plugin>
                <plugin>
                    <artifactId>maven-deploy-plugin</artifactId>
                    <version>3.0.0</version>
                </plugin>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                    <version>${r'${spring-boot.version}'}</version>
                    <configuration>
                        <excludes>
                            <exclude>
                                <groupId>org.projectlombok</groupId>
                                <artifactId>lombok</artifactId>
                            </exclude>
                        </excludes>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>

</project>
<!-- Improved compatibility of back to top link: See: https://github.com/hnzhrh/micro-service-cola/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/hnzhrh/micro-service-cola">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Micro-Service-Cola</h3>

  <p align="center">
    A micro service version of cola architecture.
    <br />
    <a href="https://github.com/hnzhrh/micro-service-cola"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/hnzhrh/micro-service-cola">View Demo</a>
    ·
    <a href="https://github.com/hnzhrh/micro-service-cola/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/hnzhrh/micro-service-cola/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This project is a scaffold for a **microservice** version of a Maven project built on the **COLA** structure, allowing you to quickly set up a development environment using Maven Archetype.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* [![Java 17][JDK]][JDK-url]
* [![Maven][Maven]][Maven-url]
* [![Spring Boot][SpringBoot]][SpringBoot-url]
* [![MySQL][MySQL]][MySQL-url]
* [![Redis][Redis]][Redis-url]
* [![Nacos][Nacos]][Nacos-url]
* [![RocketMQ][RocketMQ]][RocketMQ-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* JDK 17
* Maven
* MySQL 8.0 (optional)
* Redis 7.0 (optional)
* Nacos v2.3.2 (optional)
* RocketMQ 5.1.4 (optional)

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/hnzhrh/micro-service-cola.git
   ```
2. Install the archetype to local repo
   ```shell
   cd ./micro-service-cola-archetype
   mvn install
   ```
Now you can use this archetype to create the new project.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

Before creating your project, please replace `${groupId}`, `${artifactId}`, `${package}`, and `${version}` with your own values.

```shell
mvn archetype:generate -DgroupId=${groupId} -DartifactId=${artifactId} -Dversion=1.0.0 -Dpackage=${package} -DarchetypeArtifactId=micro-service-cola-archetype -DarchetypeGroupId=com.erpang.scaffold -DarchetypeVersion=1.0.0 -DarchetypeCatalog=local
```



[//]: # (_For more examples, please refer to the [Documentation]&#40;https://example.com&#41;_)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [x] Init the project module
- [x] Integrate Spring Boot
- [x] Integrate COLA
- [x] Integrate middleware
  - [x] MySQL
  - [x] Redis
  - [x] RocketMQ
- [x] Integrate Spring cloud alibaba.
  - [x] Nacos
    - [x] Config
    - [x] Discovery
  - [ ] Sentinel
  - [ ] Seata
- [ ] Schedule tasks
  - [ ] Spring schedule tasks.
- [ ] Integrate monitor
  - [x] Spring Boot Actuator
  - [ ] Prometheus
- [ ] Integrate observability platform
  - [ ] Skywalking
- [ ] Integrate development tools
  - [x] Swagger and Knife4j
- [ ] Generator
  - [x] Maven archetype
  - [ ] Generator
    - [x] Implement a JSON-configurable strategy for generating directory structures.
    - [ ] Implement a configurable strategy for generating template files.
    - [ ] Support more archetype.
    - [ ] File download.

See the [open issues](https://github.com/hnzhrh/micro-service-cola/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Top contributors:

<a href="https://github.com/hnzhrh/micro-service-cola/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=hnzhrh/micro-service-cola" alt="contrib.rocks image" />
</a>

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Erpang - hnzhrh@gmail.ccom

Project Link: [https://github.com/hnzhrh/micro-service-cola](https://github.com/hnzhrh/micro-service-cola)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* COLA
  * [GitHub-COLA](https://github.com/alibaba/COLA)
  * [复杂度应对之道 - COLA应用架构](https://blog.csdn.net/significantfrank/article/details/85785565)
  * [应用架构COLA 2.0](https://blog.csdn.net/significantfrank/article/details/100074716)
  * [应用架构COLA3.0：让事情回归简单](https://blog.csdn.net/significantfrank/article/details/106976804)
  * [应用架构COLA 3.1：分类思维](https://blog.csdn.net/significantfrank/article/details/109529311)
  * [COLA 4.0：应用架构的最佳实践](https://blog.csdn.net/significantfrank/article/details/110934799)
* Spring cloud alibaba
  * [Spring cloud alibaba sca](https://sca.aliyun.com/?spm=5176.29160081.0.0.6df9122ewcKeb1)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/hnzhrh/micro-service-cola.svg?style=for-the-badge
[contributors-url]: https://github.com/hnzhrh/micro-service-cola/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/hnzhrh/micro-service-cola.svg?style=for-the-badge
[forks-url]: https://github.com/hnzhrh/micro-service-cola/network/members
[stars-shield]: https://img.shields.io/github/stars/hnzhrh/micro-service-cola.svg?style=for-the-badge
[stars-url]: https://github.com/hnzhrh/micro-service-cola/stargazers
[issues-shield]: https://img.shields.io/github/issues/hnzhrh/micro-service-cola.svg?style=for-the-badge
[issues-url]: https://github.com/hnzhrh/micro-service-cola/issues
[license-shield]: https://img.shields.io/github/license/hnzhrh/micro-service-cola.svg?style=for-the-badge
[license-url]: https://github.com/hnzhrh/micro-service-cola/blob/master/LICENSE.txt

[JDK]: https://img.shields.io/badge/OpenJDK-17-grey?style=for-the-badge&logo=openjdk&logoColor=white&labelColor=grey
[JDK-url]: https://openjdk.org/
[Maven]: https://img.shields.io/badge/Maven-3.9.8-C71A36?style=for-the-badge&logo=apachemaven&logoColor=C71A36&labelColor=grey
[Maven-url]: https://maven.apache.org/
[SpringBoot]: https://img.shields.io/badge/SpringBoot-3.2.4-6DB33F?style=for-the-badge&logo=springboot&logoColor=6DB33F&labelColor=grey
[SpringBoot-url]: https://spring.io/projects/spring-boot
[MySQL]: https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=4479A1&labelColor=grey
[MySQL-url]: https://www.mysql.com/
[Redis]: https://img.shields.io/badge/Redis-7.0-FF4438?style=for-the-badge&logo=mysql&logoColor=FF4438&labelColor=grey
[Redis-url]: https://redis.io/
[Nacos]: https://img.shields.io/badge/Nacos-v2.3.2-black?style=for-the-badge&labelColor=grey
[Nacos-url]: https://nacos.io/
[RocketMQ]: https://img.shields.io/badge/RocketMQ-5.1.4-D77310?style=for-the-badge&logo=apacherocketmq&logoColor=#D77310&labelColor=grey
[RocketMQ-url]: https://rocketmq.apache.org/


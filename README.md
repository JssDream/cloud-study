# cloud-study

Spring Cloud Study

- Eureka/Zookeeper
- Actuator
- Ribbon
- Feign/OpenFeign
- Hystrix/Sentinel
- Zuul/Gateway
- SpringCloud Admin
- 配置中心：Config
- 链路追踪：Sleuth/Zipkin

----

- Nacos
- Dubbo
- MQ:Kafka、RocketMQ
- 分布式事务: Seata CAP

# Spring Cloud

### 概念

Spring Cloud是实现微服务架构的一系列框架的有机集合。

是在Spring Boot基础上构建的，用于简化分布式系统构建的工具集。是拥有众多子项目的项目集合。利用Spring Boot的开发便利性，巧妙地简化了分布式系统基础设施（服务注册与发现、熔断机制、网关路由、配置中心、消息总线、负载均衡、链路追踪等）的开发。

### 整体架构

> 《Spring Cloud整体架构图》

组成：

1. 服务注册与发现组件：Eureka，Zookeeper，Consul,Nacos等。Eureka基于REST风格的。

2. 服务调用组件：Hystrix(熔断降级，在出现依赖服务失效的情况下，通过隔离 系统依赖服务  的方式，防止服务级联失败，同时提供失败回滚机制，使系统能够更快地从异常中恢复)，Ribbon（客户端负载均衡，用于提供客户端的软件负载均衡算法，提供了一系列完善的配置项：连接超时、重试等），OpenFeign（优雅的封装Ribbon，是一个声明式RESTful网络请求客户端，它使编写Web服务客户端变得更加方便和快捷）。

3. 网关：路由和过滤。Zuul，Gateway。

4. 配置中心：提供了配置集中管理，动态刷新配置的功能；配置通过Git或者其他方式来存储。

5. 消息组件：Spring Cloud Stream（对分布式消息进行抽象，包括发布订阅、分组消费等功能，实现了微服务之间的异步通信）和Spring Cloud Bus（主要提供服务间的事件通信，如刷新配置）

6. 安全控制组件：Spring Cloud Security 基于OAuth2.0开放网络的安全标准，提供了单点登录、资源授权和令牌管理等功能。

7. 链路追踪组件：Spring Cloud Sleuth（收集调用链路上的数据），Zipkin（对Sleuth收集的信息，进行存储，统计，展示）。

### 开发工具

可以选用工具：STS

https://spring.io/tools

### 目的

通过这个服务来看eureka注册中心的效果。

复习Spring Boot。

减少了大量配置。快速开发。

用Starter集成一个新框架。比如redis，web等。添加依赖，加配置文件。

嵌入式服务器，令开发和部署变的方便。

```
Spring Boot介绍：
https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/
```

### 代码步骤

1. pom.xml
2. application.yml
3. java代码
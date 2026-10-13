# Lilishop — Java Open Source B2B2C Mall System

[![License](https://img.shields.io/badge/license-AGPL--3.0-blue.svg)](./LICENSE)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-brightgreen.svg)](https://spring.io/projects/spring-boot)

<p align="right">
  <a href="./README.md">简体中文</a> | English
</p>

LiliShop is a Java open source ecommerce system built with Spring Boot, Spring Cloud, Vue, and Uniapp.

It supports:

- B2B2C multi-vendor marketplace
- Microservice architecture
- WeChat mini program
- Vue ecommerce frontend
- Uniapp mobile app
- Live streaming ecommerce
- Distribution & affiliate system
- Flash sale / coupon / promotion
- Docker deployment
- Private deployment
- Multi-language ecommerce platform

## Keywords

Java Mall System  
Open Source Ecommerce Platform  
Spring Boot Mall System  
Spring Cloud Ecommerce  
B2B2C Marketplace  
Multi Vendor Ecommerce Platform  
Vue Ecommerce System  
Uniapp Mall System  
Microservice Mall System  
Wechat Mini Program Mall  
Docker Ecommerce Deployment

**Lilishop** is a production-grade **Java open source ecommerce system** designed for the **B2B2C multi-vendor marketplace** use case. It is built on **Spring Boot 3** with a modular service architecture on the backend, and **Vue.js** plus **uni-app** on the frontend — one codebase delivers a PC web mall, an H5 site, a WeChat Mini Program, and Android / iOS native apps.

The system ships with the business modules a real marketplace needs out of the box: merchant onboarding, product and SKU management, order lifecycle, after-sales, promotions (flash sale, group buy, coupon, point), affiliate distribution, live-streaming commerce, visual storefront decoration, member tiers, and a multi-language back office. Docker images and `docker-compose` configs are provided for one-command private deployment to your own servers or a Kubernetes cluster.

**Typical use cases**: enterprise commerce platform, on-premise / private-cloud mall deployment, multi-vendor marketplace, Spring Boot / Spring Cloud microservice mall reference implementation, and Java ecommerce source code for learning and secondary development.

> **This repository**: Lilishop backend services (Spring Boot 3 / Java 21, multi-module Maven project). The web frontends, mobile client and infrastructure live in the sibling repos `lilishop-ui`, `lilishop-uniapp` and `docker`.

---

## Core Features

### Full Platform Support

One codebase supports:

- PC
- H5
- WeChat Mini Program
- Android APP
- iOS APP

### Microservice Architecture

Built with:

- Java 21
- Spring Boot 4
- Spring Cloud
- Redis (cache + async message queue)
- Docker

Supports distributed deployment and high concurrency ecommerce scenarios.

### Ecommerce Features

- Multi merchant marketplace
- Product management
- Order management
- Promotion system
- Coupon system
- Affiliate distribution
- Live streaming ecommerce
- Member system
- Points system
- Visual decoration
- Multi-language support

---

## Tech Stack

### Backend

- Java 21
- Spring Boot 4
- Spring Cloud
- MyBatis Plus
- MySQL
- Redis (cache + async message queue)
- JWT
- Docker

### Frontend

- Vue.js
- Uniapp
- Vuex
- Axios
- iView
- uViewUI

---

## Quick Start

The fastest path on this branch is the All-In-One image, which exposes one HTTP entrypoint and proxies backend traffic through `/api/`.

```bash
# Build standalone API modules from source.
mvn -pl buyer-api,manager-api,im-api -am -DskipTests package
```

Supported deployment on this branch is **standalone microservices** (`buyer-api` :8888, `manager-api` :8887 with embedded message consumer + scheduled tasks, `im-api` :8885). Async messages use a **Redis List queue** (no RocketMQ). Scheduled tasks use Spring `@Scheduled` (no XXL-Job Admin). The historical `lilishop-all` module has been removed.

---

## FAQ

### Does it support a true microservice architecture?

Yes. Each backend deployable module (`buyer-api`, `manager-api`, `im-api`) runs as its own Spring Boot process. Message consumption and scheduled jobs run inside `manager-api`. See `README.md` (Chinese) for `java -jar` commands.

### Can I deploy it with Docker and Kubernetes?

Yes. The `docker` repo provides installer scripts. [`deploy-api.yml`](./deploy-api.yml) defines three backend Deployments/Services (ports 8888/8887/8885). Run **one replica** of `manager-api` for message consumption and scheduled tasks.

### Does it support WeChat Mini Program and native mobile apps?

Yes. The buyer-facing client lives in the `lilishop-uniapp` repo and is built with **uni-app**, which compiles to H5, WeChat Mini Program, Alipay Mini Program, and Android / iOS native apps from a single codebase.

### What's the tech stack at a glance?

Java 21, Spring Boot, MyBatis-Plus, MySQL, Redis, Spring Security + JWT, Docker. Product search uses MySQL (Elasticsearch removed). Async messaging uses Redis queues. Scheduled tasks use Spring `@Scheduled`. Frontend: Vue for admin / seller / buyer / IM; uni-app for mobile.

---

## License

Lilishop is licensed under **AGPL-3.0** — see the [LICENSE](./LICENSE) file.

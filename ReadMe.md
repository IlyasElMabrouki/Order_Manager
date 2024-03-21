## Order Manager Application with Gateway, Config, and Discovery Services
This document provides an overview of the architecture and setup of a Spring Microservice application consisting of a Gateway service, Config service, and Discovery service, all integrated with Consul.

## Introduction
The Spring Microservice application follows a distributed architecture where various components communicate with each other via RESTful APIs. This setup enhances scalability, resilience, and ease of maintenance.

## Components

### Gateway Service
The Gateway service serves as an entry point for client requests and routes them to appropriate backend services. It handles authentication, routing, and load balancing. In our setup, we're using Spring Cloud Gateway.

### Config Service
The Config service centralizes configuration management for all microservices. It provides a single source of truth for configuration parameters, which can be dynamically updated without requiring service restarts. Spring Cloud Config is utilized for this purpose.


### Discovery Service
The Discovery service facilitates service registration, discovery, and load balancing. It enables services to locate and communicate with each other without hard-coded dependencies. We're using Consul for service discovery.

### Consul
Consul is a service mesh solution providing features for service discovery, configuration, and segmentation. It helps in connecting, securing, and observing services across distributed infrastructure.

USAGE
-----

> **NOTE** This usage assumes that user has already created and logged in to **Microsoft Azure Account**.

Steps:
1. Create Azure Resource Group. Please check section **CREATE RESOURCE GROUP**
1. Create Azure App Service. Please check section **CREATE APP SERVICE**
1. Create Azure App Service Deployment Center. Please check section **CREATE DEPLOYMENT CENTER**
1. Create Azure App Service Deployment Center Webhook. Please check section **CREATE WEBHOOK**
1. Delete Azure App Service. Please check section **DELETE APP SERVICE**
1. Delete Azure Resource Group. Please check section **DELETE RESOURCE GROUP**


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to work with **Microsoft Azure App Services** using **Azure Platform**. 

Azure Platform is web console for Azure Resources. Using this console user can work with Azure Resources via browser.

Azure App Service enables to deploy web application in Azure Cloud. 

This project presents:
* How to create Azure App Service type **Docker Container**. Docker Container means that Docker is used for deployment. 
* How to deploy **Java Spring Boot** application using **Azure App Services Deployment Center** and tool **Docker Compose**. It means that deployment in configured Docker Compose configuration file (many Docker Containers can be configured there). Additionally Docker Hub **Webhook** is configured - it means that every new Docker Image on Docker Hub will be automatically deployed on Azure Cloud.
* How to remove all Azure Resources after work.

##### Flow
The following flow takes place in this project:
1. User via any browser sends request to application for a content.
1. Application HelloWorld returns response with JSON containing message, port and UUID. This response is presented to User via browser.

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Java**: `https://docs.google.com/document/d/119VYxF8JIZIUSk7JjwEPNX1RVjHBGbXHBKuK_1ytJg4/edit?usp=sharing`
* **Maven**: `https://docs.google.com/document/d/1cfIMcqkWlobUfVfTLQp7ixqEcOtoTR8X6OGo3cU4maw/edit?usp=sharing`
* **Git**: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`
* **Spring Boot**: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`
* **Microsoft Azure**: `https://docs.google.com/document/d/1HaL4gve9FyrSS2Zi7NrhHN4Y2siD_sXJugnOuGhjhCc/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)

##### Preconditions - Actions
* Created Azure account
* Java Spring Boot application Source Code. Link: `https://github.com/wisniewskikr/java-springboot-helloworld`
* Java Spring Boot Docker Image deployed in Docker Hub repository. Link: `https://hub.docker.com/repository/docker/wisniewskikr/java-springboot-helloworld/general`


CREATE RESOURCE GROUP
---------------------

Azure link:
* https://azure.microsoft.com

![My Image](readme-images/create-rg-01.png)

![My Image](readme-images/create-rg-02.png)

![My Image](readme-images/create-rg-03.png)

![My Image](readme-images/create-rg-04.png)

![My Image](readme-images/create-rg-05.png)


CREATE APP SERVICE
------------------

Azure link:
* https://azure.microsoft.com

![My Image](readme-images/create-app-service-01.png)

![My Image](readme-images/create-app-service-02.png)

![My Image](readme-images/create-app-service-03.png)

![My Image](readme-images/create-app-service-04.png)

![My Image](readme-images/create-app-service-05.png)

![My Image](readme-images/create-app-service-06.png)

![My Image](readme-images/create-app-service-07.png)

![My Image](readme-images/create-app-service-08.png)

![My Image](readme-images/create-app-service-09.png)

![My Image](readme-images/create-app-service-10.png)


CREATE DEPLOYMENT CENTER
------------------------

Azure link:
* https://azure.microsoft.com

Docker Compose configuration file:

```
version: '3'

services:
  helloworld:
    image: wisniewskikr/java-springboot-helloworld
    container_name: helloworld-container
    ports:
      - 8080:8080
    networks:
      - helloworld-network

networks:
  helloworld-network:
    name: helloworld-network-name
```

![My Image](readme-images/create-deployment-center-01.png)

![My Image](readme-images/create-deployment-center-02.png)

![My Image](readme-images/create-deployment-center-03.png)

![My Image](readme-images/create-deployment-center-04.png)

![My Image](readme-images/create-deployment-center-05.png)

![My Image](readme-images/create-deployment-center-06.png)


CREATE WEBHOOK
--------------

Azure link:
* https://azure.microsoft.com

![My Image](readme-images/create-webhook-01.png)

![My Image](readme-images/create-webhook-02.png)

![My Image](readme-images/create-webhook-03.png)

![My Image](readme-images/create-webhook-04.png)

![My Image](readme-images/create-webhook-05.png)

![My Image](readme-images/create-webhook-06.png)

![My Image](readme-images/create-webhook-07.png)

![My Image](readme-images/create-webhook-08.png)

![My Image](readme-images/create-webhook-09.png)

![My Image](readme-images/create-webhook-10.png)

![My Image](readme-images/create-webhook-11.png)

![My Image](readme-images/create-webhook-12.png)

![My Image](readme-images/create-webhook-13.png)

![My Image](readme-images/create-webhook-14.png)


DELETE APP SERVICE
------------------

Azure link:
* https://azure.microsoft.com

![My Image](readme-images/delete-app-service-01.png)

![My Image](readme-images/delete-app-service-02.png)

![My Image](readme-images/delete-app-service-03.png)

![My Image](readme-images/delete-app-service-04.png)


DELETE RESOURCE GROUP
---------------------

Azure link:
* https://azure.microsoft.com

![My Image](readme-images/delete-rg-01.png)

![My Image](readme-images/delete-rg-02.png)

![My Image](readme-images/delete-rg-03.png)

![My Image](readme-images/delete-rg-04.png)

![My Image](readme-images/delete-rg-05.png)
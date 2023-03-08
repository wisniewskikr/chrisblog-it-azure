USAGE
-----

> **NOTE** This usage assumes that user has already created and logged in to **Microsoft Azure Account**.

Steps:
1. Create Azure Resource Group. Please check section **CREATE RESOURCE GROUP**
1. Create Azure App Service. Please check section **CREATE APP SERVICE**
1. Create Azure App Service Deployment Center. Please check section **CREATE DEPLOYMENT CENTER**
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
* How to deploy **Java Spring Boot** application using **Azure App Services Deployment Center** from **Azure Container Registry** repository. It means that Docker Image is stored in Azuer Container Registry.
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

![My Image](readme-images/create-deployment-center-01.png)

![My Image](readme-images/create-deployment-center-02.png)

![My Image](readme-images/create-deployment-center-03.png)

![My Image](readme-images/create-deployment-center-04.png)

![My Image](readme-images/create-deployment-center-05.png)

![My Image](readme-images/create-deployment-center-06.png)


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
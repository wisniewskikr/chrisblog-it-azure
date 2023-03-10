USAGE
-----

> **NOTE** This usage assumes that user has already created and is logged in to **Azure account**.

Steps:
1. (Optional) Check Azure Resource Group commands with `az group -h`
1. (Optional) Check Azure Resource Group type "create" commands with `az group create -h`
1. (Optional) Check Azure Resource Group type "delete" commands with `az group delete -h`
1. Create Azure Resource Group with `az group create -l eastus -n helloworld-rg`
1. Clean up:
     *  Delete Azure Resource Group with `az group delete -n helloworld-rg --yes`



DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create and delete **Microsoft Azure Resource Groups** using **Azure Cli**.

##### Terminology
Terminology explanation:
* **Azure Cli**: it's tool which enables managing of Azure Resources via commands
* **Azure Resource Groups**: it's container for Azure Resources. Any Azure Resource should be part of some Resource Group. 

##### Flow
The following flow takes place in this project:
1. User creates Azure Resource Group via Azure Cli
1. User deletes Azure Resource Group via Azure Cli

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Microsoft Azure**: `https://docs.google.com/document/d/1HaL4gve9FyrSS2Zi7NrhHN4Y2siD_sXJugnOuGhjhCc/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Azure Cli** (tested on version 2.46.0)

##### Preconditions - Actions
* Created Azure Account
* Logged in to Azure Account via Azure Cli
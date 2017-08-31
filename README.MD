# ADH Search Engine

For SE 6362/001 - Advanced Software Architecture and Design
Preliminary Project Plan (Phase 0)

By ADH Team

[Team Website](http://paris.utdallas.edu/adhteam/)

Submitted as deliverable 0 of course SE 6362/001 2017 Fall Semester 1 on 8/30/17 


## Introduction

This document presents the overview, organization, and managerial and technical process associated to our search engine.
Final product of our project is going to be a simple, yet powerful and fast, (web) search engine. We call the resulting
system ADH Search Engine. Roughly speaking, the system crawls web pages (as many as possible) and indexes keywords found
in them. It later consults the index to answer queries. Furthermore, it uses a variant of Google’s PageRank Algorithm to
rank its output, so that pages with higher rank will appear first in the search output.

### Deliverables
|**Deliverable No.**|**Date**  |**Description**                                     |
|:-----------------:|:--------:|:--------------------------------------------------:|
|0                  |31-Aug-17 |Preliminary project plan (present document)         |
|1                  |28-Sep-17 |Interim Project I submission & presentation         |
|2                  |10-Oct-17 |Final Project I submission                          |
|3                  |9-Nov-17  |Interim Project II submission                       |
|4                  |28-Nov-17 |Final Project II submission, presentation and demo  |

### Definitions, acronyms and abbreviations
|**Word**|**Definition**             |
|-------:|:--------------------------|
|CSS	 |Cascading Style Sheets     |
|GUI	 |Graphical User Interface   |
|DBMS	 |Database Management System |
|OS	     |Operating System           |
|HTML	 |Hyper Text Markup Language |
|J2EE	 |Java 2 Enterprise Edition  |
## Organization
In this section, we are going elaborate on process model and team organization.

### Process Model
We are going to adapt Waterfall process model. Therefore, we are going through Communication (to gather and analyze user
requirements), Planning (to plan and identify risks), Modeling (to do architectural and detailed design), Construction (to
implement and test), Deployment (to deploy the final product) phases.

### Team Organization
The team ADH  comprises of three members: Ali Ghanbari, Dongcheng Li, and Haoliang Wang. Management in our team is going to pass
from one member to another in a periodic manner. The role of manager will be to monitor activities of the team, and will decide if
the team is progressing as it is supposed to. Besides transient responsibilities (such as management) we have fixed responsibilities
as well. For example, Ali will always be responsible for revising final deliverables, Haoliang is going to be the fixed maintainer of
the team website (also its database and all other on-line issues regarding the team website), and Dongcheng will be assigned to the fixed
responsibility of conducting thorough tests on the final implementation. Finally, we need to mention that all the team members will be
equally involved in design and implementation activities.

## Technical Perspective
In this section we are going to present technical presents related to the project. These include the tools, programming frameworks, and programming languages that we are going to use.

### Tools & Frameworks
The following table lists the tools that we are going to use in our project.

|**Tool**               |**Purpose**                                            |
|:---------------------:|:-----------------------------------------------------:|
|Eclipse	            |Java IDE                                               |
|Apache Ant             |Code Building                                          |
|MS Win Server 2003 R2	|Our server OS                                          |
|MySQLi                 |Our DBMS                                               |
|MS Outlook and WeChat	|Communication among team members                       |
|MS Word	            |Typesetting documents of the project                   |
|MS Excel	            |Maintaining data and charts                            |
|MS PowerPoint	        |Presenting the results of each phase of the project    |
|MS Project             |Planning the activities of the project                 |
|GitHub                 |Storing our project in a shared repository             |

Finally, the following the table lists all the programming/scripting languages and frameworks that we are going to use in our project.

|**Language/Framework** |**Purpose**                                                |
|:---------------------:|:---------------------------------------------------------:|
|Java	                |Implementation of the project                              |
|J2EE	                |Taking advantage of its API for our multitier architecture |
|JUnit                  |For conducting unit/integration tests                      |
|PHP+Joomla             |Team website                                               |
|Apache Tomcat          |For writing our web search engine                          |
|HTML+CSS               |GUI                                                        |


## Concluding Remarks
This project is undertaken and is being done by the team ADH.

Its sole purpose is to do the course project of the course SE 6362.

Our team members are Ali Ghanbari, Dongcheng Li, and Haoliang Wang.

All charts that we have used can also be found in the file ```ADHTeam Charts.xlsx```

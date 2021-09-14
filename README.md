# Spring-boot-microservices
Microservices lab

## User service API design

| HTTP Verb     | URL Path        |Method                  | Request body                                                                                    |
| ------------- | -------------   | -------------          | -------------                                                                                   |
| POST          | /users/         |  saveUser              | {"firstName": "FIRSTNAME", "lastName": "LASTNAME", "email": "EMAIL", "departmentId": ID}|
| GET           | /users/id       |  getUserWithDepartment | -                                                                                               |

## Department service API design

| HTTP Verb     | URL Path             |Method                  | Request body                                                                                       |
| ------------- | -------------        | -------------          | -------------                                                                                      |
| POST          | /departments/        |  saveDepartment        | {"departmentName": "DEPARTMENT NAME","departmentAddress": "ADDRESS","departmentCode": "CODE"}|
| GET           | /departments/id      |  findByDepartmentId | -                                                                                                     |


![alt text]('spring cloud.drawio.png')

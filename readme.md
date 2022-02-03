# Spring Cloud Contract Service

## Demo steps

* Implement `CustomerControllerTest` (Test first)
* Implement `CustomerController` and `Customer` data object to make the test green
* Continue by creating the service client project
* After that: come back and add Spring Cloud Contract to this service
  * Add dependency `spring-cloud-starter-contract-verifier`
  * Add and configure `spring-cloud-contract-maven-plugin`
  * Add `BaseClass`
  * Write first contract
* Run `mvn clean package`
* Show generated tests in target folder
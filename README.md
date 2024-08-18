# EmpmanagementSystem
Spring Boot project of Crud Operation on Employee Management System.

Steps- 
1.Created Spring Starter Project on STS Ide.
2.Added maven Dependencies (Spring-boot starter,Spring-boot starter JDBC,Spring-boot starter dev tools,Mysql connector)
3.Setting Mysql connection in Application.property
4.Created Employee Entity Class with getters, setters and constructors.
5.Created an Interface EmployeeServices with CRUD Operations methods.
6.Created a EmployeeRepository class which extends the JpaRepository for using CRUD operations.
7.Created Implementation of Service class (ServiceImp) which extends EmployeeServices to override the Crud methods and @Autowired EmployeeRepository instance
 variable for using Crud Methods.
8.Created a controll class EmployeeContorller and @Autowired a ServiceImp class Instance for using crud methods.

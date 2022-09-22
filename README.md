# suraj-book-store

# Application Live view 
https://suraj-bookstore.herokuapp.com

# Rest API
https://suraj-bookstore.herokuapp.com/books

# Project structure
<pre>
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── Surajbookstore
│   │   │               ├── SurajbookstoreApplication.java
│   │   │               ├── WebSecurityConfig.java
│   │   │               ├── domain
│   │   │               │   ├── Book.java
│   │   │               │   ├── BookRepository.java
│   │   │               │   ├── Category.java
│   │   │               │   ├── CategoryRepository.java
│   │   │               │   ├── User.java
│   │   │               │   └── UserRepository.java
│   │   │               └── web
│   │   │                   ├── BookController.java
│   │   │                   └── UserDetailServiceImplementation.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       │   └── css
│   │       │       └── bootstrap.min.css
│   │       └── templates
│   │           ├── addbook.html
│   │           ├── booklist.html
│   │           ├── editbook.html
│   │           └── login.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── Surajbookstore
│                       ├── BookRepositoryTest.java
│                       ├── CategoryRepositoryTest.java
│                       ├── SurajbookstoreApplicationTests.java
│                       ├── UserRepositoryTest.java
│                       └── WebLayerTest.java
└──
    </pre>

## Key features 
- CRUD operations available. 
- More rights to admin 

## Learnings 
- Gained basic knowledge on creating simple backend application with spring boot
- Basic idea in creating rest apis
- Deploying applications in heroku platform




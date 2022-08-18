# suraj-book-store

# Live view 
https://suraj-bookstore.herokuapp.com

# Project structure
<pre>
├── HELP.md
├── mvnw
├── mvnw.cmd
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
└── target
    ├── classes
    │   ├── META-INF
    │   │   ├── MANIFEST.MF
    │   │   └── maven
    │   │       └── com.example
    │   │           └── Surajbookstore
    │   │               ├── pom.properties
    │   │               └── pom.xml
    │   ├── application.properties
    │   ├── com
    │   │   └── example
    │   │       └── Surajbookstore
    │   │           ├── SurajbookstoreApplication.class
    │   │           ├── WebSecurityConfig.class
    │   │           ├── domain
    │   │           │   ├── Book.class
    │   │           │   ├── BookRepository.class
    │   │           │   ├── Category.class
    │   │           │   ├── CategoryRepository.class
    │   │           │   ├── User.class
    │   │           │   └── UserRepository.class
    │   │           └── web
    │   │               ├── BookController.class
    │   │               └── UserDetailServiceImplementation.class
    │   ├── static
    │   │   └── css
    │   │       └── bootstrap.min.css
    │   └── templates
    │       ├── addbook.html
    │       ├── booklist.html
    │       ├── editbook.html
    │       └── login.html
    └── test-classes
        └── com
            └── example
                └── Surajbookstore
                    ├── BookRepositoryTest.class
                    ├── CategoryRepositoryTest.class
                    ├── SurajbookstoreApplicationTests.class
                    ├── UserRepositoryTest.class
                    └── WebLayerTest.class
    </pre>

## Key features 
- CRUD operations available. 
- More rights to admin 

## Learnings 
- Gained basic knowledge on creating simple backend application with spring boot
- Basic idea in creating rest apis
- Deploying applications in heroku platform




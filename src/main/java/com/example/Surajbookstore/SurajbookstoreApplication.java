package com.example.Surajbookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Surajbookstore.domain.Book;
import com.example.Surajbookstore.domain.BookRepository;
import com.example.Surajbookstore.domain.Category;
import com.example.Surajbookstore.domain.CategoryRepository;
import com.example.Surajbookstore.domain.User;
import com.example.Surajbookstore.domain.UserRepository;

@SpringBootApplication
public class SurajbookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurajbookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository cateRepository, UserRepository userRepository) {
		return (args) -> {
			
			cateRepository.save(new Category("Programming"));
			cateRepository.save(new Category("History"));
			cateRepository.save(new Category("Database"));
			
			repository.save(new Book("Jukka Juslin", "Introduction to Java", 2019, "ABCDEF123", 34.99, cateRepository.findByName("Programming").get(0)));
			repository.save(new Book("Kari Silpiö", "Data Structures and Algorithim", 2020, "ABCDWE231345", 33.99, cateRepository.findByName("Database").get(0)));
			
//			User user1 = new User("user", "$2a$10$7wwEIiPZWyKwrA5vt80hRu9QO50tTkWfJ5Qk9tHrQTe7SDtbLYZA.", "user@gmail.com", "USER"); 
//			User user2 = new User("admin", "$2a$10$kHJhAaMKWzWycq/Wv2aguOTik8dweFH9zAXIB6v/tm.lcbfPrUc3m", "admin@gmail.com", "ADMIN"); 
//			
//			userRepository.save(user1); 
//			userRepository.save(user2); 
		}; 
	}

}

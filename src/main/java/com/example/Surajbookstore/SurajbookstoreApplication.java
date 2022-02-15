package com.example.Surajbookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Surajbookstore.domain.Book;
import com.example.Surajbookstore.domain.BookRepository;
import com.example.Surajbookstore.domain.Category;
import com.example.Surajbookstore.domain.CategoryRepository;

@SpringBootApplication
public class SurajbookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurajbookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository cateRepository) {
		return (args) -> {
			
			cateRepository.save(new Category("Programming"));
			cateRepository.save(new Category("History"));
			cateRepository.save(new Category("Database"));
			
			repository.save(new Book("Jukka Juslin", "Introduction to Java", 2019, "ABCDEF123", 34.99, cateRepository.findByName("Programming").get(0)));
			repository.save(new Book("Kari Silpiö", "Data Structures and Algorithim", 2020, "ABCDWE231345", 33.99, cateRepository.findByName("Database").get(0))); 
			
		}; 
	}

}

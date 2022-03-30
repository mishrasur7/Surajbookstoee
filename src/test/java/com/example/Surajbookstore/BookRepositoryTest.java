package com.example.Surajbookstore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.Surajbookstore.domain.Book;
import com.example.Surajbookstore.domain.BookRepository;
import com.example.Surajbookstore.domain.Category;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository repository;

    @Test
    public void findByAuthorShouldReturnAuthor() {
        List<Book> books = repository.findByAuthor("Jukka Juslin");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getTitle()).isEqualTo("Introduction to Java");
    }
    
    @Test
    public void createNewBook() {
    	Book book = new Book("Suraj Mishra", "Cat and Mouse", 2022, "BVHSFGHJS", 15.19,  new Category("Fantasy"));
    	repository.save(book);
    	assertThat(book.getId()).isNotNull();
    } 
    
}

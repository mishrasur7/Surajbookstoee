package com.example.Surajbookstore;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.Surajbookstore.domain.Book;
import com.example.Surajbookstore.domain.BookRepository;
import com.example.Surajbookstore.domain.Category;
import com.example.Surajbookstore.domain.User;
import com.example.Surajbookstore.domain.UserRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void findByUsername() {
        User users = repository.findByUsername("user");
        
        
        assertThat(users.getUsername()).isEqualTo("user");
    }
    
}


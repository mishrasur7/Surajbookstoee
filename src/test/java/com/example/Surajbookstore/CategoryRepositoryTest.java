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
import com.example.Surajbookstore.domain.CategoryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository repository;

    @Test
    public void findByNameShouldReturnCategoryName() {
        List<Category> categories = repository.findByName("Programming");
        
        assertThat(categories).hasSize(1);
        assertThat(categories.get(0).getName()).isEqualTo("Programming");
    }
    
    @Test
    public void createNewCategory() {
    	Category category = new Category("Geography");
    	repository.save(category);
    	assertThat(category.getCategoryId()).isNotNull();
    } 
    
    
    @Test
    public void deleteCategory() {
    	Category category = new Category("Animal");
		repository.save(category);
		repository.deleteById(category.getCategoryId());
		List<Category> categories = repository.findByName("Animal");
		assertThat(categories).hasSize(0);
    }
}

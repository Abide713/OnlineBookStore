package com.example.OnlineBookStore;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
    // You can add custom query methods if needed
    List<Book> findByCategory(String category);
}

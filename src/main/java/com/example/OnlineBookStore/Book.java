package com.example.OnlineBookStore;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "books")  // Specifies the table name as 'books'
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates unique IDs
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

   @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "category", nullable = false, length = 100)
    private String category;

    @Column(name = "image_url", length = 500)  // Defines an optional column for image URLs
    private String image_url;

    // Default constructor
    public Book() {}
    

    // Parameterized constructor
    public Book(String title,double price, String category, String imageUrl, String image_url) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.image_url = image_url;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String imageUrl) {
        this.image_url = imageUrl;
    }


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", category=" + category + ", image_url="
				+ image_url + "]";
	}
    
    
}

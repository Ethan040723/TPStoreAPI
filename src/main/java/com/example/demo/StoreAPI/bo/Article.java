package com.example.demo.StoreAPI.bo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String title;
    public Article(long id, String _title) {
        this.id = id;
        this.title = _title;
    }

    public Article() {

    }
}

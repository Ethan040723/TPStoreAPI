package com.example.demo.StoreAPI.dao;

import com.example.demo.StoreAPI.bo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}

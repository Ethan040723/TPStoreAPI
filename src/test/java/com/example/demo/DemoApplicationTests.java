package com.example.demo;

import com.example.demo.StoreAPI.bo.Article;
import com.example.demo.StoreAPI.rest.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ArticleService articleService;

	@Test
	void contextLoads() {
	}

	@Test
	void Test(){
		assertEquals(articleService.getAllArticle().code, "202");
		assertEquals(articleService.getArticle(1).code, "202");
		assertEquals(articleService.getArticle(59).code, "703");
		assertEquals(articleService.save(new Article(1 ,"Coca-cola")).code, "203");
		assertEquals(articleService.save(new Article(-1, "Snickers")).code, "202");
		assertEquals(articleService.delete(1).code, "202");
		assertEquals(articleService.delete(1000000).code, "703");

	}

}

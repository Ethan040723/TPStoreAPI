package com.example.demo.StoreAPI.rest;
import com.example.demo.StoreAPI.bo.ReponseCode;
import com.example.demo.StoreAPI.bo.Article;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ArticleRestController {

    private ArticleService articleService;

    public ArticleRestController (ArticleService articleService){
        this.articleService = articleService;
    }

    @GetMapping("/articles")
    @Operation(summary = "Listes de tout les articles")
    public ReponseCode<List<Article>> getAll(){

        return articleService.getAllArticle();
    }
    @GetMapping("/article/{id}")
    public ReponseCode<Article> getId(@PathVariable("id") Long id) {
        return articleService.getArticle(id);
    }
    @PostMapping("/save-article")
    public ReponseCode<Article> save(@RequestBody Article article){

            return articleService.save(article);


    }
    @DeleteMapping("suppr-article/{id}")
    public ReponseCode<Boolean> deleteArticle(@PathVariable("id") long id){

           return articleService.delete(id);


    }
}

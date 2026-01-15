package com.example.demo.StoreAPI.rest;

import com.example.demo.StoreAPI.bo.Article;
import com.example.demo.StoreAPI.bo.ReponseCode;
import com.example.demo.StoreAPI.dao.ArticleRepository;
import com.example.demo.StoreAPI.local.LocalHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private ArticleRepository articleRepository;
    public LocalHelper traduction;

    public ArticleService(ArticleRepository articleRepository, LocalHelper traduction){
        this.articleRepository=articleRepository;
        this.traduction = traduction;
    }

    public ReponseCode<List<Article>> getAllArticle(){
        List<Article> articles = articleRepository.findAll();
        String message = traduction.i18n("Msg_GetAll_Success");
        ReponseCode<List<Article>> reponse = new ReponseCode<List<Article>>("200",message,articles);
        return reponse;
    }

    public ReponseCode<Article> getArticle(long id){

        Article article =  articleRepository.findById(id).orElse(null);
        String message;
        if (article == null) {
            message = traduction.i18n("Msg_GetById_Error");
            return new ReponseCode<Article>("703", message, article);
        }
        else {
            message = traduction.i18n("Msg_GetById_Success");
            return new ReponseCode<Article>("202", message, article);
        }
    }
    public ReponseCode<Article> save(Article article){
        Article saveArticle = articleRepository.save(article);
        Article articleexits = articleRepository.findById(article.id).orElse(null);
        String message;
        if (articleexits == null){
            message = traduction.i18n("Msg_Create_Success");
            return new ReponseCode<Article>("202", message, saveArticle);
        }
        else {
            message = traduction.i18n("Msg_Edit_Success");
            return new ReponseCode<Article>("203" , message, saveArticle);
        }
    }

    public ReponseCode<Boolean> delete(long id){
        Article articlefound = articleRepository.findById(id).orElse(null);
         Boolean articleSuppr = false;
         String message;
         if (articlefound == null){
             message = traduction.i18n("Msg_DeleteId_Error");
             return new ReponseCode<Boolean>("703", message, articleSuppr);

         }
         else {
             articleRepository.deleteById(id);
             articleSuppr = true;
             message = traduction.i18n("Msg_DeleteId_Success");
             return new ReponseCode<Boolean>("202", message, articleSuppr);
         }
    }
}

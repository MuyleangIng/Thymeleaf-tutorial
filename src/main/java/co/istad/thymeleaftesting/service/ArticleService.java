package co.istad.thymeleaftesting.service;

import co.istad.thymeleaftesting.model.Article;

import java.util.List;

public interface ArticleService {
    // Find all articles
    //POJO
    List<Article> findAll();
}

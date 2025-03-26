package org.example.dao;

import org.example.dto.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleDao {
    public List<Article> articles;

    public ArticleDao() {
        articles = new ArrayList<>();
    }
}

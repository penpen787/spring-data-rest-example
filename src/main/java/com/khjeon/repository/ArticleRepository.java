package com.khjeon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khjeon.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {}

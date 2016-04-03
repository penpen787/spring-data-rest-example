package kr.penpen.repository;

import kr.penpen.domain.Article;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

}

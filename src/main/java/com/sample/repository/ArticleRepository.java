package com.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

	List<Article> findAll();
	
}

package com.testtask.NewsFeed.repository;

import com.testtask.NewsFeed.model.NewsDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<NewsDTO, Long> {
}

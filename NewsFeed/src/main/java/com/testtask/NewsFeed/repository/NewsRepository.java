package com.testtask.NewsFeed.repository;

import com.testtask.NewsFeed.model.NewsDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * The simplest repository class for all calling operations to the database.
 * The repository extends CrudRepository for extending it's properties and adding new if necessary.
 * */
// annotation marks class as Repository to get easy Spring application working with
@Repository
// annotation for automatic generation objects for database-java connection
@Transactional
public interface NewsRepository extends CrudRepository<NewsDto, Long> {
}

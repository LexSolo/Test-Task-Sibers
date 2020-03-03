package com.testtask.NewsFeed.service;

import com.testtask.NewsFeed.model.NewsDTO;
import com.testtask.NewsFeed.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {

    private NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<NewsDTO> getListOfAllNews() {
        Iterable<NewsDTO> newsFromDB = newsRepository.findAll();

        List<NewsDTO> newsList = new ArrayList<>();
        for (NewsDTO news : newsFromDB) {
            newsList.add(news);
        }

        return newsList;
    }
}

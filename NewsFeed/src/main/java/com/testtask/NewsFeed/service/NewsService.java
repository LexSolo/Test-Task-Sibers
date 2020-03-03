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

    public String showGreeting() {
        return "Welcome!";
    }

    public List<NewsDTO> getListOfAllNews() {
        Iterable<NewsDTO> newsFromDB = newsRepository.findAll();

        List<NewsDTO> newsList = new ArrayList<>();
        for (NewsDTO news : newsFromDB) {
            newsList.add(news);
        }

        return newsList;
    }

    public boolean addNews(NewsDTO newsDTO) {
        for (NewsDTO news : getListOfAllNews()) {
            if (news.getHeader().equals(newsDTO.getHeader()))
                return false;
        }

        newsRepository.save(newsDTO);

        return true;
    }
}

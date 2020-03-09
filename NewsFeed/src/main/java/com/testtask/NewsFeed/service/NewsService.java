package com.testtask.NewsFeed.service;

import com.testtask.NewsFeed.model.NewsDto;
import com.testtask.NewsFeed.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The simplest service class for all logic operations with the data.
 * */

// annotation marks class as Service to get easy Spring application working with
@Service
public class NewsService {

    // the field for connection wih the repository or database
    private NewsRepository newsRepository;

    // dependency injection by the constructor with newsService field
    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    /**
     * The simplest method for String returning.
     *
     * @return String of greeting at the default address.
     * */
    public String showGreeting() {
        return "Welcome!";
    }

    /**
     * Returns list of news.
     *
     * @return List of NewsDto elements from database.
     * */
    public List<NewsDto> getListOfAllNews() {
        Iterable<NewsDto> newsFromDB = newsRepository.findAll();

        List<NewsDto> newsList = new ArrayList<>();
        for (NewsDto news : newsFromDB) {
            newsList.add(news);
        }

        return newsList;
    }

    /**
     * Checks if the news with the header exists and returns the boolean value.
     *
     * @param newsDto is the transformed news from database to lava class.
     * @return true if the news exists and saves if in the database else false with the message.
     * */
    public boolean addNews(NewsDto newsDto) {
        for (NewsDto news : getListOfAllNews()) {
            if (news.getHeader().equals(newsDto.getHeader())) {
                System.out.println("Error. The news with this header exists. Nothing to add.");
                return false;
            }
        }

        newsRepository.save(newsDto);

        return true;
    }
}

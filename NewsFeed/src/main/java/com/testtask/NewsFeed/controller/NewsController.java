package com.testtask.NewsFeed.controller;

import com.testtask.NewsFeed.model.NewsDTO;
import com.testtask.NewsFeed.service.NewsService;
import com.testtask.NewsFeed.utils.AddressConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AddressConstants.DEFAULT_ADDRESS)
public class NewsController {

    private NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public String showGreeting() {
        return newsService.showGreeting();
    }

    @GetMapping("10/")
    public List<NewsDTO> getListOfAllNews() {
        return newsService.getListOfAllNews();
    }

    @PostMapping("add-news/")
    public ResponseEntity<?> addNews(@RequestBody NewsDTO newsDTO) {
        if (!newsService.addNews(newsDTO)) {
            System.out.println("Error. The news with this header exists. Nothing to add.");
            return (ResponseEntity<?>) ResponseEntity.badRequest();
        }

        return (ResponseEntity<?>) ResponseEntity.ok();
    }
}

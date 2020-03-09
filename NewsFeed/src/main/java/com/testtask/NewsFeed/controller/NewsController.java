package com.testtask.NewsFeed.controller;

import com.testtask.NewsFeed.model.NewsDTO;
import com.testtask.NewsFeed.service.NewsService;
import com.testtask.NewsFeed.utils.AddressConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * I'd like to add project Lombok annotations to make the dependency injection easier.
 * Instead of writing @Autowired annotation near the constructor below I could write @RequiredArgsConstructor annotation,
 * and do without newsService field injection further.
 * However, it is the problems possible to use this library on your computer without installing required components.
 * So that, I refused to use Lombok.
 *
 * This is the simple controller class for call forwarding the requests to service.
 * */

// indicates the RESTful app for Spring and the Controller class at the same time
@RestController
// the default address for appealing to the app
@RequestMapping(AddressConstants.DEFAULT_ADDRESS)
public class NewsController {

    // the field for connection wih the service
    private NewsService newsService;

    // dependency injection by the constructor with newsService field
    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    /**
     * The simplest GET mapping.
     *
     * @return String of greeting at the default address.
     * */
    @GetMapping
    public String showGreeting() {
        return newsService.showGreeting();
    }

    /**
     * Returns list of news.
     *
     * @return List of NewsDto elements.
     * */
    @GetMapping(value = "allNews/")
    public List<NewsDTO> getListOfAllNews() {
        return newsService.getListOfAllNews();
    }

    /**
     * Checks if the news with the header exists and returns the http code.
     *
     * @param newsDTO is the transformed news from database to lava class.
     * @return ResponseEntity class with success http code if the news exists else error http code.
     * */
    @PostMapping(value = "add-news/")
    public ResponseEntity<?> addNews(@RequestBody NewsDTO newsDTO) {
        if (!newsService.addNews(newsDTO)) {
            System.out.println("Error. The news with this header exists. Nothing to add.");
            return (ResponseEntity<?>) ResponseEntity.badRequest();
        }

        return (ResponseEntity<?>) ResponseEntity.ok();
    }
}

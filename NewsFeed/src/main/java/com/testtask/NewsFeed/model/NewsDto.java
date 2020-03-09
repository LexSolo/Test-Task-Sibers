package com.testtask.NewsFeed.model;

import javax.persistence.*;
import java.net.URL;
import java.util.Calendar;

/**
 * The simplest model class for interaction with the database.
 *
 * There is a lot of getter/setter methods due to non-usaging Lombok library.
 * If you wish to know why I don't use if here, you could look through the NewsController class.
 * */

// annotation marks the class as an Entity, which is telling ti Spring to use it for database's data exchange
@Entity
// the indexing the created table for connection with the Spring
@Table(name = "news")
public class NewsDto {

    // the required @Id parameter for Entity class for interaction with the database by unique key
    @Id
    // automatic generation value for every new element
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String header;
    private Calendar publishingDate;
    private String newsBody;
    private URL image;

    // the default constructor is here, because I don't use the Lombok
    public NewsDto() {
    }

    // getter/setter methods srarts from here
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Calendar getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Calendar publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }
}

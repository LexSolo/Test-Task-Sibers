package com.testtask.NewsFeed.model;

import javax.persistence.*;
import java.net.URL;
import java.util.Calendar;

@Entity
@Table(name = "news")
public class NewsDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String header;
    private Calendar publishingDate;
    private String newsBody;
    private URL image;

    public NewsDto() {
    }

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

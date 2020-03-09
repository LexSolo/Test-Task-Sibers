package com.testtask.NewsFeed.utils;

/**
 * The util class for storing constants.
 * At this case it is the default address of the app.
 * */

public final class AddressConstants {

    // the constructor for correct Spring Boot app working.
    // I could use the @NoArgsConstructor annotation from Lombok library, but I refused to use Lombok.
    // You could find out why in the NewsController class' docs.
    private AddressConstants() {
    }

    // default address of the app
    public static final String DEFAULT_ADDRESS = "/";
}

-- creates the 'news' table
CREATE TABLE news(
    ID SERIAL NOT NULL PRIMARY KEY, -- unique identification number for every news
    Header VARCHAR(250) NOT NULL, -- header of news
    Date DATETIME_INTERVAL_CODE NOT NULL, -- publishing date
    Text MESSAGE_TEXT NOT NULL -- news' text
    Image BYTEA -- news' image, optional parameter
);
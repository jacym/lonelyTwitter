
/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright © 2017 Jacy Mark, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a tweet.
 *
 * @author jmark
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable{
    /*
     *Brief description
     */
    private String message;
    private Date date;

    /**
     * Constructs a Tweet message.
     *
     * @param message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * constructs a Tweet Object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * When a message is requested.
     *
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the Tweet message.
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets the date.
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @return
     */
    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}

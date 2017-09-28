
/*
 * ImportantTweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 *  Copyright © 2017 Jacy Mark, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an Important Tweet.
 *
 * @author jmark
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public class ImportantTweet extends Tweet{
    /**
     * Represents important tweet message.
     *
     * @param message important tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Represents an important tweet.
     *
     * @param message important tweet message
     * @param date important tweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}

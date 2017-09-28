
/*
 * NormalTweet
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
 * Represents a normal Tweet
 *
 * @author jmark
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet{
    /**
     * Normal Tweet with no date
     *
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Normal Tweet
     *
     * @param message normal tweet message
     * @param date normal tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}

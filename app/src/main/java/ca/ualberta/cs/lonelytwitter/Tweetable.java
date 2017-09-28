
/*
 * Tweetable interface
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
 * Tweetable interface
 *
 * @author jmark
 * @version 1.5
 * @see Tweet
 * @since 1.5
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}

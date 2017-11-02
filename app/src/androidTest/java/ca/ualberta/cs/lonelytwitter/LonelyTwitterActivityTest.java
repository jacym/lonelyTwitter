package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

/*
changed default file template
removed unused import
 */
/**
 * Created by wz on 14/09/15.
 * activity test
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
}
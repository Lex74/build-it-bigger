package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokesAsyncTaskTest {
    @Test
    public void testAsyncTask(){
        JokesAsyncTask.JokesListener jokesListener = new JokesAsyncTask.JokesListener() {
            @Override
            public void onResponse(String joke) {
                assertNotEquals("", joke);
            }
        };
        JokesAsyncTask jokesAsyncTask = new JokesAsyncTask(jokesListener);
        jokesAsyncTask.execute();
    }
}
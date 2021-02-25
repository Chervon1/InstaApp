package com.example.instaapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication  extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xvxMZosSaaP4lcLJMIzPZezAqt97IJtThiJR6xjb")
                .clientKey("OkUwScW4T70PdbwVpAmloMj6Nu1YAQE1qzxLkD9z")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

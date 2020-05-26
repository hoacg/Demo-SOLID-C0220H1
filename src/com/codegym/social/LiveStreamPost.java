package com.codegym.social;


public class LiveStreamPost extends Post {

    @Override
    void save() {
        saveLiveStream();
        super.save();
    }

    void saveLiveStream() {
        doNotify();
    }

    void doNotify() {
        //
    }

}

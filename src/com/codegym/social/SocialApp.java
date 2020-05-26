package com.codegym.social;

import java.util.LinkedList;
import java.util.List;

public class SocialApp {
    public static void main(String[] args) {
        Post textPost = new Post();
        Post photoPost = new PhotoPost();
        Post liveStream = new LiveStreamPost();

        List<Post> posts = new LinkedList<>();
        posts.add(textPost);
        posts.add(photoPost);
        posts.add(liveStream);

        for (Post post : posts) {
            post.save();
        }

    }
}

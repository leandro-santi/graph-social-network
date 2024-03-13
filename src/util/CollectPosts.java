package util;

import javafx.util.Pair;
import network.Post;
import network.UserVertex;

import java.util.ArrayList;
import java.util.List;

public class CollectPosts {

    public static List<Pair<String, Post>> returnPosts(List<UserVertex> vertices) {
        List<Pair<String, Post>> posts = new ArrayList<>();
        for (UserVertex user : vertices) {
            for (Post post : user.getMural()) {
                posts.add(new Pair<>(user.getUsername(), post));
            }
        }

        return posts;

    }

}
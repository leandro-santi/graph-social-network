package network;

import javafx.util.Pair;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserVertex {

    private String username;
    private String password;
    private String email;
    private String bio;

    private final List<UserVertex> friendships = new ArrayList<>();

    private final List<Post> mural = new ArrayList<>();

    public UserVertex(String username, String password, String email, String bio) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.bio = bio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void addFriend(UserVertex friend) {
        friendships.add(friend);
    }

    public int returnNumberOfFriends() {
        return friendships.size();
    }

    public List<Pair<String, Post>> returnFriendsPosts() {
        List<Pair<String, Post>> friendsPosts = new ArrayList<>();
        for (UserVertex friend : friendships) {
            for (Post post : friend.getMural()) {
                friendsPosts.add(new Pair<>(friend.getUsername(), post));
            }
        }

        // Adding my posts in the mural list
        for (Post post : mural) {
            friendsPosts.add(new Pair<>(username, post));
        }

        return getMuralAscending(friendsPosts);
    }

    public Post createPost(LocalDateTime date, String text) {
        Post post = new Post(date, text);
        mural.add(post);
        return post;
    }

    public List<Post> getMural() {
        return mural;
    }

    public List<Pair<String, Post>> getMuralAscending(List<Pair<String, Post>> pairs) {
        List<Pair<String, Post>> muralAscending = new ArrayList<>(pairs);
        muralAscending.sort(Comparator.comparing(pair -> pair.getValue().getDate()));
        return muralAscending;
    }

}

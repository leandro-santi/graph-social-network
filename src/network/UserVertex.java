package network;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserVertex {

    private String username;
    private String password;
    private String email;
    private String bio;

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

    public Post createPost(LocalDateTime date, String text) {
        Post post = new Post(LocalDateTime.now(), text);
        mural.add(post);
        return post;
    }

    public List<Post> getMural() {
        return mural;
    }

//    public List<Post> getMuralDescending() {
//        List<Post> muralDescending = new ArrayList<>(mural);
//        muralDescending.sort((post1, post2) -> post2.getDate().compareTo(post1.getDate()));
//        return muralDescending;
//    }

}

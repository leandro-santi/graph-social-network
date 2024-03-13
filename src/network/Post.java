package network;

import java.time.LocalDateTime;

public class Post {
    private final LocalDateTime date;
    private final String text;

    public Post(LocalDateTime date, String text) {
        this.date = date;
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String toString(String username) {
        return "@" + username + " said: " + text + " (" + date + ")";
    }
}

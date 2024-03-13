package network;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        String formattedDateTime = date.format(formatter);
        return "@" + username + " said: " + text + " (" + formattedDateTime + ")";
    }
}

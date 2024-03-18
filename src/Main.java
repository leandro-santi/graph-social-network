import algorithms.Graph;
import javafx.util.Pair;
import network.Post;
import network.UserVertex;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // Creating Local user
        UserVertex myUser = new UserVertex(
                "leomeister", "anime123", "email@gmail.com", "tuturu");

        // Creating other users
        UserVertex userVertex1 = new UserVertex(
                "Fulano", "anime123", "email@gmail.com", "tuturu");
        UserVertex userVertex2 = new UserVertex(
                "Beltrano", "anime123", "email@gmail.com", "tuturu");
        UserVertex userVertex3 = new UserVertex(
                "Sicrano", "anime123", "email@gmail.com", "tuturu");
        UserVertex userVertex4 = new UserVertex(
                "Ciclano", "anime123", "email@gmail.com", "tuturu");

        // Creates the network
        Graph graphNetwork = new Graph();

        // Add users in the network
        graphNetwork.addVertex(userVertex1);
        graphNetwork.addVertex(userVertex2);
        graphNetwork.addVertex(userVertex3);
        graphNetwork.addVertex(userVertex4);
        graphNetwork.addVertex(myUser);

        // Creates a friendship relation between users (user1 <-> user2, user2 <-> user3)
        graphNetwork.addEdge(userVertex1, userVertex2);
        graphNetwork.addEdge(userVertex1, userVertex3);
        graphNetwork.addEdge(userVertex2, userVertex3);
        graphNetwork.addEdge(userVertex2, userVertex4);
        graphNetwork.addEdge(myUser, userVertex1);
        graphNetwork.addEdge(myUser, userVertex2);

        userVertex1.createPost(LocalDateTime.now(),
                "Eae galera!").toString(userVertex1.getUsername());

        userVertex2.createPost(LocalDateTime.now().plusSeconds(-5),
                "Olá galerinha!").toString(userVertex2.getUsername());

        userVertex2.createPost(LocalDateTime.now().plusSeconds(5),
                "Eae Fulano!").toString(userVertex2.getUsername());

        myUser.createPost(LocalDateTime.now().plusSeconds(10),
                "Hmmmm!").toString(myUser.getUsername());

        userVertex1.createPost(LocalDateTime.now().plusSeconds(7),
                "Eae Beltrano!").toString(userVertex1.getUsername());

        userVertex3.createPost(LocalDateTime.now().plusSeconds(15),
                "Alguém online?").toString(userVertex3.getUsername());

        // Network graph relations
        System.out.println("Showing all network graph relations from my user:");
        graphNetwork.BFS(myUser);

        // Showing my mural posts (My user and my added friends)
        System.out.println("\nFriend's feed:");
        for (Pair<String, Post> post : myUser.returnFriendsPosts()) {
            System.out.println(post.getValue().toString(post.getKey()));
        }

        // Showing network global mural posts
        System.out.println("\nGlobal feed:");
        for (Pair<String, Post> post : graphNetwork.returnNetworkPosts()) {
            System.out.println(post.getValue().toString(post.getKey()));
        }

    }

}
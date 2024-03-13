import algorithms.Graph;
import network.UserVertex;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Local user
        UserVertex myUser = new UserVertex(
                "leomeister", "anime123", "email@gmail.com", "tururu");

        // Creates users
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

        // Network graph relations
        System.out.println("Showing all network relations from my user:");
        graphNetwork.BFS(myUser);

        System.out.println(myUser.createPost(LocalDateTime.now(),
                "Eu sou apaixonado pela Alinezinha!").toString(myUser.getUsername()));
        System.out.println(myUser.createPost(LocalDateTime.now(),
                "Eu sou apaixonadoo pela Alinezinha!").toString(myUser.getUsername()));
        System.out.println(myUser.createPost(LocalDateTime.now(),
                "Eu sou apaixonadoo pela Alinezinha!").toString(myUser.getUsername()));
        System.out.println(myUser.getMural().size());

    }
}
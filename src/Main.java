import algorithms.Graph;
import network.UserVertex;

public class Main {
    public static void main(String[] args) {

        // Creates an user
        UserVertex userVertex1 = new UserVertex("Fulano");
        UserVertex userVertex2 = new UserVertex("Beltrano");
        UserVertex userVertex3 = new UserVertex("Sicrano");
        UserVertex userVertex4 = new UserVertex("Ciclano");

        // Creates the network
        Graph graph = new Graph();

        // Add users in the network
        graph.addVertex(userVertex1);
        graph.addVertex(userVertex2);
        graph.addVertex(userVertex3);
        graph.addVertex(userVertex4);

        // Creates a friendship relation between users (user1 <-> user2)
        graph.addEdge(userVertex1, userVertex2);
        graph.addEdge(userVertex1, userVertex3);
        graph.addEdge(userVertex2, userVertex4);

        // Network graph relations
        System.out.println("Showing all network relations from Fulano:");
        graph.BFS(userVertex1);

    }
}
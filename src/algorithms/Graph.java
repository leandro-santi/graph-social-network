package algorithms;

import javafx.util.Pair;
import network.Post;
import network.UserVertex;
import util.CollectPosts;
import util.Sort;

import java.util.*;

public class Graph implements Sort {

    private final Map<UserVertex, List<UserVertex>> adjList; // Adjacent list x -> y, z, w
    private final Set<UserVertex> vertices; // All vertices that exist

    // Initialization
    public Graph() {
        adjList = new HashMap<>();
        vertices = new HashSet<>();
    }

    public void addVertex(UserVertex userVertex) {
        // Add only if it not exists on adjacent list
        adjList.putIfAbsent(userVertex, new ArrayList<>());
        vertices.add(userVertex);
    }

    public void addEdge(UserVertex u, UserVertex v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
        u.addFriend(v);
        v.addFriend(u);
    }

    public void BFS(UserVertex start) {
        if (!vertices.contains(start)) {
            System.out.println("It does not exist!");
            return;
        }

        Set<UserVertex> visited = new HashSet<>();
        Queue<UserVertex> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            UserVertex current = queue.poll();
            System.out.print(current.getUsername() + " ");

            for (UserVertex neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("... Search ended!");
    }

    public List<Pair<String, Post>> returnNetworkPosts() {
        List<Pair<String, Post>> networkPosts = CollectPosts.returnPosts(new ArrayList<>(vertices));

        return getMuralAscending(networkPosts);
    }

    @Override
    public List<Pair<String, Post>> getMuralAscending(List<Pair<String, Post>> pairs) {
        List<Pair<String, Post>> muralAscending = new ArrayList<>(pairs);
        muralAscending.sort(Comparator.comparing(pair -> pair.getValue().getDate()));
        return muralAscending;
    }
}

package util;

import javafx.util.Pair;
import network.Post;

import java.util.List;

public interface Sort {

    List<Pair<String, Post>> getMuralAscending(List<Pair<String, Post>> pairs);

}

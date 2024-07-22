package com.solitudeworks.graph.util;

import javafx.util.Pair;
import com.solitudeworks.graph.network.Post;

import java.util.List;

public interface Sort {

    List<Pair<String, Post>> getMuralAscending(List<Pair<String, Post>> pairs);

}

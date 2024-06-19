package demopackage;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public String name;
    public List<Node> child;

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", child=" + child +
                '}';
    }
}

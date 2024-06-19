package planning;

import java.util.List;

public class Node {
    String key;
    String label;
    public List<Node> child;

    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                ", label='" + label + '\'' +
                ", child=" + child +
                '}';
    }
}

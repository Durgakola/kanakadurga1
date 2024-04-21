package homeDemo;

import java.util.List;

public class Furniture {
    public List<Chair> chair;
    public Table table;
    public Sofa sofa;

    @Override
    public String toString() {
        return "Furniture{" +
                "chair=" + chair +
                ", table=" + table +
                ", sofa=" + sofa +
                '}';
    }
}

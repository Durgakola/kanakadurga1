package homeDemo;

public class Hall extends Room{
    public Tv tv;
    public Furniture furniture;

    @Override
    public String toString() {
        return "Hall{" +
                "tv=" + tv +
                ", furniture=" + furniture +
                '}';
    }
}

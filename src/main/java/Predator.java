import java.util.Objects;

public abstract class Predator {
    protected String colour;
    protected int weight;

    abstract  String sleep();
    abstract  String hunter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return weight == predator.weight && colour.equals(predator.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, weight);
    }
}

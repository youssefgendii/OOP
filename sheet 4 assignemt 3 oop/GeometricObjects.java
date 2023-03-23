public class GeometricObjects {

    String color;
    boolean filled;

    public GeometricObjects(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

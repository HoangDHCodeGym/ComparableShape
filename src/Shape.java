public abstract class Shape {
    String color;
    boolean filled;

    public void setColor(String color) {
        this.color = color;
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

    public String toString() {
        String fill = isFilled() ? "is filled" : "is empty";
        return "have color " + color + " and " + fill;
    };
}

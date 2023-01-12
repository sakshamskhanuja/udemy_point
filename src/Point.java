public class Point {

    // Instance fields.
    private int x;
    private int y;

    // Default Constructor.
    public Point() {
        this(0, 0);
    }

    // Parameterized constructor.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods.
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods.
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}

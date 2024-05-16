package Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point point2 = new Point(0,0);

        point.move(1,2);

        System.out.println(point.distanceTo(point2));

        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}

// Defining a Point class to represent a point in 2-dimensional space
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        // this.x?
        x += dx;
        y += dy;
    }

    public double distanceTo(Point other) {
        int otherX = other.getX();
        int otherY = other.getY();
        double distance = Math.sqrt((x - otherX) * (x - otherX) + (y - otherY) * (y - otherY));

        return distance;
    }
}



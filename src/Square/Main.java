package Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(-1);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}

class Square {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        if (side <= 0) {
            return -1;
        }else{
            int area = side * side;
            return area;
        }
    }

    public int calculatePerimeter() {
        if (side <= 0){
            return -1;
        }else{
            int perimeter = side * 4;
            return perimeter;
        }
    }
}

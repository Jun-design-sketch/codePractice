package Dimension;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dimension dimension = new Dimension(-1);
        System.out.println(dimension.getFeet());
        System.out.println(dimension.getInches());
    }


}

class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        if(inches < 0){
            feet = -1;
            inches = -1;
        }else{
            feet = inches / 12;
            inches = inches % 12;
        }
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }
}
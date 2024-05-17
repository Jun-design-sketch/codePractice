package RGBColor;

public class Main {
    public static void main(String[] args) {
        RGBColor rgbColor = new RGBColor(122, 123, 124);
        System.out.println(rgbColor.getRed());
        System.out.println(rgbColor.getGreen());
        System.out.println(rgbColor.getBlue());
        rgbColor.invert();
        System.out.println(rgbColor.getRed());
        System.out.println(rgbColor.getGreen());
        System.out.println(rgbColor.getBlue());
    }
}

// RGBColor class representing a color using Red Green Blue (RGB) model.
class RGBColor {

    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getter method to get the red value of the color.
    public int getRed() {
        return red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        return green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        return blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        this.red = 255 - red;
        this.green = 255 - green;
        this.blue = 255 - blue;
    }
}



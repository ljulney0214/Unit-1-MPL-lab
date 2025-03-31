/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit9mpl;

public class Candle {
    private String color;
    private int height;
    protected double price;

    public String getColor() { return color; }
    public int getHeight() { return height; }
    public double getPrice() { return price; }

    public void setColor(String color) { this.color = color; }
    public void setHeight(int height) {
        this.height = height;
        this.price = height * 2.0;
    }

    public static void main(String[] args) {
        Candle candle = new Candle();
        candle.setColor("Red");
        candle.setHeight(4);

        System.out.println("Candle Details:");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: $" + candle.getPrice());
    }
}
/*
run:
Candle Details:
Color: Red
Height: 4 inches
Price: $8.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/
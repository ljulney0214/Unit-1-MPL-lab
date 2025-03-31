/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit9mpl;

public class ScentedCandle extends Candle {
    private String scent;

    public String getScent() { return scent; }
    public void setScent(String scent) { this.scent = scent; }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        this.price = height * 3.0;
    }

    public static void main(String[] args) {
        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setColor("Blue");
        scentedCandle.setHeight(5);
        scentedCandle.setScent("Vanilla");

        System.out.println("Scented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());
    }
}

/*
run:
Scented Candle Details:
Color: Blue
Height: 5 inches
Scent: Vanilla
Price: $15.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/
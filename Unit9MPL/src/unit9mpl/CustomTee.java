/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit9mpl;

public class CustomTee extends TeeShirt {
    private String slogan;

    // Get method for slogan
    public String getSlogan() { return slogan; }

    // Set method for slogan
    public void setSlogan(String slogan) { this.slogan = slogan; }

    public static void main(String[] args) {
        // Create a CustomTee object for testing
        CustomTee customTee = new CustomTee();
        customTee.setOrderNumber(202);
        customTee.setSize("XXL");
        customTee.setColor("Black");
        customTee.setSlogan("Just Do It");

        // Display CustomTee details
        System.out.println("Custom Tee Details:");
        System.out.println("Order Number: " + customTee.getOrderNumber());
        System.out.println("Size: " + customTee.getSize());
        System.out.println("Color: " + customTee.getColor());
        System.out.println("Slogan: " + customTee.getSlogan());
        System.out.println("Price: $" + customTee.getPrice());
    }
}
/*
run:
Custom Tee Details:
Order Number: 202
Size: XXL
Color: Black
Slogan: Just Do It
Price: $22.99
BUILD SUCCESSFUL (total time: 0 seconds)
*/

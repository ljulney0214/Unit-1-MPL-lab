/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit9mpl;

public class TeeShirt {
    private int orderNumber;  // Order number for the tee shirt
    private String size;      // Size of the tee shirt (S, M, L, XXL, XXXL, etc.)
    private String color;     // Color of the tee shirt
    protected double price;   // Price of the tee shirt

    // Getter methods
    public int getOrderNumber() {
        return orderNumber;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setSize(String size) {
        this.size = size;
        // Determine the price based on the size
        if (size.equals("XXL") || size.equals("XXXL")) {
            this.price = 22.99;  // Price for XXL or XXXL
        } else {
            this.price = 19.99;  // Price for other sizes
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        // Create a TeeShirt object for testing
        TeeShirt teeShirt = new TeeShirt();
        teeShirt.setOrderNumber(1001); // Set order number
        teeShirt.setSize("L");         // Set size
        teeShirt.setColor("Blue");     // Set color

        // Display TeeShirt details
        System.out.println("TeeShirt Details:");
        System.out.println("Order Number: " + teeShirt.getOrderNumber());
        System.out.println("Size: " + teeShirt.getSize());
        System.out.println("Color: " + teeShirt.getColor());
        System.out.println("Price: $" + teeShirt.getPrice());
    }
}

/*
run:
TeeShirt Details:
Order Number: 1001
Size: L
Color: Blue
Price: $19.99
BUILD SUCCESSFUL (total time: 0 seconds
*/

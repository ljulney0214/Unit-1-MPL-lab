/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit9mpl;

import java.util.Scanner;

public class DemoTees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a TeeShirt object
        TeeShirt teeShirt = new TeeShirt();
        System.out.print("Enter TeeShirt order number: ");
        teeShirt.setOrderNumber(input.nextInt());
        input.nextLine(); // Consume the newline
        System.out.print("Enter TeeShirt size (S, M, L, XXL, XXXL): ");
        teeShirt.setSize(input.nextLine());
        System.out.print("Enter TeeShirt color: ");
        teeShirt.setColor(input.nextLine());

        // Create a CustomTee object
        CustomTee customTee = new CustomTee();
        System.out.print("Enter CustomTee order number: ");
        customTee.setOrderNumber(input.nextInt());
        input.nextLine(); // Consume the newline
        System.out.print("Enter CustomTee size (S, M, L, XXL, XXXL): ");
        customTee.setSize(input.nextLine());
        System.out.print("Enter CustomTee color: ");
        customTee.setColor(input.nextLine());
        System.out.print("Enter CustomTee slogan: ");
        customTee.setSlogan(input.nextLine());

        // Display TeeShirt details
        System.out.println("\nTeeShirt Details:");
        System.out.println("Order Number: " + teeShirt.getOrderNumber());
        System.out.println("Size: " + teeShirt.getSize());
        System.out.println("Color: " + teeShirt.getColor());
        System.out.println("Price: $" + teeShirt.getPrice());

        // Display CustomTee details
        System.out.println("\nCustom Tee Details:");
        System.out.println("Order Number: " + customTee.getOrderNumber());
        System.out.println("Size: " + customTee.getSize());
        System.out.println("Color: " + customTee.getColor());
        System.out.println("Slogan: " + customTee.getSlogan());
        System.out.println("Price: $" + customTee.getPrice());

        input.close(); // Close the scanner
    }
}

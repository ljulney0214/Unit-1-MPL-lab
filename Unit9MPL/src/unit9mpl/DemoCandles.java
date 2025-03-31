/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit9mpl;

import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a regular Candle object
        Candle candle = new Candle();
        System.out.print("Enter candle color: ");
        candle.setColor(input.nextLine());
        System.out.print("Enter candle height (in inches): ");
        candle.setHeight(input.nextInt());
        input.nextLine(); // Consume newline character

        // Create a ScentedCandle object
        ScentedCandle scentedCandle = new ScentedCandle();
        System.out.print("Enter scented candle color: ");
        scentedCandle.setColor(input.nextLine());
        System.out.print("Enter scented candle height (in inches): ");
        scentedCandle.setHeight(input.nextInt());
        input.nextLine(); // Consume newline character

        // Offer user 4 scent choices for ScentedCandle
        System.out.println("Choose a scent for the scented candle:");
        System.out.println("1. Gardenia");
        System.out.println("2. Lavender");
        System.out.println("3. Vanilla");
        System.out.println("4. Rose");
        System.out.print("Enter your choice (1-4): ");
        int scentChoice = input.nextInt();
        input.nextLine(); // Consume newline character
        
        // Set scent based on user input (no validation for choice)
        switch (scentChoice) {
            case 1:
                scentedCandle.setScent("Gardenia");
                break;
            case 2:
                scentedCandle.setScent("Lavender");
                break;
            case 3:
                scentedCandle.setScent("Vanilla");
                break;
            case 4:
                scentedCandle.setScent("Rose");
                break;
            default:
                scentedCandle.setScent("Unknown");
                break;
        }

        // Display details for regular Candle
        System.out.println("\nCandle Details:");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: $" + candle.getPrice());

        // Display details for ScentedCandle
        System.out.println("\nScented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());

        input.close(); // Close the scanner
    }
}
/*
run:
Enter candle color: purple
Enter candle height (in inches): 4
Enter scented candle color: black
Enter scented candle height (in inches): 4
Choose a scent for the scented candle:
1. Gardenia
2. Lavender
3. Vanilla
4. Rose
Enter your choice (1-4): 3

Candle Details:
Color: purple
Height: 4 inches
Price: $8.0

Scented Candle Details:
Color: black
Height: 4 inches
Scent: Vanilla
Price: $12.0
BUILD SUCCESSFUL (total time: 20 seconds)
*/
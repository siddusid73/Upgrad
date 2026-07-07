package Operations;

import java.util.Scanner;

public class ArthemeticOperators {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of Products");

        System.out.println("Enter Quantity of Banana: ");
        int banana_qty = sc.nextInt();
        
        System.out.println("Enter the Quantity of Eggs: ");
        int eggs_qty = sc.nextInt();
        
        System.out.println("Enter the Quantity for Bread: ");
        int bread_qty = sc.nextInt();
        
        System.out.println("Enter the Quantity for Atta in KGs: ");
        int atta_qty = sc.nextInt();
        
        System.out.println("Enter the Quantity of Milk in Liter: ");
        int milk_qty = sc.nextInt();

        int atta = 60; // per kg
        int banana = 7;
        int egg = 6;
        int bread = 50;
        int milk = 60;

        int price_Banana = banana_qty * banana;
        int price_Eggs = eggs_qty * egg;
        int price_Bread = bread_qty * bread;
        int price_Atta = atta_qty * atta;
        int price_Milk = milk_qty * milk;

        // Grand total
        int total_Bill = price_Banana + price_Eggs + price_Bread + price_Atta + price_Milk;

        // Output
        System.out.println("\n------ BILL DETAILS ------");

        System.out.println("Banana Price : " + price_Banana);
        System.out.println("Eggs Price   : " + price_Eggs);
        System.out.println("Bread Price  : " + price_Bread);
        System.out.println("Atta Price   : " + price_Atta);
        System.out.println("Milk Price   : " + price_Milk);

        System.out.println("--------------------------");
        System.out.println("Total Bill Amount : " + total_Bill);

        sc.close();
        }
    }
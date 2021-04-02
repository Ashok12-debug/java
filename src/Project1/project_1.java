package Project1;

import java.text.NumberFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
public class project_1 {
    public static void projectOne(){

        int feeds=0;
        double price=0;
        double taxRate=0.07;
        double tipRate= 0.15;
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are ordering (must be between 10 to 100): ");
        int people = input.nextInt();

        if (people>100 || people<10){
            System.out.println("Number of people are invalid.");
        }
        if (people<100 && people>10) {
            displayMainMenu();
        }
        System.out.println("Select the type of meal:");
        String foodType= input.next();
        switch (foodType) {
            case "Italian" -> displayItalianFoodMenu();
            case "Chinese" -> displayChineseFoodMenu();
            case "American" -> displayAmericanFoodMenu();
            default -> System.out.println("Enter a correct option.");
        }
        System.out.println("Enter a food tray to order:");
        int foodTray= input.nextInt();
       if (foodType.equals("Italian")){
          switch (foodTray){
              case 1 -> feeds=5;
              case 2 -> feeds=7;
              case 3 -> feeds=4;
              default -> System.out.println("Enter a correct option.");
          }
          switch (foodTray){
              case 1 -> price= 17.99;
              case 2 -> price= 15.99;
              case 3 -> price= 12.99;
              default -> System.out.println("Enter a correct option.");
          }
       }
        if (foodType.equals("Chinese")){
            switch (foodTray){
                case 1, 2 -> feeds=7;
                case 3 -> feeds=5;
                default -> System.out.println("Enter a correct option.");
            }
            switch (foodTray){
                case 1, 2 -> price= 18.99;
                case 3 -> price= 10.99;
                default -> System.out.println("Enter a correct option.");
            }
        }
        if (foodType.equals("American")){
            switch (foodTray){
                case 1 -> feeds=8;
                case 2 -> feeds=5;
                case 3 -> feeds=10;
                default -> System.out.println("Enter a correct option.");
            }
            switch (foodTray){
                case 1 -> price= 21.99;
                case 2 -> price= 22.99;
                case 3 -> price= 26.99;
                default -> System.out.println("Enter a correct option.");
            }
        }
        int trays = determineTrays( people,  feeds);
        double subtotal=getSubtotal( price, trays);
        double tax= getTax( subtotal,  taxRate);
        double tip= getTip(subtotal, tipRate);
        double grandTotal=getGrandTotal( subtotal,tax,tip);
        double perPerson=pricePerPerson(grandTotal,  people);
        int leftOvers=determineLeftOvers(feeds, trays,people);

        displayTotals(people, trays,feeds, subtotal, tax, tip, grandTotal, perPerson,leftOvers);

    }
    public static void displayMainMenu() {
        System.out.println("Type of food we have: ");
        System.out.println("1. Italian");
        System.out.println("2.Chinese");
        System.out.println("3.American");
    }
    public static void displayItalianFoodMenu(){
        System.out.println("ITALIAN FOOD MENU:");
        System.out.println("CHOOSE ONE ---");
        System.out.println("1.Lasagna Tray-Feeds 5 -17.99");
        System.out.println("2.Pizza Pack - Feeds 7 -15.99");
        System.out.println("3.Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
    }
    public static void displayChineseFoodMenu(){
        System.out.println("CHINESE FOOD MENU:");
        System.out.println("CHOOSE ONE ---");
        System.out.println("1.Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("2.Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("3.Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");

    }
    public static void displayAmericanFoodMenu(){
        System.out.println("AMERICAN FOOD MENU:");
        System.out.println("CHOOSE ONE ---");
        System.out.println("1.Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
        System.out.println("2.Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\n" +
                "22.99");
        System.out.println("3.Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
    }
    public static int determineTrays(int people, int feeds){
        int trays= people/feeds;
        if (people%feeds!=0){
            trays +=1;
        }
        return trays;
    }
    public static double getSubtotal(double price, int trays){
        return price*trays;
    }
    public static double getTax(double subtotal, double taxRate){
        return subtotal*taxRate;
    }
    public static double getTip(double subtotal, double tipRate){
        return subtotal*tipRate;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip){
        return subtotal+tax+tip;
    }
    public static double pricePerPerson(double grandTotal, int people){
        return grandTotal/people;
    }
    public static int determineLeftOvers(int feeds, int trays, int people){
        return (feeds*trays)-people;
    }
    public static void displayTotals (int people, int trays, int feeds, double subtotal,  double tax, double tip, double grandTotal, double perPerson, int leftOvers){
        NumberFormat formatter= new DecimalFormat("#0.00");
        System.out.println("You need "+trays+ " trays.");
        System.out.println("Feeds: " +feeds);
        System.out.println("Price for "+people+ " people ("+trays+"trays): " +formatter.format(subtotal));
        System.out.println("Tax: " +formatter.format(tax));
        System.out.println("Tip: "+formatter.format(tip));
        System.out.println("Total(food,tax,tip): " +formatter.format(grandTotal));
        System.out.println("Price per person:"+formatter.format(perPerson));
        System.out.println("Leftover servings for the delivery person: "+(leftOvers));
    }



    public static void main(String[] args) {
        projectOne();
    }
}

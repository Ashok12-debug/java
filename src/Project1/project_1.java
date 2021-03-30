package Project1;

import java.util.Scanner;

public class project_1 {

    public static void projectOne(){
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


    public static void main(String[] args) {
        projectOne();
    }
}

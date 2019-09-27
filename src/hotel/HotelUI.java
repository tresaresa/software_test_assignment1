package hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelUI {
    private static Controller controller;

    public static void main(String[] args){
        controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("*   Welcome to the Coder Hotel   *");
        System.out.println("**********************************");

        String option = "";
        while(!option.equalsIgnoreCase("x")){
            option = displayMenu(scanner);
        }
        System.out.println("See you ~~~");
    }

    public static String displayMenu(Scanner scanner){
        System.out.println("Menu:");
        System.out.println("1 View all clocks");
        System.out.println("2 Adjust Clocks");
        System.out.println("x Exit");
        String option = scanner.next();
        switch(option){
            case "1":
                viewAllClocks();
                return option;
            case "2":
                adjustClocks();
                return option;
            case "x":
                return option;
            default:
                System.out.println("Invalid input.");
                return option;

        }
    }

    public static void viewAllClocks(){
        ArrayList<Clock> a = controller.getCityClocks().getClocks();
        for(Clock c : a){
            System.out.println(c.getName() + " :" + c.getTime());
        }
    }

    public static void adjustClocks(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter current time(24 hour clock):");
        String t = scanner.next();
        controller.adjustClocks(Integer.parseInt(t));
    }
}

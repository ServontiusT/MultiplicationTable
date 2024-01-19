package org.servontiusturner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number between 1 & 10: ");
        int userNumber = Integer.parseInt(scanner.nextLine());

        numberMultiplier(userNumber, scanner);
    }

    public static void numberMultiplier(int number, Scanner scanner){
        while (true) {
            if (number > 10 || number <= 0) {
                System.out.println("Invalid number. Please enter a number larger than 0 and smaller than 11");
                number = Integer.parseInt(scanner.nextLine());
            } else {
                break;
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + number * i);
        }
    }
}

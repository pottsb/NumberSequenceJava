package com.company;

import java.util.Scanner;

public class Main {
    static float startNumber;
    static float newNumber;

    public static void main(String[] args) {
        generateSequence(Main.getNumber());
    }

    public static float getNumber(){
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please enter a number between 0.5 and 5.5: ");
            startNumber = in.nextFloat();
            if(startNumber < 0.5){
                System.out.println("That number is too small.");
                Main.getNumber();
            }
            else if(startNumber > 5.5){
                System.out.println("That number is too big.");
                Main.getNumber();
            }
            else{
            }
        }
        catch (Exception e){
            System.out.println("That doesn't look like a number to me.");
            Main.getNumber();
        }
       return startNumber;
    }
    public static void generateSequence(float startNumber){
        for (int i=0; i<6; i++) {
            newNumber = (float) (0.5 * (startNumber + (2.0 / startNumber)));
            double divSum = Float.parseFloat(String.format("%.3f",newNumber));
            System.out.println(divSum);
            startNumber = newNumber;
        }
    }
}


package com.example.tests;
import java.util.Random;

public class Bottleflip {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        x += 1;

        if (x > 15) {
            boolean y = true;
            System.out.println("sory botle broek");
        } else {
            boolean y = false;
            System.out.println("Bootle landed uprigth!");
        }

    }

}
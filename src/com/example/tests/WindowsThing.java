package com.example.tests;

import java.util.List;
import java.util.Scanner;

public class WindowsThing {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the windwows trouble shooter!?");
        Thread.sleep(4000);

        System.out.println("Would you like to begin the trouble shooter? (y/n)");
        String ans = sc.nextLine();

        if (ans.equals("y")) {
            Thread.sleep(3000);
            System.out.println("Beginning troubleshooter!");

            var numberList = List.of(5, 4, 3, 2, 1);
            numberList.forEach(number -> {
                System.out.println("Please wait " + number + " seconds ...");
                try {
                    Thread.sleep(1000);
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            });

            System.out.println("no trouble detected");
            Thread.sleep(3000);

            System.out.println("Would you like to close this applicaton? (y/n)");
            String ans2 = sc.nextLine();

            if (ans2.equals("y")){
                Thread.sleep(3000);
                System.out.println("Closing aplikation!");
            }

            else if (ans2.equals("n")){
                Thread.sleep(3000);
                System.out.println("Ok well closing anyway");
            }

            else {
                System.out.println("what");
            }


        } else if (ans.equals("n")) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Closing troubleshooter");
            // hopefully ends program here
        }

        else{
            System.out.println("Answer with y/n");
        }

//        var myStupidInstance = new StupidClass();
//        myStupidInstance.StupidMethodToPrintStuff();

    }
}

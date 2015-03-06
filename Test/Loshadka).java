package com.company;

import java.util.Scanner;

class DistCount {
    char x;
    char x1;
    double y;
    double y1;
    public double distCounter (char x, char x1,double y, double y1){
        return (Math.sqrt(Math.pow((x - x1), 2)+Math.pow((y - y1), 2)));
    }
}

public class Main {

    public static void main(String[] args) {
        DistCount horse = new DistCount();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter coordinate for x");
        char x = scan.next().charAt(0);
        System.out.println("Enter a digit coordinate for y");
        double y = scan.nextInt();
        System.out.println("Enter a letter coordinate for x1");
        char x1 = scan.next().charAt(0);
        System.out.println("Enter a digit coordinate for y1");
        double y1 = scan.nextInt();
        double dist = horse.distCounter(x, x1, y, y1);
        if (dist == Math.sqrt(5) && y > 0 && y1 > 0 && x > 64 && x < 73 && x1 > 64 && x1 < 73 && y < 9 && y1 < 9) {
            System.out.println("This is a right horse position");
        } else {
            System.out.println("This is a wrong position");
        }
        System.out.println(dist);

    }

}

package com.bridgelabz.demo;
import java.util.Scanner;
import java.lang.Math;


public class LineComparision {

    public static void main(String[] args) {

	// Displaying the Welcome Message
        System.out.println("welcome to Line Comparision Computation");

        int x1,x2,y1,y2;
        double r;

        System.out.println("enter first value");
        Scanner sc=new Scanner(System.in);
        x1=sc.nextInt();
        System.out.println("enter second value");
        x2=sc.nextInt();
        System.out.println("enter third point");
        y1=sc.nextInt();
        System.out.println("enter fourth point");
        y2=sc.nextInt();
        int a=x2-x1;
        int b=y2-y1;
        r=(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
        System.out.println("the length:" +r);
    }
}

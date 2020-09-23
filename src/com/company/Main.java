package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Height");
        input.nextLine();
        for (int x=0; x<8; x++) {
            for (int y=0; y<8; y++) {
                if (y <= x) {
                    System.out.print(" #");}
                else {System.out.print(" ");
                }
                }
            System.out.println();
    }
} }

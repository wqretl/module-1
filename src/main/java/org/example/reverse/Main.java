package org.example.reverse;

import org.example.reverse.reverse.Reverse;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Reverse r = new Reverse();
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
        System.out.println( r.reverseWord(str));
    }


    }

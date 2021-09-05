/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 3
 *  Copyright 2021 Matthew  Trump
 *
 *  This program will print a line asking for a quote
 *  Then it will take input from the user
 *  Next, the program will ask who said the quote
 *  Then it will take that input from the user
 *  Finally, it will print the person who said the
 *  quote followed by the quote itself
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = n.nextLine();
        System.out.println("Who said it? ");
        String who = n.nextLine();
        System.out.println(who + " says, \"" + quote + "\"");

    }
}

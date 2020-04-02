package com.company;

import java.util.Scanner;

class SentenceBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an article: ");
        String article = scanner.next();
        System.out.print("Please enter a noun: ");
        String noun = scanner.next();
        System.out.print("Please enter a verb: ");
        String verb = scanner.next();
        System.out.println(article + " " + noun + " " + verb);
    }
}


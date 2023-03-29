package com.password.java;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(sc);
        generator.mainLoop();
        sc.close();
    }
}

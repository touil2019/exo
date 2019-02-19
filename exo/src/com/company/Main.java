package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre a:" );
        a = sc.nextInt();

        System.out.println("Veuillez saisir un nombre b:" );
        b = sc.nextInt();
        int c = a/b;

        System.out.println("La division de b par a donne " + c);

    }


}

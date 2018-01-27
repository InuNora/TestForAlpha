package main;


import java.util.Scanner;

/**
 * Created by Konopatova on 25.01.2018.
 */



public class Main {
    public static void main(String[]args){

        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        DictonaryWithPriority myStructure = new DictonaryWithPriority(str);
        System.out.println(myStructure);

    }
}



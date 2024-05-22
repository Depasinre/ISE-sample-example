package com.numerology;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InputHandler {
    public static String[] getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first birthday (yyyy-mm-dd or dd MMMM yyyy):");
        String birthday1 = scanner.nextLine();
        System.out.println("Enter the second birthday (optional, press Enter to skip):");
        String birthday2 = scanner.nextLine();
        return new String[]{birthday1, birthday2};
    }

    public static String[] getInputFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String birthday1 = reader.readLine();
        String birthday2 = reader.readLine();
        reader.close();
        return new String[]{birthday1, birthday2};
    }
}

package com.numerology;

public class LuckyColourIdentifier {
    public static String getLuckyColour(int lifePathNumber) {
        return switch (lifePathNumber) {
            case 1 -> "Red";
            case 2 -> "Orange";
            case 3 -> "Yellow";
            case 4 -> "Green";
            case 5 -> "Blue";
            case 6 -> "Indigo";
            case 7 -> "Violet";
            case 8 -> "Pink";
            case 9 -> "Gold";
            case 11 -> "Silver";
            case 22 -> "Platinum";
            case 33 -> "Diamond";
            default -> "Unknown";
        };
    }
}

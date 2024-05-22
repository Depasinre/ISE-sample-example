package com.numerology;

public class LifePathCalculator {
    public static int calculateLifePathNumber(int year, int month, int day) {
        int yearSum = reduceToSingleDigit(year);
        int monthSum = reduceToSingleDigit(month);
        int daySum = reduceToSingleDigit(day);

        int lifePathNumber = yearSum + monthSum + daySum;
        lifePathNumber = reduceToMasterOrSingleDigit(lifePathNumber);

        return lifePathNumber;
    }

    private static int reduceToSingleDigit(int number) {
        while (number > 9) {
            number = sumDigits(number);
        }
        return number;
    }

    private static int reduceToMasterOrSingleDigit(int number) {
        while (number > 9 && number != 11 && number != 22 && number != 33 && number != 44) {
            number = sumDigits(number);
        }
        return number;
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}



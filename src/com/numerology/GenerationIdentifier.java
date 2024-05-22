package com.numerology;

public class GenerationIdentifier {
    public static String getGeneration(int year) {
        if (year >= 1901 && year <= 1927) return "Greatest Generation";
        if (year >= 1928 && year <= 1945) return "Silent Generation";
        if (year >= 1946 && year <= 1964) return "Baby Boomers";
        if (year >= 1965 && year <= 1980) return "Generation X";
        if (year >= 1981 && year <= 1996) return "Millennial's";
        if (year >= 1997 && year <= 2012) return "Generation Z";
        if (year >= 2013 && year <= 2024) return "Generation Alpha";
        return "Unknown Generation";
    }
}

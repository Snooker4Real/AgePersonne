package com.hb.ageCalculator;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static int calculateAge(LocalDate anniv, LocalDate aujourdhui) {
        if ((anniv != null) && (aujourdhui != null)) {
            return Period.between(anniv, aujourdhui).getYears();
        } else {
            return 0;
        }
    }
}

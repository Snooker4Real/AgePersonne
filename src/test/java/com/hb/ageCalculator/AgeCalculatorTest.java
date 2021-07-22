package com.hb.ageCalculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AgeCalculatorTest {

    @Test
    public void testCalculateAge_Success(){
        //setup
        LocalDate anniv = LocalDate.of(1999,8,5);
        //exercise
        int actual = AgeCalculator.calculateAge(anniv, LocalDate.of(2021,7,22));
        //assert
        Assert.assertEquals(21,actual);
    }

}
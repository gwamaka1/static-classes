package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    @Test
    public void format_TwoNames_ReturnsLastNameCommaFirstName(){
        //Act and Arrange
        String ans = NameFormatter.format("maka","mwamtobe");
        //Assert
        assertEquals("mwamtobe, maka",ans);
    }
    @Test
    public void format_FullNameWithPrefixMiddleNameAndSuffix_ReturnLastNameCommaPrefixFirstNameMiddleNameCommaSuffix(){
        //Act and Arrange
        String ans = NameFormatter.format("Dr.","maka","B","mwamtobe","PhD");
        //Assert
        assertEquals("mwamtobe, Dr. maka B, PhD",ans);
    }
    @Test
    public void format_FullNameWithMiddleNameAndSuffix_ReturnsLastNameCommaFirstNameMiddleNameCommaSuffix() {
        // Act and Arrange
        String ans = NameFormatter.format("maka B mwamtobe, PhD");

        // Assert
        assertEquals("mwamtobe, maka B, PhD", ans);
    }

}
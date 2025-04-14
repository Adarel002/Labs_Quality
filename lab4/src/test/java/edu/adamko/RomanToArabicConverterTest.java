package edu.adamko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rooxaan
 * @version 1.0.0
 * @project lab4
 * @class RomanToArabicConverterTest
 * @since 12.04.2025 - 23.47
 */

public class RomanToArabicConverterTest {
    @Test
    void givenNullInput_expectNullPointerException() {
        assertThrows(NullPointerException.class,
                () -> RomanToArabicConverter.romanToArabic(null));
    }

    @Test
    void whenCyrillicAIsProvided_shouldThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("А"));
        assertTrue(ex.getMessage().contains("А cannot be converted to a Roman Numeral"));
    }

    @Test
    void inputStringTab_shouldCauseIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("\t"));
        assertTrue(ex.getMessage().contains(" cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenXYZInput_thenExpectIllegalArgument() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("XYZ"));
        assertTrue(ex.getMessage().contains("XYZ cannot be converted to a Roman Numeral"));
    }

    @Test
    void shouldThrowIfCyrillicВIsProvided() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("В"));
        assertTrue(ex.getMessage().contains("В cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputDMShouldThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("DM"));
        assertTrue(ex.getMessage().contains("DM cannot be converted to a Roman Numeral"));
    }


    @Test
    void whenQInput_thenIllegalArgumentExpected() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("Q"));
        assertTrue(ex.getMessage().contains("Q cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputIDInputProvided_thenExpectIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("ID"));
        assertTrue(ex.getMessage().contains("ID cannot be converted to a Roman Numeral"));
    }

    @Test
    void shouldThrowOnInvalidPatternVX() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("VX"));
        assertTrue(ex.getMessage().contains("VX cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputILThenShouldFailConversion() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("IL"));
        assertTrue(ex.getMessage().contains("IL cannot be converted to a Roman Numeral"));
    }

    @Test
    void inputCyrillicТ_mustThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("Т"));
        assertTrue(ex.getMessage().contains("Т cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputIsNewline_thenIllegalArgumentExpected() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("\n"));
        assertTrue(ex.getMessage().contains(" cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputIsRandomUnicodeChars_thenShouldThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("✌️✨💥"));
        assertTrue(ex.getMessage().contains("✌️✨💥 cannot be converted to a Roman Numeral"));
    }

}
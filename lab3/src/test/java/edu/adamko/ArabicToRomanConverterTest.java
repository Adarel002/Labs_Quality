package edu.adamko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rooxaan
 * @version 1.0.0
 * @project lab3
 * @class RomanNumeral
 * @since 04.04.2025 - 23.59
 */


class ArabicToRomanConverterTest {

    @Test
    void whenArabic_2_ThenRomanII() {
        Assertions.assertEquals("II", ArabicToRomanConverter.arabicToRoman(2));
    }

    @Test
    void whenArabic_6_ThenRomanVI() {
        Assertions.assertEquals("VI", ArabicToRomanConverter.arabicToRoman(6));
    }

    @Test
    void whenArabic_7_ThenRomanVII() {
        Assertions.assertEquals("VII", ArabicToRomanConverter.arabicToRoman(7));
    }

    @Test
    void whenArabic_11_ThenRomanXI() {
        Assertions.assertEquals("XI", ArabicToRomanConverter.arabicToRoman(11));
    }

    @Test
    void whenArabic_12_ThenRomanXII() {
        Assertions.assertEquals("XII", ArabicToRomanConverter.arabicToRoman(12));
    }

    @Test
    void whenArabic_15_ThenRomanXV() {
        Assertions.assertEquals("XV", ArabicToRomanConverter.arabicToRoman(15));
    }

    @Test
    void whenArabic_18_ThenRomanXVIII() {
        Assertions.assertEquals("XVIII", ArabicToRomanConverter.arabicToRoman(18));
    }

    @Test
    void whenArabic_21_ThenRomanXXI() {
        Assertions.assertEquals("XXI", ArabicToRomanConverter.arabicToRoman(21));
    }

    @Test
    void whenArabic_25_ThenRomanXXV() {
        Assertions.assertEquals("XXV", ArabicToRomanConverter.arabicToRoman(25));
    }

    @Test
    void whenArabic_35_ThenRomanXXXV() {
        Assertions.assertEquals("XXXV", ArabicToRomanConverter.arabicToRoman(35));
    }

    @Test
    void whenArabic_38_ThenRomanXXXVIII() {
        Assertions.assertEquals("XXXVIII", ArabicToRomanConverter.arabicToRoman(38));
    }

    @Test
    void whenArabic_41_ThenRomanXLI() {
        Assertions.assertEquals("XLI", ArabicToRomanConverter.arabicToRoman(41));
    }

    @Test
    void whenArabic_45_ThenRomanXLV() {
        Assertions.assertEquals("XLV", ArabicToRomanConverter.arabicToRoman(45));
    }

    @Test
    void whenArabic_48_ThenRomanXLVIII() {
        Assertions.assertEquals("XLVIII", ArabicToRomanConverter.arabicToRoman(48));
    }

    @Test
    void whenArabic_55_ThenRomanLV() {
        Assertions.assertEquals("LV", ArabicToRomanConverter.arabicToRoman(55));
    }

    @Test
    void whenArabic_95_ThenRomanXCV() {
        Assertions.assertEquals("XCV", ArabicToRomanConverter.arabicToRoman(95));
    }

    @Test
    void whenArabic_98_ThenRomanXCVIII() {
        Assertions.assertEquals("XCVIII", ArabicToRomanConverter.arabicToRoman(98));
    }

    @Test
    void whenArabic_101_ThenRomanCI() {
        Assertions.assertEquals("CI", ArabicToRomanConverter.arabicToRoman(101));
    }

    @Test
    void whenArabic_401_ThenRomanCDI() {
        Assertions.assertEquals("CDI", ArabicToRomanConverter.arabicToRoman(401));
    }

    @Test
    void whenArabic_445_ThenRomanCDXLV() {
        Assertions.assertEquals("CDXLV", ArabicToRomanConverter.arabicToRoman(445));
    }

    @Test
    void whenArabic_550_ThenRomanDL() {
        Assertions.assertEquals("DL", ArabicToRomanConverter.arabicToRoman(550));
    }

    @Test
    void whenArabic_650_ThenRomanDCL() {
        Assertions.assertEquals("DCL", ArabicToRomanConverter.arabicToRoman(650));
    }

    @Test
    void whenArabic_901_ThenRomanCMI() {
        Assertions.assertEquals("CMI", ArabicToRomanConverter.arabicToRoman(901));
    }

    @Test
    void whenArabic_945_ThenRomanCMXLV() {
        Assertions.assertEquals("CMXLV", ArabicToRomanConverter.arabicToRoman(945));
    }

    @Test
    void whenArabic_1002_ThenRomanMII() {
        Assertions.assertEquals("MII", ArabicToRomanConverter.arabicToRoman(1002));
    }

    @Test
    void whenArabic_1555_ThenRomanMDLV() {
        Assertions.assertEquals("MDLV", ArabicToRomanConverter.arabicToRoman(1555));
    }

    @Test
    void whenArabic_1777_ThenRomanMDCCLXXVII() {
        Assertions.assertEquals("MDCCLXXVII", ArabicToRomanConverter.arabicToRoman(1777));
    }

    @Test
    void whenArabic_1888_ThenRomanMDCCCLXXXVIII() {
        Assertions.assertEquals("MDCCCLXXXVIII", ArabicToRomanConverter.arabicToRoman(1888));
    }

    @Test
    void whenArabic_1995_ThenRomanMCMXCV() {
        Assertions.assertEquals("MCMXCV", ArabicToRomanConverter.arabicToRoman(1995));
    }

    @Test
    void whenArabic_2222_ThenRomanMMCCXXII() {
        Assertions.assertEquals("MMCCXXII", ArabicToRomanConverter.arabicToRoman(2222));
    }

    @Test
    void whenArabic_2888_ThenRomanMMDCCCLXXXVIII() {
        Assertions.assertEquals("MMDCCCLXXXVIII", ArabicToRomanConverter.arabicToRoman(2888));
    }

    @Test
    void whenArabic_3555_ThenRomanMMMDLV() {
        Assertions.assertEquals("MMMDLV", ArabicToRomanConverter.arabicToRoman(3555));
    }

    @Test
    void whenArabic_3987_ThenRomanMMMCMLXXXVII() {
        Assertions.assertEquals("MMMCMXCVII", ArabicToRomanConverter.arabicToRoman(3997));
    }

    @Test
    void whenArabic_0_ThenIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArabicToRomanConverter.arabicToRoman(0));
    }

    @Test
    void whenArabic_negative5_ThenIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArabicToRomanConverter.arabicToRoman(-5));
    }

    @Test
    void whenArabic_5000_ThenIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArabicToRomanConverter.arabicToRoman(5000));
    }
    @Test
    void whenArabic_1_ThenRomanI() {
        Assertions.assertEquals("I", ArabicToRomanConverter.arabicToRoman(1));
    }

    @Test
    void whenArabic_3_ThenRomanIII() {
        Assertions.assertEquals("III", ArabicToRomanConverter.arabicToRoman(3));
    }

    @Test
    void whenArabic_4_ThenRomanIV() {
        Assertions.assertEquals("IV", ArabicToRomanConverter.arabicToRoman(4));
    }

    @Test
    void whenArabic_9_ThenRomanIX() {
        Assertions.assertEquals("IX", ArabicToRomanConverter.arabicToRoman(9));
    }

    @Test
    void whenArabic_14_ThenRomanXIV() {
        Assertions.assertEquals("XIV", ArabicToRomanConverter.arabicToRoman(14));
    }

    @Test
    void whenArabic_40_ThenRomanXL() {
        Assertions.assertEquals("XL", ArabicToRomanConverter.arabicToRoman(40));
    }

    @Test
    void whenArabic_90_ThenRomanXC() {
        Assertions.assertEquals("XC", ArabicToRomanConverter.arabicToRoman(90));
    }

    @Test
    void whenArabic_400_ThenRomanCD() {
        Assertions.assertEquals("CD", ArabicToRomanConverter.arabicToRoman(400));
    }

    @Test
    void whenArabic_900_ThenRomanCM() {
        Assertions.assertEquals("CM", ArabicToRomanConverter.arabicToRoman(900));
    }

    @Test
    void whenArabic_3999_ThenRomanMMMCMXCIX() {
        Assertions.assertEquals("MMMCMXCIX", ArabicToRomanConverter.arabicToRoman(3999));
    }
}
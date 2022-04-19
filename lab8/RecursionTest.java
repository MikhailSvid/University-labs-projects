package lab8;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RecursionTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Test
    public void test_999_NoLoop() {

        try {
            File file = new File("src/lab8/Recursion.java");
            Scanner myReader = new Scanner(file);
            Pattern pattern = Pattern.compile("(for|while)\\s*\\(");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    fail("Do NOT use any loop!");
                }
            }
            myReader.close();
        }
        catch (Exception ex) {
            fail("File does not exist.");
        }
    }

    @Test
    public void test_Task1_00_1() {

        long input = 1;
        int expected = 0;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_01_21() {

        long input = 21;
        int expected = 0;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_02_22() {

        long input = 22;
        int expected = 1;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_03_222() {

        long input = 222;
        int expected = 1;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_04_484() {

        long input = 484;
        int expected = 2;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_05_large() {

        long input = 123123123;
        int expected = 6;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_06_large() {

        long input = 321321321321321L;
        int expected = 10;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task1_07_large() {

        long input = 3141592653589793238L;
        int expected = 13;
        int actual = Recursion.logarithmBase22(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_00_EmptyString() {

        String inputStr = "";
        int expected = 0;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_01_OneChar() {

        String inputStr = "A";
        int expected = 0;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_02_TwoChar() {

        String inputStr = "LO";
        int expected = 0;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_03_ThreeChar_LOL() {

        String inputStr = "LOL";
        int expected = 1;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_04_LOLOL() {

        String inputStr = "LOLOL";
        int expected = 2;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_05_OLOLOLO() {

        String inputStr = "OLOLOLO";
        int expected = 2;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_06_Long() {

        String inputStr = "OLOLOLOLABLOLXYLOLOL";
        int expected = 6;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task2_07_Long() {

        String inputStr = "ABLOLDELOLOLOLOLOLOLOLOLZ";
        int expected = 9;
        int actual = Recursion.countLOL(inputStr);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_00_OneNumber() {

        int[] input = {2};
        int expected = 0;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_01_TwoNumbers1() {

        int[] input = {2, 3};
        int expected = 1;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_02_TwoNumbers2() {

        int[] input = {4, 2};
        int expected = 0;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_03_Increasing() {

        int[] input = {2, 3, 4, 5};
        int expected = 3;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_04_Decreasing() {

        int[] input = {7, 6, 5, 4, 3};
        int expected = 0;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_05_Small() {

        int[] input = {1, 3, 2};
        int expected = 1;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_06_Long() {

        int[] input = {1, 3, 5, 7, 9, 11, 10, 8, 6};
        int expected = 5;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_Task3_07_Long() {

        int[] input = {1, 11, 10, 8, 6, 4, 2};
        int expected = 1;
        int actual = Recursion.findPeakIndex(input);
        assertEquals(expected, actual);
    }
}

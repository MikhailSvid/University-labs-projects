package lab8;

/**
 * NOTE: You must NOT use any kind of LOOP (neither for-loop nor while-loop) in any task of this lab.
 * Violating this rule will result in a mark of zero.
 */
public class Recursion {

    /**
     * Given a positive integer number, return the result of log(number) base 22,
     * with result rounded down to the floor integer.
     */
    public static int logarithmBase22(long number) {

        // TODO Task 1: implement this recursive method
        if (number < 22){
            return 0;
        }
        else{
            return 1+logarithmBase22(number/22);
        }
    }

    /**
     * Return the number of occurrences of the substring "LOL" in the input string
     *
     * Assumption: the inputStr consists of ONLY uppercase letter. It can be an empty string.
     *
     * Read the JUnit test cases for detailed specification.
     */
    public static int countLOL(String inputStr) {

        // TODO Task 2: Complete this recursive method.
        if (inputStr.length() < 3){
            return 0;
        }
        else{

            if (inputStr.charAt(inputStr.length()-1) == 'L' && inputStr.charAt(inputStr.length()-2) == 'O' && inputStr.charAt(inputStr.length()-3) == 'L'){
                return 1+countLOL(inputStr.substring(0, inputStr.length()-1));
            }
            else{
                return countLOL(inputStr.substring(0, inputStr.length()-1));
            }
        }
    }

    /**
     * Given an array of numbers that follow an increasing-then-decreasing order
     * (including the cases of only-increasing and only-decreasing),
     * return the index of the peak (maximum) element.
     *
     * Assumption:
     *  - All numbers in the input array are distinct.
     *  - The input array is non-empty.
     *
     * Read the JUnit test cases for detailed specification.
     */
    public static int findPeakIndex(int[] numbers) {

        // Do NOT modify this method. Implement the helper method instead.
        return findPeakIndexHelper(numbers, 0, numbers.length-1);
    }

    /**
     * Helper method for findPeakIndex
     */
    public static int findPeakIndexHelper(int[] numbers, int startIndex, int endIndex) {
        if (endIndex == startIndex){
            return endIndex;
        }
        else{
            if (numbers[endIndex] > numbers[startIndex]){
                return findPeakIndexHelper(numbers, startIndex+1, endIndex);
            }
            else{
                return findPeakIndexHelper(numbers, startIndex, endIndex-1);
            }
        }

        // TODO Task 3: Complete this recursive method.
    }
}


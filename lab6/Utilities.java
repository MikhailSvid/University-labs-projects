package lab6;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getMultiplesOf3(int[] numbers) {

        /* TODO: Your implementation ends here. */
        int ctr = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0){
                ctr += 1;
            }
        }

        int[] result = new int[ctr];

        ctr = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0){
                result[ctr] = numbers[i];
                ctr += 1;
            }
        }

        return result; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Assumptions:
     * 	- numbers.length >= 1
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static String[] getAllPrefixes(int[] numbers) {
        /* TODO: Your implementation ends here. */

        String str = "[";

        if (numbers.length == 0){
            String [] result = new String [0];
            return result;
        }
        else {
            String [] result = new String [numbers.length];

            str += String.format("%d", numbers[0]);
            result[0] = str + "]";
            for (int i = 1; i < numbers.length; i++){
                str += ", ";
                str += String.format("%d", numbers[i]);
                result[i] = str + "]";
            }
            return result;
        }
        // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getGroupedNumbers(int[] numbers) {

        /* TODO: Your implementation ends here. */

        int ctr = 0;
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                result[ctr] = numbers[i];
                ctr += 1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 1) {
                result[ctr] = numbers[i];
                ctr += 1;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 2) {
                result[ctr] = numbers[i];
                ctr += 1;
            }
        }

        return result; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `twoDimArray` : a 2D array of integers
     *
     * Note: the sub-arrays may have different sizes.
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] zigZagFlatten(int[][] twoDimArray) {

        /* TODO: Your implementation ends here. */
        int a;
        int length = 0;
        int ctr = 0;

        for (int i = 0; i < twoDimArray.length; i++){
            length += twoDimArray[i].length;
            for (int j = 0; j < twoDimArray[i].length; j++){
                for (int k = 0; k < twoDimArray[i].length - 1; k++){
                    if (i % 2 == 0){
                        if (twoDimArray[i][k] > twoDimArray[i][k + 1]) {
                            a = twoDimArray[i][k];
                            twoDimArray[i][k] = twoDimArray[i][k + 1];
                            twoDimArray[i][k + 1] = a;
                        }
                    }
                    else {
                        if (twoDimArray[i][k] < twoDimArray[i][k + 1]) {
                            a = twoDimArray[i][k + 1];
                            twoDimArray[i][k + 1] = twoDimArray[i][k];
                            twoDimArray[i][k] = a;
                        }
                    }
                }
            }
        }
        int[] result = new int[length];
        for (int i = 0; i < twoDimArray.length; i++){
            for (int j = 0; j < twoDimArray[i].length; j++){
                result[ctr] = twoDimArray[i][j];
                ctr += 1;
            }
        }
        return result; // You need to replace this line by returning the proper result.
    }
}

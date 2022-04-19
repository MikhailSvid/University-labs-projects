package lab4;
/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class VendingMachine {
        // TODO: implement this class

    private String displayMessage = "Empty VM Started";
    private String[] menu = new String[4];
    private int[] stock = new int[4];

    public VendingMachine(){
        fill(menu);
        fill(stock);
    }

    private void fill(int[] arr){
        for (int i = 0; i < 4; i++){
            arr[i] = 0;
        }
    }

    private void fill(String[] arr){
        arr[0] = "Cheetos Crunchy";
        arr[1] = "Coke";
        arr[2] = "Doritos Nacho Cheese";
        arr[3] = "Red Bull";
    }

    public String getMessage(){
        return displayMessage;
    }

    public String checkStock(){
        String result = "Stock: ";
        for (int i = 0; i < 4; i++ ){
            if (i != 3) {
                result = result + String.format("%s (%d), ", menu[i], stock[i]);
            }
            else {
                result = result + String.format("%s (%d)", menu[i], stock[i]);
            }
        }
        return result;
    }

    public String checkStock(String product){
        boolean match = false;
        int ctr = 0;
        String result = "";

        while(!match && ctr < 4){
            if (product.equals(menu[ctr])){
                result = String.format("%s (%d)", menu[ctr], stock[ctr]);
                match = true;
            }
            ctr++;
        }

        if (match){
            return result;
        }
        else {
            return String.format("Invalid product: %s", product);
        }
    }

    public void add(String product, int amount){
        boolean match = false;
        int ctr = 0;

        while (!match && ctr < 4){
            if (product.equals(menu[ctr])){
                stock[ctr] += amount;
                match = true;
            }
            ctr++;
        }
        if (match){
            displayMessage = String.format("Product added: %s (%d)", product, amount);
        }
        else {
            displayMessage = String.format("Invalid product: %s", product);
        }
    }

    public void dispense(String product, int amount){
        boolean match = false;
        int ctr = 0;

        while (!match && ctr < 4){
            if (product.equals(menu[ctr])){
                stock[ctr] -= amount;
                match = true;
            }
            ctr++;
        }
        if (match){
            displayMessage = String.format("Product removed: %s (%d)", product, amount);
        }
        else {
            displayMessage = String.format("Invalid product: %s", product);
        }
    }
}

package GeeksforGeeks;

public class SwapTwoNumbersUsingAuxiliaryMemory {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);
    }
}
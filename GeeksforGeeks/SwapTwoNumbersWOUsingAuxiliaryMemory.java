package GeeksforGeeks;

public class SwapTwoNumbersWOUsingAuxiliaryMemory {
    public static void main(String[] args) {
        int a = 45;
        int b = 30;

        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);
    }
}

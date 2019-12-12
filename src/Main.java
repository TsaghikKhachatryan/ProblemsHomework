public class Main {

    public static void main(String[] args) {
        sortingDoubleArrayInDescendingOrder();

    }


    //Problem1 : initializing an array and printing
    private void initAndPrintArr() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //Problem2 : initializing an array of int with 0 values
    private static void fillArrWithZeros() {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //Problem3 : initializing an array of int with this range's numbers [1;1000]
    private static void fillArrFromOneToThousand() {
        int arr[] = new int[1000];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
    }

    //Problem4 : initializing an array of byte  with even numbers in the range  [-30;30]
    private static void fillWithEvenNumbers() {
        byte arr[] = new byte[30];
        byte index = 0;
        for (byte i = -30; i <= 30; i = (byte) (i + 2)) {
            if (i % 2 == 0 && i != 0) {
                arr[index] = i;
                ++index;
            }
        }
    }


    //Problem5 : initializing an array of short with odd numbers in this range [1;300]
    private static void fillWithOddNumbers() {
        short arr[] = new short[300];
        short index = 0;
        for (short i = 1; i <= arr.length; i = (short) (i + 1)) {
            if (i % 2 != 0 && i != 0) {
                arr[index] = i;
                System.out.println(arr[index]);
                ++index;
            }
        }
    }

    //Problem6 : initializing an array of int and print elements that are divisible by 5
    private static void divisibleByFive() {
        int[] arr = {45, 7, 5, 8, 4, 1, 2, 3, 15, 65, 85};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    //Problem7 : initializing an array of double  and print elements that are bigger than 24.56
    private static void biggerThanGiverNumber(double number) {
        double[] arr = {24.88, 4.255, 65.89, 24.59};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > number) {
                System.out.println(arr[i]);
            }
        }
    }

    //Problem8 : initializing an array of float  and print elements that are bigger than 35.56 and less than -34.556
    private static void biggerOrSmallerFromGivenNumbers(float num1, float num2) {
        float[] arr = {36.55f, -55.66f, 1f, 4f, 77.5f};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 35.56 || arr[i] < -34.556) {
                System.out.println(arr[i]);
            }
        }
    }

    //Problem9a : initializing an array of double and sort it in ascending  order
    private static void sortingDoubleArrayInascendingOrder() {
        double[] arr = {24.88, 4.255, 65.89, 24.59};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Problem9b : initializing an array of double and sort it  descending order
    private static void sortingDoubleArrayInDescendingOrder() {
        double[] arr = {24.88, 4.255, 65.89, 24.59};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Problem10 : Printing a simbols count in given String
    private static void contOfa(String string){
        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)=='a'){
                ++count;
            }
        }
        System.out.println(count);
    }


}


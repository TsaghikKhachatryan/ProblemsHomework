public class Main {

    public static void main(String[] args) {

        //**********************************TASK1**************************************

//        initAndPrintArr();
//        fillArrWithZeros();
//        fillArrWithZeros();
//        fillArrFromOneToThousand();
//        fillWithEvenNumbers();
//        fillWithOddNumbers();
//        divisibleByFive();
//        biggerThanGiverNumber();
//        biggerOrSmallerFromGivenNumbers();
//        sortingDoubleArrayInAscendingOrder();
//        sortingDoubleArrayInDescendingOrder();
//        countOfa();
//        isContainB();
//        countOfTwoDegreeNumbers();

        //**********************************TASK2**************************************
//
//        int sum = FunctionManager.sumOfTwoNumbers(5, 77);
//        double mul = FunctionManager.multiplicationOfTwoNumbers(5.2, 7.55);
//        FunctionManager.isGrater(57.2f, 7.5f);
//        FunctionManager.greatestFromThree(57785, 75555, 8922);
//
//        Human human1 = new Human("Ann", "Khachatryan", "femaile", 2000);
//        Human human2 = new Human("Ani", "Melqonyan", "femaile", 2011);
//        Human human3 = new Human("John", "Smith", "femaile", 1996);
//
//        Human[] arrHuman = {human1, human2, human3};
//
//        FunctionManager.checkingGender(human1);
//        FunctionManager.biggestLastName(human1, human2, human3);
//        FunctionManager.PrintNamesNextEachOther(human1, human3);
//        FunctionManager.printNames(human2, true);
//
//        int[] arr = {2, 3, 4, 5, 6};
//        float[] arrFloat = {2.0f, 3.5f, 4.66f, 5.477f, 6.144f};
//        FunctionManager.maxNumberInArray(arr);
//        FunctionManager.minNumberInArray(arrFloat);
//        FunctionManager.sortingHumanArray(arrHuman);

    }

    //Problem1 : initializing an array and printing
    private static void initAndPrintArr() {
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
    private static void biggerThanGiverNumber() {
        double[] arr = {24.88, 4.255, 65.89, 24.59};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > 24.56) {
                System.out.println(arr[i]);
            }
        }
    }

    //Problem8 : initializing an array of float  and print elements that are bigger than 35.56 and less than -34.556
    private static void biggerOrSmallerFromGivenNumbers() {
        float[] arr = {36.55f, -55.66f, 1f, 4f, 77.5f};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 35.56 || arr[i] < -34.556) {
                System.out.println(arr[i]);
            }
        }
    }

    //Problem9a : initializing an array of double and sort it in ascending  order
    private static void sortingDoubleArrayInAscendingOrder() {
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

    //Problem10 : Printing a symbols count in given String
    private static void countOfa() {
        String string = "hhsbjbaanbjjaa";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                ++count;
            }
        }
        System.out.println(count);
    }

    //Problem11 : Printing Yes if String contains b char and No otherwise
    private static void isContainB() {
        String string = "bhhjkjhhjsk";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'b') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    //Problem12 : calculate the number of elements that are 2 degrees
    private static void countOfTwoDegreeNumbers() {
        int arr[] = {4, 8, 5, 6, 1, 2, 3, 16, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                if (arr[i] == 1) {
                    ++count;
                    break;
                } else if (arr[i] % 2 != 0) {
                    break;
                } else {
                    arr[i] /= 2;
                }
            }
        }
        System.out.println(count);
    }
}


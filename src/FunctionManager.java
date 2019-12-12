public class FunctionManager {

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static double multiplicationOfTwoNumbers(double a, double b) {
        return a * b;
    }

    public static void isGrater(float a, float b) {
        if (a > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void greatestFromThree(long a, long b, long c) {
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

    public static void checkingGender(Human human) {
        if (human.gender.equals("male")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static String biggestLastName(Human human1, Human human2, Human human3) {
        return (human1.year < human2.year ? (human1.year < human3.year ? human1.lastName : human3.lastName) : (human2.year < human3.year ? human2.lastName : human3.lastName));
    }

    public static void PrintNamesNextEachOther(Human human1, Human human2) {
        System.out.println(human1.firstName + human2.firstName);
    }

    public static void printNames(Human human1, boolean isfirstName) {
        System.out.println(isfirstName ? human1.firstName : human1.lastName);
    }

    public static int maxNumberInArray(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static float minNumberInArray(float[] arr) {
        float minNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minNumber > arr[i]) {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static void sortingHumanArray(Human[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].year > arr[j + 1].year) {
                    Human temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

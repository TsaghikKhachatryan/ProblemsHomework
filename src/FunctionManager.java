public class FunctionManager {
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static double multiplicationOfTwoNumbers(double a, double b) {
        return a * b;
    }

    public static void isGreatter(float a, float b) {
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
        if (human.gender == "male") {
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

    public static void printNames(Human human1, boolean isfirstname) {
        System.out.println(isfirstname ? human1.firstName : human1.lastName);
    }

    public static int maxNumberInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[0];
    }

    public static float minNumberInArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[0];
    }

    public static void sortingHuamnArray(Human[] arr) {
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

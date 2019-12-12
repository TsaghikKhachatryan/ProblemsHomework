public class Main {

    public static void main(String[] args) {
        //Problem1 : initializing an array and printing
        /*int arr[]={1,2,3,4,5,6};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //Problem2 : initializing an array of int with 0 values
        /*int arr[]=new int[10];
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //Problem3 : initializing an array of int with this range's numbers [1;1000]
        /*int arr[]=new int[100];
        for (int i = 1; i <=arr.length; i++) {
            arr[i-1]=i;
        }*/

        //Problem4 : initializing an array of byte  with even numbers in the range  [-30;30]
        /*byte arr[]=new byte[30];
        byte index=0;
        for (byte i = -30; i <= 30; i=(byte)(i+2)) {
            if(i%2==0 && i!=0){
                arr[index]=i;
                ++index;
            }
        }*/

        //Problem5 : initializing an array of short with this range's numbers [1;300]
        /*short arr[]=new short[300];
        short index=0;
        for (short i = 1; i <=arr.length; i=(short)(i+1)) {
            if(i%2!=0 && i!=0){
                arr[index]=i;
                System.out.println(arr[index]);
                ++index;
            }
        }*/

        //Problem6 : initializing an array of int and print elements that are divisible by 5
        /*int[] arr = {45, 7, 5, 8, 4, 1, 2, 3, 15, 65, 85};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }*/

        //Problem6 : initializing an array of double  and print elements that are bigger than 24.56
        /*double[] arr={24.88,4.255,65.89,24.59};
        for (int i = 0; i <arr.length ; ++i) {
            if(arr[i]>24.56){
                System.out.println(arr[i]);
            }
        }*/

    }
}

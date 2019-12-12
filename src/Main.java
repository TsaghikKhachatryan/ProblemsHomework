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

    }
}

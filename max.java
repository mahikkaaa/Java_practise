import java.util.*;
public class max {
    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("enter the element at " + i + "th position");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = takeInput();
        int lar = largest(arr);
        System.out.println(lar);
    }
}

import java.util.*;

public class forEachLoopArray {

    public static Scanner scn = new Scanner (System.in);

    // the input for each loop never work in array. bcz it is only for printing array only with increment of 1.
    // public static void input2 (int[] arr) {
    //     for (int ele : arr){
    //         arr [ele] = scn.nextInt();
    //     }
    // }

    public static void output2 (int[] arr) {
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main (String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        input2(arr);
        output2(arr);
    }
    
}

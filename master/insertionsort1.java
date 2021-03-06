import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void insertIntoSorted(int[] ar) {
        int i = ar.length - 2;
        int insertVal = ar[ar.length - 1];
        boolean placed = false;
        while (!placed && i >= 0) {
            if(ar[i] > insertVal) {
                ar[i+1] = ar[i--];
            } else {
                ar[i+1] = insertVal;
                placed = true;
            }
            printArray(ar);
        }
        if (!placed) {
            ar[0] = insertVal;
            printArray(ar);
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}


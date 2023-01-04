package union_intersection_array;

import java.util.ArrayList;

public class Main {
	
	static void findUnion(int[] arr1, int[] arr2, int m, int n) {
		int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
 
        /* Print remaining elements of
         the larger array */
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
		
		
	}
	static void findIntersection(int[] arr1, int[] arr2, int m, int n) {
		int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
 
       
		
		
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,6};
		int[] arr1= {4,5,6,7,8};
		findUnion(arr,arr1,5,5);
		findIntersection(arr,arr1,5,5);
		
	}
}

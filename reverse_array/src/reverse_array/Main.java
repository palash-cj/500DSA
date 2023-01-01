package reverse_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// method 1 Using For Loop
public class Main {
	public static void reverseArray(int[] array) {
		int length=array.length;
		int[] revArr=new int[length]; 
		for(int i=0;i<length;i++) {
			revArr[i]=array[length-(i+1)];
			System.out.print(revArr[i]+" ");
		}
		
		
	}
	public static void main(String args[]) {
		int[] array= {1,2,3,4,5};
		reverseArray(array);
	}

}

// method 2 using while loop
//public class Main {
//	public static void reverseArray(int[] array) {
//		int l=array.length;
//		int[] revArr=new int[l];
//		int i=0;
//		while(l != 0) {
//			revArr[i]=array[l-1];
//			System.out.print(revArr[i]+" ");
//			l--;
//			i++;
//		}
//	}
//	public static void main(String args[]) {
//		int[] array= {1,2,3,4,5};
//		reverseArray(array);
//	}
//
//}

//method 3 using swapping
//public class Main {
//	public static void reverseArray(int[] array) {
//		int l=array.length;
//		int i=0;
//		while(i<=l/2) {
//			int temp=array[i];
//			array[i]=array[l-1-i];
//			array[l-1-i]=temp;
//			i++;
//		}		
//		for(int j=0;j<l;j++) {
//			System.out.print(array[j]+" ");
//		}
//	}
//	public static void main(String args[]) {
//		int[] array= {1,2,3,4,5};
//		reverseArray(array);
//	}
//}

// method 4 recursion
//public class Main {
//	public static void reverseArray(int[] array, int start, int end) {
//		if(start>=end) {
//			for(int i=0;i<array.length;i++) {
//				System.out.print(array[i]+" ");
//			}
//			return;
//		}else {
//			int temp=array[start];
//			array[start]=array[end];
//			array[end]=temp;
//			start++;
//			end--;
//			reverseArray(array,start,end);
//		}
//		
//	}
//	public static void main(String args[]) {
//		int[] array= {1,2,3,4,5};
//		reverseArray(array,0,4);
//	}
//}

// method 5 using array list
//public class Main {
//	public static void reverseArray(int[] array) {
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		for(int i=array.length-1;i>=0;i--) {
//			list.add(array[i]);
//		}
//		System.out.println(list);
//	}
//	public static void main(String args[]) {
//		int[] array= {1,2,3,4,5};
//		reverseArray(array);
//	}
//}




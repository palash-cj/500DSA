package minMax_array;

import java.util.HashSet;
import java.util.Set;

// method 1
//public class Main {
//	static class Pair{
//		int min;
//		int max;
//	}
//	static Pair minmax(int[] arr) {
//		Pair pair=new Pair();
//		if(arr[0]>arr[1]) {
//			pair.min=arr[0];
//			pair.max=arr[1];
//		}else {
//			pair.min=arr[1];
//			pair.max=arr[0];
//		}
//		
//		for(int i=2;i<arr.length;i++) {
//			if(arr[i]>pair.max) {
//				pair.max=arr[i];
//			}else if(arr[i]<pair.min) {
//				pair.min=arr[i];
//			}
//		}
//		return pair;
//	}
//	public static void main(String args[]) {
//		int arr[]= {1,2,0,9,3};
//		Pair p=minmax(arr);
//		System.out.println("Min = "+p.min);
//		System.out.println("Max = "+p.max);
//	}
//}


// method 2 using set
public class Main {
	static class Pair{
		int min;
		int max;
    }
	static Pair minmax(int[] arr) {
		Pair pair=new Pair();
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Integer[] array=set.toArray(new Integer[0]);
		pair.min=array[0];
		pair.max=array[arr.length-1];
		return pair;
	}
	public static void main(String args[]) {
		int arr[]= {1,2,0,9,3};
		Pair p=minmax(arr);
		System.out.println("Min = "+p.min);
		System.out.println("Max = "+p.max);
	}
}


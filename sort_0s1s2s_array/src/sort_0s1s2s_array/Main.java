package sort_0s1s2s_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// method 1 using  list
//public class Main {
//	public static void sort(int[] arr){
//		int l=arr.length;
//		ArrayList<Integer> li=new ArrayList<Integer>();
//		for(int i=0;i<l;i++) {
//			if(arr[i]==0) {
//				li.add(arr[i]);
//			}
//		}
//		for(int i=0;i<l;i++) {
//			if(arr[i]==1) {
//				li.add(arr[i]);
//			}
//		}
//		for(int i=0;i<l;i++) {
//			if(arr[i]==2) {
//				li.add(arr[i]);
//			}
//		}
//		for(int i:li) {
//			System.out.print(i+" ");
//		}
//	}
//	public static void main(String args[]) {
//		int[] arr= {1,2,0,2,1,0};
//		sort(arr);
//	}
//}

// method 2 concatenating the lists
//public class Main {
//	public static void sort(int[] arr){
//		int l=arr.length;
//		ArrayList<Integer> li0=new ArrayList<Integer>();
//		ArrayList<Integer> li1=new ArrayList<Integer>();
//		ArrayList<Integer> li2=new ArrayList<Integer>();
//		for(int i=0;i<l;i++) {
//			if(arr[i]==0) {
//				li0.add(arr[i]);
//			}else if(arr[i]==1) {
//				li1.add(arr[i]);
//			}else {
//				li2.add(arr[i]);
//			}
//		}
//		li0.addAll(li1);
//		li0.addAll(li2);
//		for(int i:li0) {
//			System.out.print(i+" ");
//		}
//	}
//	public static void main(String args[]) {
//		int[] arr= {1,2,0,2,1,0};
//		sort(arr);
//	}
//}


// method 3 using set but it eliminates duplicates
public class Main {
	public static void sort(int[] arr){
		Set<Integer> s=new HashSet<>();
		for(int i:arr) {
			s.add(i);
		}
		for(int i:s) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String args[]) {
		int[] arr= {1,2,0,2,1,0};
		sort(arr);
	}
}


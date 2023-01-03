package all_negative_to1side_array;

import java.util.Arrays;

// method 1
//public class Main {
//	public static void main(String args[]) {
//		int arr[]= {2,5,6,7,-9,-7,1,-4,3,-9,-9,-9};
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				j++;
//			}
//		}
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
//	}
//}

// method 2 using 2 pointers
//public class Main {
//	public static void main(String args[]) {
//		int arr[]= {2,5,6,7,-9,-7,1,-4,3,-9,-9,-9};
//		int i=0;
//		int j=arr.length-1;
//		while(i!=j) {
//			if(arr[i]>0 && arr[j]>0) {
//				j--;
//			}else if(arr[i]<0 && arr[j]<0) {
//				i++;
//			}else if(arr[i]<0 && arr[j]>0) {
//				i++;
//				j--;
//			}else if(arr[i]>0 && arr[j]<0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				i++;
//				j--;
//			}
//		}
//		for(int a:arr) {
//			System.out.print(a+" ");
//		}
//	}
//}


// method 3 using inbuilt function
//public class Main {
//	public static void main(String args[]) {
//		int arr[]= {2,5,6,7,-9,-7,1,-4,3,-9,-9,-9};
//		Arrays.sort(arr);
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
//	}
//}

// method 4 using 2 lists for negative and positive elements
// method 5 using set if only non duplicates are present 

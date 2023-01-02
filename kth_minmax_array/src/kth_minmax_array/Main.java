package kth_minmax_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	static class Pair{
		int min;
		int max;
	}
	public static Pair minMax(int[] array,int k) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		Integer[] arr=set.toArray(new Integer[0]);
		Pair pair=new Pair();
		pair.max=arr[arr.length-k];
		pair.min=arr[k-1];
		return pair;
		
	}
	public static void main(String args[]) {
		int[] array= {4,3,8,1,9};
		Pair pair=minMax(array,2);
		System.out.println("2nd Max is "+pair.max);
		System.out.println("2nd Min is "+pair.min);
	}
}

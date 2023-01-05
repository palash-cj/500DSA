package rotate_array;

public class Main {
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5};
		int[] arr1=new int[arr.length];
		int n=arr.length;
		int j=6;// rotate cyclically by 2
		for(int i=0;i<arr.length;i++) {
			int r=i+j;
			if(r>(n-1)) {
				r=r%n;
				arr1[r]=arr[i];
			}else {
				arr1[r]=arr[i];
			}
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
	}
}

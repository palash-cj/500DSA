package kadanes_algorithm;


// method 1

//public class Main {
//	public static void findMaxSum(int[] arr) {
//		int start=0,end=0,s=0;
//		int max_so_far=Integer.MIN_VALUE;
//		int max_ending_here=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			max_ending_here+=arr[i];
//			if(max_so_far<max_ending_here) {
//				max_so_far=max_ending_here;
//				start=s;
//				end=i;
//			}
//			if(max_ending_here<0) {
//				max_ending_here=0;
//				s=i+1;
//			}
//		}
//		System.out.println("Max sum is "+max_so_far);
//		System.out.println("Start is "+start+" & end is "+end);
//	}
//	public static void main(String args[]) {
//		int[] arr={1,2,-6,5,4,-2,1,4,-8,9};
//		findMaxSum(arr);
//	}
//}

// method 2
public class Main {
	public static int findMaxSum(int[] nums) {
		int curSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(curSum<0) curSum=0;
            curSum+=nums[i];
            maxSum=Math.max(curSum,maxSum);
        }
        return maxSum;
	}
	public static void main(String args[]) {
		int[] arr={1,2,-6,5,4,-2,1,4,-8,9};
		int ans=findMaxSum(arr);
		System.out.println(ans);
	}
}

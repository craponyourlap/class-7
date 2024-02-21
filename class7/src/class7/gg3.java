package class7;

import java.util.Arrays;

public class gg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,3,2,1,4,-1};
		Arrays.sort(numbers);
		//System.out.println(Arrays.binarySearch(numbers, 0));
		
		int[] numbers1 = {1,2,3};
		int[] numbers2 = {1,2,3};
		
		/*System.out.println(numbers1 == numbers1);
		System.out.println(numbers1 == numbers2);
		System.out.println(Arrays.equals(numbers1, numbers2));*/
		
		int[] numbers3 = new int[9];
		Arrays.fill(numbers3, 6);
		System.out.println(Arrays.toString(numbers3));
		int[] numbers4 = new int[9];
		Arrays.fill(numbers4, 0, 4, 9);
		System.out.println(Arrays.toString(numbers4));
		
	}

}

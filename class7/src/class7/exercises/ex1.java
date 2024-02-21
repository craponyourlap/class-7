package class7.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
	static Scanner in = new Scanner(System.in);
	static int[] makeIntArray() {
		System.out.println("enter amount of elements");
		int length;
		while (true) {
			int local = in.nextInt();
			if (local < 1) {
				System.out.println("you need atleast 1 element in the array");
			}
			else if(local > 10) {
				System.out.println("the size limit of the array is 10");
			}
			else {
				length = local;
				break;
			}
		}
		int[] array = new int[length];
		System.out.println("start putting elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(makeIntArray()));
	}

}

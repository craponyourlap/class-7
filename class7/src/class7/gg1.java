package class7;

import java.util.Arrays;

public class gg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a', 'b','c'};
		printArray(chars);
		change(chars);
		printArray(chars);
		Arrays.sort(chars);
		printArray(chars);
		char[] chars2 = {'z','q','r','y','o'};
		printArray(chars2);
		Arrays.sort(chars2, 0, 3);
		printArray(chars2);
		
	}
	static void change(char[] chars) {
		char start = chars[0];
		chars[0] = chars[1];
		chars[1] = chars[2];
		chars[2] = start;
	}
	static void printArray(char[] chars) {
		System.out.println(Arrays.toString(chars));
	}

}

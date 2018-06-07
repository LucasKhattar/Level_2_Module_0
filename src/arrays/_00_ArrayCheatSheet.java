package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		String[] strs = new String[5];
		System.out.println(strs[2]);
		strs[2] = "Banana";
		System.out.println(strs[2]);
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		int[] ary = new int[50];
		for (int i = 0; i < ary.length; i++) {
			Random randy = new Random();
			ary[i] = randy.nextInt();
			System.out.println(ary[i]);
		}
		int smallest = ary[0];
		int largest = ary[0];
		for (int i = 0; i < ary.length; i++) {
			if (smallest > ary[i]) {
				smallest = ary[i];
			}
			if (largest < ary[i]) {
				largest = ary[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
}

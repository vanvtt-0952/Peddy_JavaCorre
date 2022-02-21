package excercies1.arrays;

import java.util.Random;
import java.util.Scanner;

public class RunWorkWithArray {

	public static void main(String[] args) {
		int[] my_arr = build_array(20);
		System.out.println("max value: " + find_maxmimum_of_array(my_arr));
		System.out.println("min value: " + find_minimum_of_array(my_arr));
		System.out.println("sum value: " + sum_of_array(my_arr));
		
		System.out.println("Sort array ");
		int[] result_order_asc = order_asc_for_array_use_buddle_sort(my_arr);
		display_elements_of_array(result_order_asc);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integers to find:");
		 int value_to_find = input.nextInt();
		System.out.println("Have" + value_to_find + "contain into array?");
		System.out.println("Answer: " + contain_value_into_array(my_arr, value_to_find));
	}
	
	
	/*
	 * Use Random class to create array params: size of array return int[]
	 */
	private static int[] build_array(int size) {
		return new Random().ints(size).toArray();
	}

	private static int find_maxmimum_of_array(int[] arr) {

		// when array empty
		if (arr.length == 0)
			return 0; // You should throw exception if array empty

		// when element of array is 1
		if (arr.length == 1)
			return arr[0];

		// when element of array >= 2
		int max = arr[0];
		for (int j : arr) {
			if (max < j)
				max = j;
		}
		return max;
	}

	private static int find_minimum_of_array(int[] arr) {

		// when array empty
		if (arr.length == 0)
			return 0; // You should throw exception if array empty

		// when element of array is 1
		if (arr.length == 1)
			return arr[0];

		// when element of array >= 2
		int min = arr[0];
		for (int j : arr) {
			if (min > j)
				min = j;
		}
		return min;
	}

	/*
	 * Sum of array You can use method support of array Arrays.stream(arr).sum(); If
	 * you need that self handle
	 */
	private static long sum_of_array(int[] arr) {
		long sum = 0;
		for (int i : arr) {
			sum += i;
		}

		return sum;
	}

	private static int[] order_asc_for_array_use_buddle_sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

	private static boolean contain_value_into_array(int[] arr, int number_find) {
		for (int i : arr) {
			if (i == 20)
				return true;
		}
		return false;
	}
	
	private static void display_elements_of_array(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("====");
	}

}

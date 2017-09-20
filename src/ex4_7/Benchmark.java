package ex4_7;

import java.util.Random;

public class Benchmark {
	public static void main(String[] args) {
		int[] array = new int[50_000_000];
		Random generator = new Random();

		for (int i = 0; i < 50_000_000; i++) {
			array[i] = generator.nextInt();
		}

		int[] newArray = new int[50_000_000];

		long start = System.nanoTime();
		for (int i = 0; i < 50_000_000; i++) {
			newArray[i] = array[i];
		}
		long end = System.nanoTime();

		System.out.println("Looop: " + (end - start) / 1000_000.0);

		newArray = new int[50_000_000];

		start = System.nanoTime();
		System.arraycopy(array, 0, newArray, 0, array.length);
		end = System.nanoTime();

		System.out.println("Array copy: " + (end - start) / 1000_000.0);

	}
}

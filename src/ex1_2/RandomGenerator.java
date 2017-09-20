package ex1_2;

import java.util.*;
import static java.lang.System.out;

public class RandomGenerator {
	public static void main(String[] args) {
		Random ran = new Random();
		int result = ran.nextInt(6);
		out.println(result + 1);
	}
}
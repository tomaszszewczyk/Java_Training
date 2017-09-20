package ex4_2;

public class LeapYear {
	static public void main(String[] args) {
		System.out.println(isLeapYear(2000));
	}

	static public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

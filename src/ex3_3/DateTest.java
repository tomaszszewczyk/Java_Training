package ex3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void test() {
		Date date = Date.stringToDate("2014-10-19", "-");
		assertTrue(date.equals(new Date(2014, 10, 19)));
	}

}

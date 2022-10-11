package mystring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStringTest {

	@Test
	void test() {
		char[] hello = {'h','e','l','l','o'};
		MyString myString = new MyString(hello);
		//assertEquals(hello,myString.toCharArray());
		assertEquals(5, myString.length());
		assertEquals('h',myString.charAt(0));
	
		char[] repObject = myString.toCharArray();
		repObject[0] = 'b';
		assertEquals('h',myString.charAt(0));
		
		hello[0] = 'x';
		assertEquals('h',myString.charAt(0));
		
	}
	

}

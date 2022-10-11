package mystring;

import java.util.stream.IntStream;

/**
 * 
 * @imutable
 *
 */

public class MyString {
	/**
	 * @invar | characters != null
	 * @representationObject
	 */
	private char[] characters;
	
	/**
	 * 
	 * @inspects | this 
	 * @creates | result 
	 * @post a pass by refference allows null | result != null 
	 *	
	 */
	public char[] toCharArray() {return characters.clone(); }//clone fixes representation exposure

	/**
	 * 
	 * @inspects | this
	*/
	public int length() {return characters.length;}
	
	/**
	 *  @inspects | this 
	 *  @pre | 0 <= index && index < length()
	 *  @post | result == toCharArray()[index]
	 */
	public char charAt(int index) {return characters[index];}
	
	/**
	 * 
	 * @pre | characters != null
	 * @post | IntStream.range(0,characters.length).allMatch(i -> toCharArray()[i] == characters[i])
	 */
	public MyString(char[] characters) {
		this.characters = characters.clone();  //clone fixes representation exposure
	}
}

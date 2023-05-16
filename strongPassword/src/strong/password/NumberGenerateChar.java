package strong.password;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NumberGenerateChar  extends HookCharacters {

	List<Character> numberCharacter = new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5','6','7','8','9'));
	
/*	public char getChar() {
		Random ran = new Random();

		int position = ran.nextInt(numberCharacter.size());

		char character = numberCharacter.get(position);

		return character;
	
	}*/


	public List<Character> getList() {
		
		return this.numberCharacter;
	}



}

package strong.password;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LetterCharacter extends HookCharacters {
	List<Character> letterCharacter = new ArrayList<>(Arrays.asList('*', '!', '@', '#', '$', '&'));

	/*public char getChar() {
		Random ran = new Random();

		int position = ran.nextInt(letterCharacter.size());

		char character = letterCharacter.get(position);

		return character;
	}*/


	public List<Character> getList() {
	
		return this.letterCharacter;
	}

	
}

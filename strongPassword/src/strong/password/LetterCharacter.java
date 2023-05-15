package strong.password;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LetterCharacter extends HookCharacters {
	List<Character> letterCharacter = new ArrayList<>(Arrays.asList('*', '!', '@', '#', '$', '&'));

	public char getChar() {
		Random ran = new Random();

		int position = ran.nextInt(letterCharacter.size());

		char character = letterCharacter.get(position);

		return character;
	}

}

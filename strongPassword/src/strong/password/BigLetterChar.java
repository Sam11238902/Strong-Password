package strong.password;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BigLetterChar  extends HookCharacters {

	List<Character> bigLetterCharacter = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I',
			'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'
			,'Y','Z'));
	
	
	public char getChar() {
		Random ran = new Random();
		int position = ran.nextInt(bigLetterCharacter.size());
		
		char character = bigLetterCharacter.get(position);
		
		return character;
	}

}

package strong.password;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SmallLetterChar extends HookCharacters{

	List<Character> smallLetterOptions = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i',
			'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x'
			,'y','z'));
	
	@Override
	public char getChar() {
		Random ran = new Random();
		
		int position = ran.nextInt(smallLetterOptions.size());
		
		char character = smallLetterOptions.get(position);
		
		return character;
	}

}

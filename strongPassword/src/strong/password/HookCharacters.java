package strong.password;

import java.util.List;
import java.util.Random;

public abstract class HookCharacters implements GenerateChar {

	
	
	
	
	
	
	public abstract List<Character>  getList();   
	// Retorna a lista de acordo com a instancia criada no StrongPassword exemp: "HookCharacters hook = new LetterCharacter"
	// vai retornar a lista que esta dentro do LetterCharacter.
	
	
	
	
	
	public char getChar() {
		Random ran = new Random();

		List<Character> mylist = getList();

		int position = ran.nextInt(mylist.size());

		char character = mylist.get(position);

		return character;
	}
	
	
	
	
	

}

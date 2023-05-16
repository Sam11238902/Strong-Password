package strong.password;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StrongPassword {
	
	private ArrayList<Character> password = new ArrayList();
	int sizeListPass;
	
	public StrongPassword() {
		randomSize();
		createPassword();
	}
	
	
	public void  randomSize() {
		int minimum = 12;
		int maximum = 15;
		Random random = new Random();     
   		this.sizeListPass =  random.nextInt(maximum - minimum ) + minimum;
   		
	}
	
	public void createPassword(){
		
		HookCharacters smallLetter = new SmallLetterChar();
    	HookCharacters bigLetter = new BigLetterChar();
    	HookCharacters characterLetter = new LetterCharacter();
    	HookCharacters numberLetter = new NumberGenerateChar();
    	
    	this.password.add(smallLetter.getChar());
    	this.password.add(bigLetter.getChar());
    	this.password.add(characterLetter.getChar());
    	this.password.add(numberLetter.getChar());
 
    	for( int x = password.size(); x < this.sizeListPass  ; x++) {
    		
    		Random ran = new Random();
    		
    		int draw = ran.nextInt(4)+1;
    		switch (draw) {
    	    case 1 :
    	        this.password.add(smallLetter.getChar());
    	        break;
    	    case 2:
    	        this.password.add(bigLetter.getChar());
    	        break;
    	    case 3:
    	        this.password.add(characterLetter.getChar());
    	        break;
    	    case 4:
    	      this.password.add(numberLetter.getChar());
    	        break;
    	    
    	}
    	}
    	
    	Collections.shuffle(this.password);	
	}
	
	public List<Character> retorna(){
		return password;
	}
	
	public String returnPassword(){
		String Password = new String();
		for(int x = 0; x < this.password.size(); x++) {
			char travelingList = password.get(x);
			Password = Password + travelingList ;
		}	
		return Password;
	}
}

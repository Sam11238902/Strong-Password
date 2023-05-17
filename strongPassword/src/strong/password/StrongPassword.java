package strong.password;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StrongPassword {
	
	
	private HookCharacters [] hook = {new SmallLetterChar(), new NumberGenerateChar(), new BigLetterChar(),
			new LetterCharacter()};
	
	private List<Character> password = new ArrayList();
	int sizeListPass;
	
	public StrongPassword() {
		randomSize();
	
	}
	
	
	public void  randomSize() {
		int minimum = 12;
		int maximum = 15;
		Random random = new Random();     
   		this.sizeListPass =  random.nextInt(maximum - minimum ) + minimum;
   		
	}
	
	public String createPassword(){
		
	
	
		for(int x = 0; x < 3; x++) {
	    	this.password.add(hook[x].getChar());
		}
		
		for(int x = 3 ;x < this.sizeListPass; x++) {
    			Random ran = new Random();
        		int draw = ran.nextInt(4);
        		this.password.add(hook[draw].getChar());
    			
    		}
	
    	
      	Collections.shuffle(this.password);	
    	  	StringBuilder builder = new StringBuilder();
    		for (char chars : password) {
    		builder.append(chars);
    		}
    	
    		return builder.toString();
    	
   	}
	
	// abaixo o codigo antigo que foi refatorado 
	
	
	
	/*HookCharacters smallLetter = new SmallLetterChar();
	HookCharacters bigLetter = new BigLetterChar();
	HookCharacters characterLetter = new LetterCharacter();
	HookCharacters numberLetter = new NumberGenerateChar();
	
	
	
	for( int x = password.size(); x < this.sizeListPass  ; x++) {
	
	/*switch (draw) {
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
	public String returnPassword(){
		String Password = new String();
		for(int x = 0; x < this.password.size(); x++) {
			char travelingList = password.get(x);
			Password = Password + travelingList ;
		}	
		return Password;
	}*/
}

package strong.password;


public class display {
	
	    public static void  main(String[] args) {
	    
	   for(int x = 0 ; x < 10; x++) {	
	    	
	    StrongPassword one = new StrongPassword();	
	    
	    System.out.println(one.retorna());
	    System.out.println(one.returnPassword());
	    
	    
	    System.out.println(one.sizeListPass);
	    
	      }
	    }
	    
}


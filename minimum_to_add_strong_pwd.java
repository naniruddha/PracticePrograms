package Practice_Codes;

public class minimum_to_add_strong_pwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "2bbbb";
		int n = password.length();
		int count = 0;
	    if(n>=6){
	        count++;
	    }
	    String special_characters = "!@#$%^&*()-+";
	    for(int i=0;i<n;i++){
	        if(password.charAt(i)>=0 && password.charAt(i)<=9){
	            count++;
	        }else if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
	            count++;
	        }else if(password.charAt(i)>='a' && password.charAt(i)<='z'){
	            count++;
	        }
	    }
	    
	    for(int j=0;j<special_characters.length();j++){
	        for(int k=0;k<password.length();k++){
	            if(special_characters.charAt(j) == password.charAt(k)){
	                count++;
	            }
	        }
	    }
	    
	    System.out.println(count);

	    }

	
}


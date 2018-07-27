class Lab6Ex2{
	
	public static void main(String args[]){
		
		System.out.print("String 1:"+args[0]);
		String s1 = args[0];
		System.out.println();
	    System.out.print("String 2:"+args[1]);
		String s2 = args[1];
	
		System.out.println();

		//find the largest string
		
		if(s1.compareTo(s2)>0)
			System.out.println("Largest string is String 1"+s1);
		else if(s1.compareTo(s2)<0)
			System.out.println("Largest string is String 2:"+s2);
		else
			System.out.println("The same size of both");
		
		//chek a particular letter included or not
		
		if(s1.indexOf("e")>=0)
			System.out.println("'e' is found at "+s1.indexOf("e")+"in string 1");
		else
			System.out.println("'e' is not found at String 1");
		    	
		
		//by concatenation find a letter
		String str = s1+s2;
		
		if(str.indexOf("i")>=0)
			System.out.println("'i' is found at "+str.indexOf("i")+" in combimation of string 1 and string 2");
		else
			System.out.println("'i' is not found ");
		 
		 //replace character in string
		 
		 String str1 = str.replace("a","t");
		 System.out.println(str1);
		
		
		
	}
	
	
}
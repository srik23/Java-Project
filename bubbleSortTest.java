import java.util.ArrayList;



public class bubbleSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
	//	bubbleSort();
		
		
	//	fibonic() ;
		
		
		palindrome();

	
		
	}
	
	
	static void palindrome(){
		
		
		
		int intpal=73459351;
		
		String  strTmp= String.valueOf(intpal);
		
		ArrayList<String > strArray = new ArrayList<String>();
		
		
		for (int i = 0; i < strTmp.length(); i++) {
			
			strArray.add(strTmp.subSequence(i,i+1).toString());
			
		}
		
		
		
		
		for (int i = 0, j = strArray.size()-1; i < strArray.size()/2; i++,j--) {
		
				String str1 = strArray.get(i);
				String str2 = strArray.get(j);
				if(str1.equalsIgnoreCase(str2)){
					
					System.out.println("Equals" + str1);
					
				}else{
					
					System.out.println("Un Equals" + str1  + "" + str2);
				}
				
				
				
				
				
				
		
		}
		
		
		
		
		
		
System.out.println("");

		
	
		
		
		
		
		
	}
	
	
	
	
	
	static void 		fibonic(){
		
		
		
		int num1= 1;
		int Fib= num1+num1;
		int fintotal = num1+Fib;
		System.out.println(num1);
		System.out.println(Fib);
		System.out.println(fintotal);
		
		for (int i = 0; 100 > fintotal; i++) {
			
			
			
			num1=Fib;
			Fib=fintotal;
			fintotal = num1+Fib;
			System.out.println(fintotal);
			
			
			
		}
	
		
		
		
		
		
		
		
		/*
		 *      1 
		 *      +1
		 *      2
		 * 
		 *    
		 * 
		 */
		
		
		
		
		
		
		
	}
	
	
	
    static void bubbleSort(){
		
    	
		
		int[] intArray = {10,9,8,7};
		
		
		System.out.println(" Array before sorting " );
		
		
		for (int i = 0; i < intArray.length; i++) {

			
			System.out.println(intArray[i]);
		}
		
		
		
		for (int i = 0; i < intArray.length-1; i++) {
			
			
			
			for (int j = 0; j < intArray.length-1; j++) {
				
				
				
				//10
				int temp =intArray[j];
				
				//9
				int tempNew =intArray[j+1];
				
					if(temp>tempNew){
						
						
						int tempvar =temp;
						
						intArray[j]=tempNew;
						intArray[j+1]=tempvar;
						
																	
					}
				
	
			}	
				

			}
		
		
		
		System.out.println(" Array After sorting " );
	for (int i = 0; i < intArray.length; i++) {

			
			System.out.println(intArray[i]);
		}
		
    	
    	
		
	}
	
	

}

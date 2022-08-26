package factorielle;


public class Factorielle {

	public static int facto(int n) throws Exception {

		int res = 1;
		if (n < 0) {
			throw new Exception("Exception Message");
		}
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;

	}

}

/*
  public class Factorielle {

	public static int facto(int n) throws  Exception{
		
		 try {
			 if(n < 0) {
				 throw new Exception();
			 }
			 else if (n == 0 || n == 1) {
					return 1;
				}
			 else {
				 return n * facto(n - 1); 
             }

		 }		
		    

}

	
}

 */

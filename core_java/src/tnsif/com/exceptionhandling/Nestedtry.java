package tnsif.com.exceptionhandling;

public class Nestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str = "tns";
		
		int arr[] = null;
		int y =6;
		try { // outer try
			 int z = y/0; // exception arised in outer block
			try {// inner try
				System.out.println(arr[0]);
				System.out.print(str.charAt(y));
			}
			 catch(StringIndexOutOfBoundsExcepton e) {
				System.out.println("except caught"+ e.get);
				
				
			}
		}
     		
	}

}

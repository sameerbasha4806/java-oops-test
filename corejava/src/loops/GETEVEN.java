package loops;

public class GETEVEN {
	public void findEven() {
//		System.out.println("Even numbers: ");
//		for(int i=1;i<=200;i++) {
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println();
//		System.out.println("Odd Numbers: ");
//		for(int i=1;i<=200;i++) {
//			if(i%2!=0) {
//				System.out.print(i+" ");
//			}
//		}
//	}
		String even="";	
		String odd="";
		for(int i=1;i<=200;i++) {
 	    	if(i%2==0) {
 	    		even +=i+" ";
 	    	}else {
 	    		odd +=i+" ";
 	    	}
		}
		System.out.println("Even Numbers: "+even);
		System.out.println("Odd Numbers: "+odd);
		
	}
	public static void main(String[] args) {
		GETEVEN obj=new GETEVEN();
		obj.findEven();

	}

}

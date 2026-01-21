package practise;

public class Tech {
	public boolean isTech(int num) {
		int count=0;
		int temp=num;
		while(num>0) {
			count++;
			 num/=10;
		}
		if(count%2!=0) {
			return false;
		}
		int divisor=1;
		for(int i=1;i<=count/2;i++) {
			divisor=divisor*10;
		}
		int firstHalf=temp/divisor;
		int secondHalf=temp%divisor;
		int sum=firstHalf + secondHalf;
		return (sum*sum)==temp;
	}

	public static void main(String[] args) {
		Tech obj=new Tech();
		System.out.println(obj.isTech(2025)?"Tech Number":"Not Tech");

	}

}

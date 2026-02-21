package inheritance.setB;

import java.util.Scanner;


public class Amstrong {
	int num;
	
	public Amstrong(int num) {
		super();
		this.num = num;
	}
	
	public int getpower(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	
	public int getcount(int num) {
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
	
	public  boolean isAmstrong() {
		int count=getcount(num);
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=getpower(rem,count);
			temp/=10;
		}
		return sum==num;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num1=sc.nextInt();
	
		Amstrong obj=new Amstrong(num1);
		System.out.println((obj.isAmstrong())?"is Amstrong":"not amstrong"); 
		sc.close();
	}

}

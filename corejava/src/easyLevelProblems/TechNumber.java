package easyLevelProblems;

public class TechNumber {
	public boolean isTechNumber(int num) {
		int temp=num;
		int count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		if(count%2 !=0) {
			return false;
		}
		int divisor=1;
		for(int i=1;i<=count/2;i++) {
			divisor=divisor*10; //10^count/2 => 
		}
		int firstHalf=num/divisor;//2025/100 => 20
		int secondHalf=num%divisor;//2025%100 =>25
		int sum =firstHalf + secondHalf;
		return (sum*sum)==num;
	}

	public static void main(String[] args) {
		TechNumber obj=new TechNumber();
		System.out.println(obj.isTechNumber(3025)?"It Is A TechNumber":"Not A TechNumber");

	}

}

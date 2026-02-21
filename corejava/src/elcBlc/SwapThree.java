 package elcBlc;

public class SwapThree {
	int a;
	int b;
	int c;
	public void swapThreeNumbers() {
//	int	temp =a+b+c;
//		a=temp-(a+b);
//		b=temp-(b+c);
//		c=temp-(a+c);
		a=a+b+c;
		b=a-(b+c);//a=1 swap to b b=1
		c=a-(b+c);//b=2 swap to c c=2
		a=a-(b+c);//6-3=3
		
	}

	public static void main(String[] args) {
		SwapThree obj1=new SwapThree();
		obj1.a=1;
		obj1.b=2;//1
		obj1.c=3;//2
		obj1.swapThreeNumbers();
		System.out.println("a= "+obj1.a);
		System.out.println("b= "+obj1.b);
		System.out.println("c= "+obj1.c);
		

	}

}

package corejava;

public class Red {
	public static int meth(int a,int b) {
		System.out.println(a+b);
		return a-b;
	}
	public static void printdata(int num) {
		System.out.println(num);
	}
public static void main(String[] args) {
	int result=meth(10,30);
	printdata(result);
 }
}

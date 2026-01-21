package statements;

public class Greater {
	
	public void greaterNumber(int x,int y, int z) {
		
		if(x>y && x>z) {
			System.out.println("x is greater");
		}else if(y>x && y>z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
		}
	}

	public static void main(String[] args) {
		Greater obj=new Greater();
		obj.greaterNumber(10, 20, 30);
	}

}

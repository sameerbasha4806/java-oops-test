package statements;

public class Login {
	
	public String loginAccess(String username) {
		if(username == "admin") {
			return "Access granted";
		}else {
			return "Access not Granted";
		}
	}

	public static void main(String[] args) {
		Login obj=new Login();
		System.out.println(obj.loginAccess("admin"));
		
	}

}

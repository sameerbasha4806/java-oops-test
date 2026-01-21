package statements;

public class LadderBankApproval {
	public String checkLoanApproval(double salary, int creditScore) {
		if(salary>=80000.0 && creditScore>=750) {
				return "Loan Approved Immediately";
			}else if ((salary>=50000 && salary<80000) && (creditScore>=650 && creditScore<750)) {
				return "Loan Approved With Higher Interest Rate";					
				
			}else if ((salary>=30000 && salary<50000) && (creditScore>=500 && creditScore<650)) {
				return "Co-signer Required";
			}else {
				return "Loan Rejected";
			}
		}
	

	public static void main(String[] args) {
		String result =new LadderBankApproval().checkLoanApproval(30000, 600);
		System.out.println(result);

	}

}

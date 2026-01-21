package com.company;

public class Manager {
	private String managerName;

	
	public Manager(String managerName) {
		super();
		this.managerName = managerName;
		System.out.println("Manager Object Created");
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public void checkDetails(Employee employee) {
		
		System.out.println("employee Name: "+employee.getemployeeName());
		System.out.println("employee Id: "+employee.getemployeeId());
		System.out.println("employee Desg: "+employee.getemployeeDesg());
		System.out.println("employee Salary: "+employee.getemployeeSalary());
		double salary =employee.getemployeeSalary();
		if(salary>10000 && salary<=30000) {
			employee.setemployeeSalary(salary+(salary*0.15)); 
		}else if(salary>30000 && salary<=40000) {
			employee.setemployeeSalary(salary+(salary*0.10));
		}else if (salary>40000 && salary<=50000) {
			employee.setemployeeSalary(salary+(salary*0.5));
		}else {
			System.out.println("No Increment");
			return;
		}
		System.out.println("Current Salary: "+employee.getemployeeSalary());
	}
	

}

package com.behavioral;

abstract class Employee {

	// next element in chain or responsibility
	protected Employee superviser;

	// set next supervisor
	public void nextSuperviser(Employee superviser) {
		this.superviser = superviser;
	}

	public abstract void applyLeave(String empName, int numberOfDaysLeave);
}

class TeamLead extends Employee {

	private int MAX_LEAVE_CAN_APPROVE = 10;

	@Override
	public void applyLeave(String empName, int numberOfDaysLeave) {

		if (numberOfDaysLeave <= MAX_LEAVE_CAN_APPROVE) {
			   approveLeave(empName, numberOfDaysLeave);
		}else {
			superviser.applyLeave(empName, numberOfDaysLeave);
		}
	}

	private void approveLeave(String empName, int numberOfDaysLeave) {
		System.out.println("TeamLead approved " + numberOfDaysLeave + " days leaves for employee: " + empName);
	}
}

class ProjectLead extends Employee {
	
	private int MAX_LEAVE_CAN_APPROVE = 20;

	@Override
	public void applyLeave(String empName, int numberOfDaysLeave) {

		if (numberOfDaysLeave <= MAX_LEAVE_CAN_APPROVE) {
                approveLeave(empName, numberOfDaysLeave);
		}else {
			superviser.applyLeave(empName, numberOfDaysLeave);
		}
	}

	private void approveLeave(String empName, int numberOfDaysLeave) {
		System.out.println("ProjectLead approved " + numberOfDaysLeave + " days leaves for employee: " + empName);
	}
}

class HR extends Employee {
	
	private int MAX_LEAVE_CAN_APPROVE = 30;

	@Override
	public void applyLeave(String empName, int numberOfDaysLeave) {

		if (numberOfDaysLeave <= MAX_LEAVE_CAN_APPROVE) {
                approveLeave(empName, numberOfDaysLeave);
		}else {
			System.out.println("Leave Application suspended for employee: " + empName +", Please contact HR");
		}
	}

	private void approveLeave(String empName, int numberOfDaysLeave) {
		System.out.println("HR approved " + numberOfDaysLeave + " days leaves for employee: " + empName);
	}
}

public class ChainResponsibilityDesignPattern {

	public static void main(String[] args) {
	
		// Object created
		TeamLead tl = new TeamLead();
		ProjectLead pl = new ProjectLead();
		HR hr = new HR();
		
		// set next level supervisor
		tl.nextSuperviser(pl);
		pl.nextSuperviser(hr);
		
		tl.applyLeave("Rakesh", 9);
		System.out.println();
		
		tl.applyLeave("viksh", 19);
		System.out.println();
		
		tl.applyLeave("venkat", 30);
		System.out.println();
		
		tl.applyLeave("shivram", 33);
		System.out.println();
	}

}

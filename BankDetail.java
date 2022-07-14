package Adapter_pattern;

public class BankDetail {
	long accNo;
	String accHolder, branchName;
	
	public long getAcc() {
		return accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public String getbranch() {
		return branchName;
	}
	public void setAcc(long accNo) {
		this.accNo = accNo;
	}
	public void setAccHolder(String name) {
		this.accHolder = name;
	}
	public void setbranch(String branch) {
		this.branchName = branch;
	}
}

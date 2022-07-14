package Adapter_pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Customer extends BankDetail implements Credit {
	public void getBankDetail() {
		
	try {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Account Number:");
		long accNo = Long.parseLong(b.readLine());
		System.out.println("Enter Account Holder:");
		String accHolder = b.readLine();
		System.out.println("Enter Branch:");
		String branchName = b.readLine();
		setAcc(accNo);
		setAccHolder(accHolder);
		setbranch(branchName);
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}

	@Override
	public void getCreditDetail() {
		// TODO Auto-generated method stub
		try {
		long accNo = getAcc();
		String accHolder = getAccHolder();
		String branchName = getbranch();
		System.out.println(accNo+" "+accHolder+" "+branchName);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
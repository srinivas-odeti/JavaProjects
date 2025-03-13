package banking_app;


public class OpenAccountBean 
{
	//static long uniqaccountNumber=100000;
	long accountNumber,phn;
	String uName,password,address;
	double amount;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
//	@Override
//	public String toString() {
//		return "OpenAccountBean [accountNumber=" + accountNumber + ", phn=" + phn + ", uName=" + uName + ", password="
//				+ password + ", address=" + address + ", amount=" + amount + "]";
//	}
	
	
	
	
	
}

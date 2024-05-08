package sec01getandset;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc = new Account(); // Account 객체 생성
		
		//acc.balance = 1000; 
		  // ERROR (private 필드는 다른 클래스에서 사용 불가)
		acc.setBalance(1000); // setter method 호출 (필드값이 변경됨)
		System.out.printf("잔액 : %d", acc.getBalance()); //1000
	
	}
	
}

class Account {
	
	private int balance; //잔액 private 적용
	
	//getter method
	public int getBalance() {
		return balance;
	}
	
	//setter method
	public void setBalance(int b) {
		balance = b;
	}
}

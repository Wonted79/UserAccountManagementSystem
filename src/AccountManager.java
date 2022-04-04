import java.util.Scanner;

public class AccountManager {
	Scanner input;
	Account account;
		
	AccountManager(Scanner input){
		this.input = input;
	}
	AccountManager(){	
	}	
	public  void addAccount() {
		account = new Account();
		System.out.print("Add Account" );
		System.out.print("Site:" );
	    account.site = input.next();
	    System.out.print("Id:" );
	    account.ID = input.next();
	    System.out.print("PassWord:" );
	    account.Password = input.next();
	    System.out.print("저장되었습니다.");
	}
	public void deleteAccount() {
		System.out.print("remove Account site:" );
		String Accsite = input.next();
		if (account == null) {
			System.out.print("등록되어있지 않은 계정입니다.");
			return;
		}
		if (account.site.equals(Accsite)) {
			account =null;
			System.out.print("삭제되었습니다.");
		}
	}
	public void editAccount() {
		System.out.print("edit Account site:" );
		String Accsite = input.next();
		if (account.site.equals(Accsite)) {
		    System.out.println(Accsite+"를 수정합니다.");
		    System.out.print("Id:" );
		    account.ID = input.next();
		    System.out.print("PassWord:" );
		    account.Password = input.next();
		    System.out.println("저장되었습니다.");		
		}
	}
	public void viewAccount() {		
		System.out.println("view Account site:" );
		String Accsite = input.next();
		if (account.site.equals(Accsite)) {
			account.printInfo();
	    }		
		else{
			account.printnone();
	    }
  }
}

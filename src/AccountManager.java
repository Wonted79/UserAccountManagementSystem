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
	    System.out.print("����Ǿ����ϴ�.");
	}
	public void deleteAccount() {
		System.out.print("remove Account site:" );
		String Accsite = input.next();
		if (account == null) {
			System.out.print("��ϵǾ����� ���� �����Դϴ�.");
			return;
		}
		if (account.site.equals(Accsite)) {
			account =null;
			System.out.print("�����Ǿ����ϴ�.");
		}
	}
	public void editAccount() {
		System.out.print("edit Account site:" );
		String Accsite = input.next();
		if (account.site.equals(Accsite)) {
		    System.out.println(Accsite+"�� �����մϴ�.");
		    System.out.print("Id:" );
		    account.ID = input.next();
		    System.out.print("PassWord:" );
		    account.Password = input.next();
		    System.out.println("����Ǿ����ϴ�.");		
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

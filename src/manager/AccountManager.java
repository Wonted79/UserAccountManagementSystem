package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import account.Account;
import account.AccountInput;
import account.AccountKind;
import account.Common;
import account.Game;
import account.Search;
import exception.EmailFormatException;

public class AccountManager implements Serializable{		
	/**
	 * 
	 */
	private static final long serialVersionUID = 5369543266347446925L;
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>(); //AccountInput 의 내용을 나열한다.
	transient Scanner input; // 해당변수는 직렬화 하지 않는다.
		
	public AccountManager(Scanner input){
		this.input = input;
	}
	public  void addAccount(String site,String id,String password,String email,String secondpassword) {	
		AccountInput accountInput = new Common(AccountKind.Common);
		accountInput.getUserInput(input);
		accounts.add(accountInput);
	}
	public void addAccount(AccountInput accountInput) {
		accounts.add(accountInput);
	}
	
	public  void addAccount() {	
		int kind =0;
		AccountInput AccountInput; //A
		while(kind <1 ||kind >3) {
			try {
	    	    System.out.print("<1 Common>  " );
		        System.out.print("<2 Search>  " );
		        System.out.print("<3 Game>" );
		        System.out.print("  Select num for Account Kind between 1 , 2, 3 " );
		        kind = input.nextInt();
		        if(kind == 1) {
			        AccountInput = new Common(AccountKind.Common);
			        AccountInput.getUserInput(input);
			        accounts.add(AccountInput);
			        break;
		        }
		        else if (kind ==2 ) {
			        AccountInput = new Search(AccountKind.Search);
			        AccountInput.getUserInput(input);
		    	    accounts.add(AccountInput);
			        break;
	        	}
		        else if (kind ==3 ) {
			        AccountInput = new Game(AccountKind.Game);
			        AccountInput.getUserInput(input);
			        accounts.add(AccountInput);
			        break;
		        }
		        else {
			        System.out.print("Select num for Account Kind between 1 , 2 , 3:" );
		        }		
	     	}	
		
		catch(InputMismatchException e) {
			 System.out.println("Please put an integer between 1 and 3!");
			 if(input.hasNext()) {
				 input.next();
			 }
			 kind= -1;
		 }
		}
		
	}
	public void deleteAccount(String Accountsite) {
		System.out.print("remove Account site:" );
		int index = findIndex(Accountsite);
		for(int i=0;i<accounts.size();i++) {			
			if (accounts.get(i).getSite().equals(Accountsite)) {
				index = i;
				break;				
			}
		}
		removefromAccounts(index,Accountsite);
	}
	
	public void deleteAccount() {
		System.out.print("remove Account site:" );
		String Accountsite = input.next();
		int index = findIndex(Accountsite);
		for(int i=0;i<accounts.size();i++) {			
			if (accounts.get(i).getSite().equals(Accountsite)) {
				index = i;
				break;				
			}
		}
		removefromAccounts(index,Accountsite);
	}
	
	public int findIndex(String Accountsite) {
		int index = -1;
		for(int i=0;i<accounts.size();i++) {			
			if (accounts.get(i).getSite().equals(Accountsite)) {
				index = i;
				break;				
			}
		}
		return index;
	}
	
	public int removefromAccounts(int index ,String Accountsite) {
		if (index>=0) {
			accounts.remove(index);
			System.out.println("the account "+Accountsite+"is deleted");
			return 1;
			}
		else {
			System.out.println("the account has not been registered");
	        return 0;
		}	
	}
	public void editAccount(String Accountsite,
			                String AccountID,
			                String AccountPassword,
			                String AccountEmail,
			                String AccountSecondPassword
			                ) {
		for(int i=0;i<accounts.size();i++) {
			AccountInput account1 = accounts.get(i);
		    if (account1.getSite().equals(Accountsite)) {
		    	try {
		    		account1.setID(AccountID);
			    	account1.setPassword(AccountPassword);
					account1.setEmail(AccountEmail);
					account1.setSecondPassword(AccountSecondPassword);
				} catch (EmailFormatException e) {
					e.printStackTrace();
				}
		    }
		}
	}
	
	public void editAccount() {
		System.out.print("Edit Account site:" );
		String Accountsite = input.next();
		for(int i=0;i<accounts.size();i++) {
			AccountInput account = accounts.get(i);
		    if (account.getSite().equals(Accountsite)) {
		        
		        int num = -1;    //메뉴 선택 초기값

	            while (num!=6) {
	                showEditMenu();
                    num = input.nextInt();
                    
                    switch(num) {
                    case 1:
                    	account.setAccountSite(input);
                    	break;
                    case 2:
                    	account.setAccountID(input);
                    	break;
                    case 3:
                    	account.setAccountPassword(input);
                    	break;
                    case 4:
                    	account.setAccountEmail(input);
                    	break;
                    case 5:
                    	account.setAccountSecondPassword(input);
                    	break;
                    default:
                    	continue;
                    }        
	            } // while
	            break;
	       } //if
	    } //for
	}
	
	public void viewAccounts() {		
		System.out.println("# of registered accounts:" + accounts.size());
		for(int i=0;i<accounts.size();i++) {	
			accounts.get(i).printInfo();
		}	
  }
	
	public int size() {
		return accounts.size();
	}
	public AccountInput get (int index) {
		return (Account) accounts.get(index);
	}
	
	public void showEditMenu() {
		 System.out.println("**Account Info Edit Menu**");
         System.out.println("1.Edit site");
         System.out.println("2.Edit Id");
         System.out.println("3.Edit Password");
         System.out.println("4.Edit Email");
         System.out.println("5.Edit SecondPassword");
         System.out.println("6.Exit ");
         System.out.println("Select one number between in 1-6:");
		
	}
	
}

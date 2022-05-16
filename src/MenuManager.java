import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);    
		AccountManager accountmanager = new AccountManager(input);
		    
		selectMenu(input,accountmanager);
	}
	
	 public static void selectMenu(Scanner input , AccountManager accountmanager) {
		 int num = -1; //메뉴 선택 초기값
		 while (num!=5) {
			 try {
		    	showMenu(); 
	            num = input.nextInt();
	            switch(num) {
	            case 1:
	            	accountmanager.addAccount();
	            	break;
	            case 2:
	            	accountmanager.deleteAccount();
	            	break;
	            case 3:
	            	accountmanager.editAccount();
	            	break;
	            case 4:
	            	accountmanager.viewAccounts();
	            	break;
	            default:
	            	continue;
	            } 
	            
	         }
			 catch(InputMismatchException e) {
				 System.out.println("Please put an integer between 1 and 5");
				 if(input.hasNext()) {
					 input.next();
				 }
				 num= -1;
				
			 }
		 }
		 
	 }
	    public static void showMenu() {
	    	System.out.println("Account Management System Menu!!");
            System.out.println("1.Add Account");
            System.out.println("2.Delete Account");
            System.out.println("3.Edit Account");
            System.out.println("4.View Accounts");
            System.out.println("5.Exit ");
            System.out.println("Select one number between in 1-5:");
	    
     }   
}

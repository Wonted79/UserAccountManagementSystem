import java.util.Scanner;
import java.util.Arrays;
public class MenuManager {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int num = 5;
		String[] Account ;
		String []ArrayAsString = {} ; 
	    while (num!=6) {
	    	System.out.println("Account Management System Menu!!");
            System.out.println("1.Add Account");
            System.out.println("2.Delete Account");
            System.out.println("3.Edit Account");
            System.out.println("4.View Account");
            System.out.println("5.Show a menu ");
            System.out.println("6.Exit ");
            System.out.println("Select one number between in 1-6:");
            num = input.nextInt();
            
            if (num==1) {
            	 arrayAsString = Arrays.toString(addAccount());  
            	 
            	 System.out.println(Account);
            }
            else if (num==2) {
            	deleteAccount();
            }
            else if (num==3) {
            	editAccount();
            }
            else if (num==4) {
            	viewAccount(Account);
            }
            else {
            	continue;
            }
         }
     }   

	
	public static String [] addAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("Site:" );
	    String site = input.next();
	    System.out.print("Id:" );
	    String Account_id = input.next();
	    System.out.print("PassWord:" );
	    String Account_pass = input.next();
	    String [] Account   = new String[] {site,Account_id, Account_pass} ;
       
	    return  Account;
	}
	public static void deleteAccount() {
		Scanner input = new Scanner(System.in);
		String site1 = input.next();
		System.out.print(site1+"remove" );
	}
	public static void editAccount() {
		Scanner input = new Scanner(System.in);
		String site2 = input.next();
		System.out.print(site2+ "edit" );
	}
	public static void viewAccount(String[] Account) {
		Scanner input = new Scanner(System.in);
		String site3 = input.next();
		System.out.print(site3+"view" );
		System.out.print( Account);
	}
		

}

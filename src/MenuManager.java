import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int num = 5;
		    		    	         
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
            	addAccount();
            }
            else if (num==2) {
            	deleteAccount();
            }
            else if (num==3) {
            	editAccount();
            }
            else if (num==4) {
            	viewAccount();
            }
            else {
            	continue;
            }
         }
     }   

	
	public static void addAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("Site:" );
	    String site = input.next();
	    System.out.print("Id:" );
	    String Account_id = input.next();
	    System.out.print("PassWord:" );
	    String Account_pass = input.next();
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
	public static void viewAccount() {
		Scanner input = new Scanner(System.in);
		String site3 = input.next();
		System.out.print(site3+"view" );
	}
		

}

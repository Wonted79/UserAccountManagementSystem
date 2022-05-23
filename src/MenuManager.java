import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import log.EventLogger;
import java.util.Scanner;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);    
		AccountManager accountmanager = getObject("accountmanager.ser");
		if (accountmanager ==null) {
			accountmanager = new AccountManager(input);
		}
		else {
			accountmanager.input = input;
		}					 		
		selectMenu(input,accountmanager);
		putObject(accountmanager,"accountmanager.ser");
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
	            	logger.log("add a Account");
	            	break;
	            case 2:
	            	accountmanager.deleteAccount();
	            	logger.log("delete a Account");
	            	break;
	            case 3:
	            	accountmanager.editAccount();
	            	logger.log("edit a Account");
	            	break;
	            case 4:
	            	accountmanager.viewAccounts();
	            	logger.log("view a Account");
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
	    
	    public static AccountManager getObject(String filename) {
	    	AccountManager accountManager = null;	
	    	
	    	try {
	    		FileInputStream file = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(file);
				
				accountManager = (AccountManager) in.readObject();
				
				in.close();
				file.close();
	    	} 
	    	catch (FileNotFoundException e) {
				return accountManager;
			}
	    	catch (EOFException e) {
				// TODO Auto-generated catch block
	    		return accountManager;   //in.readObject(); 에서 더 읽어 올것이 없다면 생기는 오류 예외처리
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return accountManager;
	    }
	    
	    public static void putObject(AccountManager accountManager,String filename) {
	    		    	
	    	try {
	    		FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				out.writeObject(accountManager);
				
				out.close();
				file.close();
	    	} 
	    	catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	
	    }
}

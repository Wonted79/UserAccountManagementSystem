
public class Account {
	String site;
	String ID;
	String Password;
	int StoredNum;

	public Account(){		
	}
	
	public Account(String site,String ID,String Password){
		this.site=site;
		this.ID=ID;
		this.Password=Password;   		
	}
 
	public void printInfo() {
		System.out.println(" 사이트: "+site+" ID: "+ID+" Password: "+Password);
	}
	
	public void printnone() {
		System.out.println(" 사이트는 존재하지 않습니다.");
	}

}


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
		System.out.println(" ����Ʈ: "+site+" ID: "+ID+" Password: "+Password);
	}
	
	public void printnone() {
		System.out.println(" ����Ʈ�� �������� �ʽ��ϴ�.");
	}

}

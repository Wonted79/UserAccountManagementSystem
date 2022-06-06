package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.AccountManager;
public class WindowFrame extends JFrame {
	AccountManager accountManager;
	MenuSelection menuselection ;
	AccountAdder accountadder;
    AccountViewer accountviewer;
    
	public WindowFrame(AccountManager accountManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My frame");
		
		this.accountManager = accountManager;
		menuselection = new MenuSelection(this);
		accountadder = new AccountAdder(this); 
		accountviewer = new AccountViewer(this , this.accountManager);
				
		this.add(menuselection);
		this.setVisible(true);
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public AccountAdder getAccountadder() {
		return accountadder;
	}
	public void setAccountadder(AccountAdder accountadder) {
		this.accountadder = accountadder;
	}
	public AccountViewer getAccountviewer() {
		return accountviewer;
	}
	public void setAccountviewer(AccountViewer accountviewer) {
		this.accountviewer = accountviewer;
	}
	
    public void setupPanel(JPanel panel) {
    	this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
}

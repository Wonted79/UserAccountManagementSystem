package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import account.AccountInput;
import manager.AccountManager;

public class AccountViewer extends JPanel{
	WindowFrame frame;
	AccountManager accountManager;
	public  AccountViewer(WindowFrame frame , AccountManager accountManager){
		this.frame = frame;
		this.accountManager = accountManager;
		
		System.out.println("***"+accountManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("site");
		model.addColumn("ID");
		model.addColumn("Password");
		model.addColumn("Email");
		model.addColumn("SecondPassword");
		
		for(int i=0;i<accountManager.size();i++) {
			Vector<String> row = new Vector<String>();
			AccountInput si= accountManager.get(i);
			row.add(si.getSite());
			row.add(si.getID());
			row.add(si.getPassword());
			row.add(si.getEmail());
			row.add(si.getSecondPassword());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
}

package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountViewer extends JFrame{

	public  AccountViewer(){
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("site");
		model.addColumn("ID");
		model.addColumn("Password");
		model.addColumn("Email");
		model.addColumn("SecondPassword");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(520,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}
}

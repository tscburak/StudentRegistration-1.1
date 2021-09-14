package studentRegistration.business.concretes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import studentRegistration.business.abstracts.StudentService;
import studentRegistration.entities.concretes.Student;

public class TableManager {
	
	JTable table;
	JLabel labeltablo;
	JLabel labeltoday;
	DefaultTableModel model;
	public TableManager(JTable table) {
		super();
		this.table = table;
	}
	
	
	
	public void setWidth(){
		
		TableColumnModel columnModel = table.getColumnModel();
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		columnModel.getColumn(0).setPreferredWidth(42);
		columnModel.getColumn(1).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(200);
		columnModel.getColumn(3).setPreferredWidth(398);


		
		
	}
	
	public int findMaxCharRow(int column){
		
		int max = table.getValueAt(0,column).toString().length();
		int row = 0;
		int count = table.getRowCount();
		
		for(int i = 1 ; i < count ; i++) {
			if(table.getValueAt(i, column).toString().length()>max) {
				max = table.getValueAt(i, column).toString().length();
				row = i;
			}
		}
		
	
	
		return row;
	}
	
	public int countasDate(ArrayList<Student> list){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		
		
		int count = 0;
		for(int i = 0; i < table.getRowCount(); i++) {
			
			if (String.valueOf(list.get(i).getSave()).startsWith(dtf.format(now))) {
				count+=1;
			}
		}
		
		return count;
	}
	
	public void showStudent(ArrayList<Student> list, JLabel labeltablo, JLabel labeltoday) {
		
		
		model = (DefaultTableModel)table.getModel();
		
		model.setRowCount(0);
		
		
		Object[] row = new Object[4];
		
		
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getName();
			row[2] = list.get(i).getSurname();
			row[3] = list.get(i).getDepartments();
			model.addRow(row);
		}
		
		labeltablo.setText(String.valueOf(model.getRowCount()));
		labeltoday.setText(String.valueOf(countasDate(list)));
		
		
	}

	
}

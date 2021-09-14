package studentRegistration.business.abstracts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import studentRegistration.entities.concretes.Student;

public interface StudentService {

	public void saveStudent(Student student);
	
	public ArrayList<Student> getAllStudent();
	
	public void deleteStudent(int[] value,JTable table);
	
	public void updateStudent(Student student,int value);
	
	public ArrayList<Student> getFindStudent(String findValue, String findElements);
	
	public ArrayList<Student> selectStudent(String sql);
	
	public void importStudent(ArrayList<Student> newList)throws Exception;
	
	}

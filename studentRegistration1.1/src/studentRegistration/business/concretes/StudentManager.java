package studentRegistration.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;


import studentRegistration.business.abstracts.StudentService;
import studentRegistration.dataAccess.concretes.ConnectDb;
import studentRegistration.entities.concretes.Student;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import net.proteanit.sql.DbUtils;

public class StudentManager implements StudentService{

	ConnectDb connectDb = new ConnectDb();
	
	Connection connection = connectDb.connectDb();
	PreparedStatement pst = null;
	ResultSet rs= null;
	
	
	
	@Override
	public void saveStudent(Student student) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		
		String sql = "INSERT INTO candidate_student(name, surname, phone_number, email,"
				+ "departments, score_type, score, placement_priority, highschool,"
				+ "education_situation, nereden, location, save)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = connection.prepareStatement(sql);
			
			
			pst.setString(1, student.getName());
			pst.setString(2, student.getSurname());
			pst.setString(3, student.getPhone_number());
			pst.setString(4, student.getEmail());
			pst.setString(5, student.getDepartments());
			pst.setString(6, student.getScore_type());
			pst.setDouble(7, student.getScore());
			pst.setString(8, student.getPlacement_priority());
			pst.setString(9, student.getHighschool());
			pst.setString(10, student.getEducation_situation());
			pst.setString(11, student.getWhere());
			pst.setString(12, student.getLocation());
			pst.setString(13, dtf.format(now));
			
			
			if(student.getName().isEmpty() || student.getSurname().isEmpty() || student.getEmail().isEmpty()) {
				JOptionPane.showMessageDialog(null,"Zorunlu Bilgileri Girdiðinizden Emin olunuz.");
			}
			else {
				pst.execute();
				JOptionPane.showMessageDialog(null, "Öðrenci Eklendi!");
			}

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public ArrayList<Student> getAllStudent() {
		
		
		
		String sql = "SELECT * from candidate_student ORDER BY id";
		
		
		
		
		return selectStudent(sql);
		
		
	}

	@Override
	public void deleteStudent(int[] value,JTable table ) {
		
		for(int i = 0 ; i<value.length ; i++) {
			String sql = "DELETE from candidate_student WHERE id="+value[i];
			
			try {

				pst = connection.prepareStatement(sql);	
				pst.execute();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void updateStudent(Student student,int value) {
		
		String sql = "UPDATE candidate_student SET name ='"+student.getName()+"', surname='"+student.getSurname()+"', phone_number='"+student.getPhone_number() +
				"', email='"+student.getEmail()+"', departments='"+student.getDepartments()+"', score_type='"+student.getScore_type()+"', score="+student.getScore()+
				", placement_priority='"+student.getPlacement_priority()+"', highschool='"+student.getHighschool()
				+ "', education_situation='"+student.getEducation_situation()+"', nereden='"+student.getWhere()+"', location='"+student.getLocation()+"' WHERE id="+value;
		try {
			pst = connection.prepareStatement(sql);
			
			
			pst.execute();
			JOptionPane.showMessageDialog(null, "Öðrenci Güncellendi!");
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<Student> getFindStudent(String findValue,String findElements) {

		
		
		String sql = "SELECT * from candidate_student WHERE CONCAT ("+findElements+") LIKE '%"+findValue+"%' ORDER BY id";
		
		return selectStudent(sql);
		
		
	}

	@Override
	public ArrayList<Student> selectStudent(String sql) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(sql);
			rs=pst.executeQuery();

			
			
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setSurname(rs.getString("surname"));
				student.setPhone_number(rs.getString("phone_number"));
				student.setEmail(rs.getString("email"));
				student.setDepartments(rs.getString("departments"));
				student.setScore_type(rs.getString("score_type"));
				student.setScore(rs.getDouble("score"));
				student.setPlacement_priority(rs.getString("placement_priority"));
				student.setHighschool(rs.getString("highschool"));
				student.setEducation_situation(rs.getString("education_situation"));
				student.setWhere(rs.getString("nereden"));
				student.setLocation(rs.getString("location"));
				student.setSave(rs.getString("save"));
				
				studentList.add(student);
				
			}
			
		} catch (org.postgresql.util.PSQLException e2) {
			JOptionPane.showMessageDialog(null, "Lütfen Arama Yapacaðýnýz Sütun/Sütunlarý Kutucuklardan Ýþaretleyiniz.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return studentList;
	}

	@Override
	public void importStudent(ArrayList<Student> newList) throws Exception {

		String sql = "INSERT INTO candidate_student(id, name, surname, phone_number, email,"
				+ "departments, score_type, score, placement_priority, highschool,"
				+ "education_situation, nereden, location, save)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		
			pst = connection.prepareStatement(sql);
			
			for(int i = 0 ; i < newList.size() ; i++) {
				pst.setInt(1, newList.get(i).getId());
				pst.setString(2, newList.get(i).getName());
				pst.setString(3, newList.get(i).getSurname());
				pst.setString(4, newList.get(i).getPhone_number());
				pst.setString(5, newList.get(i).getEmail());
				pst.setString(6, newList.get(i).getDepartments());
				pst.setString(7, newList.get(i).getScore_type());
				pst.setDouble(8, newList.get(i).getScore());
				pst.setString(9, newList.get(i).getPlacement_priority());
				pst.setString(10, newList.get(i).getHighschool());
				pst.setString(11, newList.get(i).getEducation_situation());
				pst.setString(12, newList.get(i).getWhere());
				pst.setString(13, newList.get(i).getLocation());
				pst.setString(14, newList.get(i).getSave());
				pst.execute();
				
			}
			
			if(newList.size()<1) {
				
				throw new ArrayStoreException();
			}
			
			
				
				
		

		
		
	}


	
	

}

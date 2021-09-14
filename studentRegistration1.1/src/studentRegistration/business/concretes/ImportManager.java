package studentRegistration.business.concretes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import studentRegistration.business.abstracts.StudentService;
import studentRegistration.entities.concretes.Student;



public class ImportManager {

	StudentService studentManager = new StudentManager();
	FileManager fileManager = new FileManager();
	ArrayList<Student> fileList = new ArrayList<Student>();
	String path = fileManager.getFolderSource();
	static HSSFRow row;
	
	
	public ArrayList<Student> mapData() throws FileNotFoundException, IOException {
		
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(path)));

		HSSFSheet spreadsheet = workbook.getSheetAt(0);	
		
		int rows = spreadsheet.getPhysicalNumberOfRows();
		

		for(int i = 2 ; i <= rows ; i++) {
			
			Student student = new Student();
			
			for(int j = 0 ; j<14 ; j++) {
				
				row = spreadsheet.getRow(i);
				Cell cell = row.getCell(j);
				
				switch (j) {
					case 0:
						student.setId((int)cell.getNumericCellValue());
						break;
					case 1:
						student.setName(cell.getStringCellValue());
						break;
					case 2:
						student.setSurname(cell.getStringCellValue());
						break;
					case 3:
						student.setPhone_number(cell.getStringCellValue());
						break;
					case 4:
						student.setEmail(cell.getStringCellValue());
						break;
					case 5:
						student.setLocation(cell.getStringCellValue());
						break;
					case 6:
						student.setDepartments(cell.getStringCellValue());
						break;
					case 7:
						student.setScore(cell.getNumericCellValue());
						break;
					case 8:
						student.setPlacement_priority(cell.getStringCellValue());
						break;
					case 9:
						student.setScore_type(cell.getStringCellValue());
						break;
					case 10:
						student.setHighschool(cell.getStringCellValue());
						break;
					case 11:
						student.setEducation_situation(cell.getStringCellValue());
						break;
					case 12:
						student.setWhere(cell.getStringCellValue());
						break;
					case 13:
						student.setSave(cell.getStringCellValue());
						break;
		
				
			}
			
		}
		
		fileList.add(student);
		
		}
		
		return fileList;
	
	}
	
	public ArrayList<Student> checkAndValidation(ArrayList<Student> studentList) throws FileNotFoundException, IOException{
		
		ArrayList<Student> oldList = mapData();
		ArrayList<Student> newList = new ArrayList<>();
		
		
		
		for(int i = 0 ; i < oldList.size() ; i++) {
			
			int count = 0;
			for(int j = 0 ; j < studentList.size() ; j++) {
				
				if(studentList.get(j).getId() == oldList.get(i).getId()) {
					count++;
				}
				
			}
			
			if(count==0) {
				newList.add(oldList.get(i));
			}
		}
		
		
		
		return newList;
	}

	public void importDataBase(ArrayList<Student> studentList) throws Exception {
		
		if(fileManager.checkTheFileFormat(path))
		{
			studentManager.importStudent(checkAndValidation(studentList));
		}
		else {
			JOptionPane.showMessageDialog(null, "Dosyanýz Aktarmaya Uygun Deðildir. Lütfen Formata Uygun Olmasýna Dikkat Edin");
		}
		
		
	}
}

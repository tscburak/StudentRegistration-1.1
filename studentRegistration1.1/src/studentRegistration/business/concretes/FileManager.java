package studentRegistration.business.concretes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class FileManager {
	
public String getFileDirector() {
		
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.showSaveDialog(null);
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		File file=fileChooser.getSelectedFile();
		String path=file.getAbsolutePath();
		file.setReadable(true);
		
		
		return path;
	}

public String getFolderSource() {
	
	JFileChooser fileChooser=new JFileChooser();
	FileNameExtensionFilter xls = new FileNameExtensionFilter("Excel files","xls","excel");
	FileNameExtensionFilter csv = new FileNameExtensionFilter("Excel files","csv","excel");
	fileChooser.addChoosableFileFilter(xls);
	fileChooser.addChoosableFileFilter(csv);
	fileChooser.setFileFilter(xls);
	
	fileChooser.showOpenDialog(fileChooser);
	File file=fileChooser.getSelectedFile();
	String path=file.getAbsolutePath();
	
	
	
	return path;
	
}
	
public boolean checkTheFileFormat(String path) throws FileNotFoundException, IOException {
	
	HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(path)));

	HSSFSheet spreadsheet = workbook.getSheetAt(0);
	
	HSSFRow  row = spreadsheet.getRow(1);
	Cell cell[] = new Cell[14];
	
	for(int i = 0 ; i < 14 ; i++) {
		cell[i]=row.getCell(i);
	}
	
	
	
	boolean checkTitle = cell[0].getStringCellValue().equals("ID") && cell[1].getStringCellValue().equals("AD") && cell[2].getStringCellValue().equals("SOYAD")
			&& cell[3].getStringCellValue().equals("TELEFON NUMARASI")&& cell[4].getStringCellValue().equals("MAÝL") && cell[5].getStringCellValue().equals("ÝL")
			&& cell[6].getStringCellValue().equals("BÖLÜMLER") && cell[7].getStringCellValue().equals("PUAN") && cell[8].getStringCellValue().equals("SIRALAMA")
			&& cell[9].getStringCellValue().equals("PUAN TÜRÜ") && cell[10].getStringCellValue().equals("LÝSE") && cell[11].getStringCellValue().equals("EÐÝTÝM DURUMU")
			&& cell[12].getStringCellValue().equals("NEREDEN DUYDUN") && cell[13].getStringCellValue().equals("KAYIT TARÝHÝ");
	
	
	;
	
	
	
	
	return checkTitle;
}

}

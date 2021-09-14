package studentRegistration.business.concretes;

import javax.swing.JCheckBox;




public class FindManager {

	JCheckBox id,name,surname,phone_number,score,priority,score_type,nereden,education,location,departments,highschool,mail,save;
	
	
	


	public FindManager(JCheckBox id, JCheckBox name, JCheckBox surname, JCheckBox phone_number, JCheckBox score,
			JCheckBox priority, JCheckBox score_type, JCheckBox nereden, JCheckBox education, JCheckBox location,
			JCheckBox departments, JCheckBox highschool, JCheckBox mail, JCheckBox save) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phone_number = phone_number;
		this.score = score;
		this.priority = priority;
		this.score_type = score_type;
		this.nereden = nereden;
		this.education = education;
		this.location = location;
		this.departments = departments;
		this.highschool = highschool;
		this.mail = mail;
		this.save = save;
	}





	public String findAt(){
		String text="";
		
		if(id.isSelected()) {
			text=text+"id, ";
		}
		if(name.isSelected()) {
			text=text+"name, ";
		}
		if(surname.isSelected()) {
			text=text+"surname, ";
		}
		if(phone_number.isSelected()) {
			text=text+"phone_number, ";
		}
		if(score.isSelected()) {
			text=text+"score, ";
		}
		if(highschool.isSelected()) {
			text=text+"highschool, ";
		}
		if(education.isSelected()) {
			text=text+"education_situation, ";
		}
		if(nereden.isSelected()) {
			text=text+"nereden, ";
		}
		if(location.isSelected()) {
			text=text+"location, ";
		}
		if(priority.isSelected()) {
			text=text+"placement_priority, ";
		}
		if(score_type.isSelected()) {
			text=text+"score_type, ";
		}
		if(location.isSelected()) {
			text=text+"location, ";
		}
		if(departments.isSelected()) {
			text=text+"departments, ";
		}
		if(mail.isSelected()) {
			text=text+"email";
		}
		if(save.isSelected()) {
			text=text+"save, ";
		}
		
		
		
		int lastIndex = text.length()-2;
		
		try {
			return text.substring(0,lastIndex);
		}
		catch(java.lang.StringIndexOutOfBoundsException e) {
			return " ";
		}
		
		
		
	}
	
}

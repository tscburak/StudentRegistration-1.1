package studentRegistration.business.concretes;

import javax.swing.JCheckBox;

public class EducationTypeManager {
	
	public String whichOne(JCheckBox cb1, JCheckBox cb2) {
		
		if(cb1.isSelected()) {
			return cb1.getText();
		}
		else if(cb2.isSelected())
		{
			return cb2.getText();
		}
		else {
			return "";
		}
		
	}

}

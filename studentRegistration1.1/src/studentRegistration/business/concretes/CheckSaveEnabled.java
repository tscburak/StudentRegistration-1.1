package studentRegistration.business.concretes;

import javax.swing.JButton;

public class CheckSaveEnabled {
	
	
	
	public void checkSaveEnabled(boolean conditionEmail, boolean conditionName,boolean conditionSurname, JButton btnKaydet) {
	
		if(conditionEmail & conditionName & conditionSurname) {
			btnKaydet.setEnabled(true);
		}
		else {
			btnKaydet.setEnabled(false);
		}
		
	}

}

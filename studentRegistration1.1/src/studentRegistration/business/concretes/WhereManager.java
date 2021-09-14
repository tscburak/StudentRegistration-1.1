package studentRegistration.business.concretes;

import javax.swing.JCheckBox;

public class WhereManager {

	
	
	JCheckBox cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14;
	
	
	public WhereManager(JCheckBox cb3, JCheckBox cb4, JCheckBox cb5, JCheckBox cb6, JCheckBox cb7, JCheckBox cb8,
			JCheckBox cb9, JCheckBox cb10, JCheckBox cb11, JCheckBox cb12, JCheckBox cb13, JCheckBox cb14) {
		super();
		this.cb3 = cb3;
		this.cb4 = cb4;
		this.cb5 = cb5;
		this.cb6 = cb6;
		this.cb7 = cb7;
		this.cb8 = cb8;
		this.cb9 = cb9;
		this.cb10 = cb10;
		this.cb11 = cb11;
		this.cb12 = cb12;
		this.cb13 = cb13;
		this.cb14 = cb14;
	}


	public String whereYouHearFrom(){
		String text="";
		
		if(cb3.isSelected()) {
			text=text+cb3.getText()+", ";
		}
		if(cb4.isSelected()) {
			text=text+cb4.getText()+", ";
		}
		if(cb5.isSelected()) {
			text=text+cb5.getText()+", ";
		}
		if(cb6.isSelected()) {
			text=text+cb6.getText()+", ";
		}
		if(cb7.isSelected()) {
			text=text+cb7.getText()+", ";
		}
		if(cb8.isSelected()) {
			text=text+cb8.getText()+", ";
		}
		if(cb9.isSelected()) {
			text=text+cb9.getText()+", ";
		}
		if(cb10.isSelected()) {
			text=text+cb10.getText()+", ";
		}
		if(cb11.isSelected()) {
			text=text+cb11.getText()+", ";
		}
		if(cb12.isSelected()) {
			text=text+cb12.getText()+", ";
		}
		if(cb13.isSelected()) {
			text=text+cb13.getText()+", ";
		}
		if(cb14.isSelected()) {
			text=text+cb14.getText()+", ";
		}
		
		
			return text;
		
		
	}
	
}

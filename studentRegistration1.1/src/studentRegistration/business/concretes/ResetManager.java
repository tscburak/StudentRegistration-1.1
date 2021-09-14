package studentRegistration.business.concretes;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ResetManager {

	JTextField textName, textSurname, textPhone, textMail, textDeparments, textScore, textProprioraty, textHighschool, textFieldDiger;
	JCheckBox chckbox1,chckbox2,chckbox3,chckbox4,chckbox5,chckbox6,chckbox7,chckbox8,chckbox9,chckbox10,chckbox11,chckbox12,chckbox13,chckbox14,chckbox15;
	JComboBox comboBox, comboBox_1;
	JButton btnUpdate;
	JLabel lblCurrentUpdateText, lblCurrentUpdateId;
	
	
	
	public ResetManager(JTextField textName, JTextField textSurname, JTextField textPhone, JTextField textMail,
			JTextField textDeparments, JTextField textScore, JTextField textProprioraty, JTextField textHighschool,
			JTextField textFieldDiger, JCheckBox chckbox1, JCheckBox chckbox2, JCheckBox chckbox3, JCheckBox chckbox4,
			JCheckBox chckbox5, JCheckBox chckbox6, JCheckBox chckbox7, JCheckBox chckbox8, JCheckBox chckbox9,
			JCheckBox chckbox10, JCheckBox chckbox11, JCheckBox chckbox12, JCheckBox chckbox13, JCheckBox chckbox14,
			JCheckBox chckbox15, JComboBox comboBox, JComboBox comboBox_1, JButton btnUpdate,
			JLabel lblCurrentUpdateText, JLabel lblCurrentUpdateId) {
		super();
		this.textName = textName;
		this.textSurname = textSurname;
		this.textPhone = textPhone;
		this.textMail = textMail;
		this.textDeparments = textDeparments;
		this.textScore = textScore;
		this.textProprioraty = textProprioraty;
		this.textHighschool = textHighschool;
		this.textFieldDiger = textFieldDiger;
		this.chckbox1 = chckbox1;
		this.chckbox2 = chckbox2;
		this.chckbox3 = chckbox3;
		this.chckbox4 = chckbox4;
		this.chckbox5 = chckbox5;
		this.chckbox6 = chckbox6;
		this.chckbox7 = chckbox7;
		this.chckbox8 = chckbox8;
		this.chckbox9 = chckbox9;
		this.chckbox10 = chckbox10;
		this.chckbox11 = chckbox11;
		this.chckbox12 = chckbox12;
		this.chckbox13 = chckbox13;
		this.chckbox14 = chckbox14;
		this.chckbox15 = chckbox15;
		this.comboBox = comboBox;
		this.comboBox_1 = comboBox_1;
		this.btnUpdate = btnUpdate;
		this.lblCurrentUpdateText = lblCurrentUpdateText;
		this.lblCurrentUpdateId = lblCurrentUpdateId;
	}



	public void resetAllField() {
		textName.setText(null);
		textSurname.setText(null);
		textPhone.setText(null);
		textMail.setText(null);
		textDeparments.setText(null);
		textScore.setText(null);
		textProprioraty.setText(null);
		textHighschool.setText(null);
		textFieldDiger.setText(null);
		chckbox1.setSelected(false);
		chckbox2.setSelected(false);
		chckbox3.setSelected(false);
		chckbox4.setSelected(false);
		chckbox5.setSelected(false);
		chckbox6.setSelected(false);
		chckbox7.setSelected(false);
		chckbox8.setSelected(false);
		chckbox9.setSelected(false);
		chckbox10.setSelected(false);
		chckbox11.setSelected(false);
		chckbox12.setSelected(false);
		chckbox13.setSelected(false);
		chckbox14.setSelected(false);
		chckbox15.setSelected(false);
		comboBox.setSelectedIndex(0);
		comboBox_1.setSelectedIndex(0);
		textFieldDiger.setEditable(false);
		
		btnUpdate.setEnabled(false);
		lblCurrentUpdateText.setVisible(false);
		lblCurrentUpdateId.setVisible(false);
	}
}

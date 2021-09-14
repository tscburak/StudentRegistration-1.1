package studentRegistration.business.concretes;

import java.awt.TextField;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class RefreshManager {
	
	JCheckBox chckbxBolumler, chckbxEitimDurumu, chckbxId, chckbxIl, chckbxLise, chckbxMail, chckbxName, chckbxNereden, chckbxPuan, chckbxPuanturu,
	chckbxSiralama,chckbxSurname, chckbxTelefonNumaras;
	JTextField textField;
	
	
	
	public RefreshManager(JCheckBox chckbxBolumler, JCheckBox chckbxEitimDurumu, JCheckBox chckbxId, JCheckBox chckbxIl,
			JCheckBox chckbxLise, JCheckBox chckbxMail, JCheckBox chckbxName, JCheckBox chckbxNereden,
			JCheckBox chckbxPuan, JCheckBox chckbxPuanturu, JCheckBox chckbxSiralama, JCheckBox chckbxSurname,
			JCheckBox chckbxTelefonNumaras, JTextField textField) {
		super();
		this.chckbxBolumler = chckbxBolumler;
		this.chckbxEitimDurumu = chckbxEitimDurumu;
		this.chckbxId = chckbxId;
		this.chckbxIl = chckbxIl;
		this.chckbxLise = chckbxLise;
		this.chckbxMail = chckbxMail;
		this.chckbxName = chckbxName;
		this.chckbxNereden = chckbxNereden;
		this.chckbxPuan = chckbxPuan;
		this.chckbxPuanturu = chckbxPuanturu;
		this.chckbxSiralama = chckbxSiralama;
		this.chckbxSurname = chckbxSurname;
		this.chckbxTelefonNumaras = chckbxTelefonNumaras;
		this.textField = textField;
	}



	public void RefreshTableAndCheckBox() {
		
		chckbxBolumler.setSelected(false);
		chckbxEitimDurumu.setSelected(false);
		chckbxId.setSelected(false);
		chckbxIl.setSelected(false);
		chckbxLise.setSelected(false);
		chckbxMail.setSelected(false);
		chckbxName.setSelected(false);
		chckbxNereden.setSelected(false);
		chckbxPuan.setSelected(false);
		chckbxPuanturu.setSelected(false);
		chckbxSiralama.setSelected(false);
		chckbxSurname.setSelected(false);
		chckbxTelefonNumaras.setSelected(false);
		textField.setText(null);
	}

}

package studentRegistration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import studentRegistration.entities.concretes.Student;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class DetailScreen extends JFrame {

	private JPanel contentPane;


	public DetailScreen(ArrayList<Student> studentList, int row) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DetailScreen.class.getResource("/images/graduated.png")));
		setType(Type.POPUP);
		setTitle("\u00D6\u011Frenci Detay\u0131");
		setResizable(false);
		setBounds(100, 100, 501, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
		);
		
		JLabel lblAd = new JLabel("Ad\r\n");
		lblAd.setBounds(12, 64, 11, 14);
		lblAd.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblName = new JLabel("Ad\r\n");
		lblName.setBounds(12, 78, 130, 17);
		lblName.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblSurname = new JLabel("Soyad");
		lblSurname.setBounds(179, 78, 130, 17);
		lblSurname.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setBounds(179, 64, 38, 14);
		lblSoyad.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblPhoneNumber = new JLabel("05313078753");
		lblPhoneNumber.setBounds(336, 78, 130, 17);
		lblPhoneNumber.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras = new JLabel("Telefon Numaras\u0131");
		lblTelefonNumaras.setBounds(336, 64, 73, 14);
		lblTelefonNumaras.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblIl = new JLabel("\u0130l");
		lblIl.setBounds(12, 112, 11, 14);
		lblIl.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblLocation = new JLabel("\u0130stanbul");
		lblLocation.setBounds(12, 126, 130, 17);
		lblLocation.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblEposta = new JLabel("E-Posta\r\n");
		lblEposta.setBounds(179, 112, 38, 14);
		lblEposta.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblEmail = new JLabel("buraktasci2001@gmail.com");
		lblEmail.setBounds(179, 126, 249, 17);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras_1 = new JLabel("B\u00F6l\u00FCmler\r\n");
		lblTelefonNumaras_1.setBounds(12, 160, 73, 14);
		lblTelefonNumaras_1.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblDepartments = new JLabel("Yaz\u0131l\u0131m M\u00FChendisli\u011Fi");
		lblDepartments.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartments.setVerticalAlignment(SwingConstants.TOP);
		lblDepartments.setBounds(12, 174, 454, 36);
		lblDepartments.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblScore = new JLabel("330.2301");
		lblScore.setBounds(12, 222, 73, 17);
		lblScore.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras_1_1 = new JLabel("Puan\r\n");
		lblTelefonNumaras_1_1.setBounds(12, 208, 44, 14);
		lblTelefonNumaras_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblTelefonNumaras_1_1_1 = new JLabel("S\u0131ralama\r\n");
		lblTelefonNumaras_1_1_1.setBounds(179, 208, 44, 14);
		lblTelefonNumaras_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblPriority = new JLabel("1.330.2301");
		lblPriority.setBounds(179, 222, 98, 17);
		lblPriority.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras_1_1_1_1 = new JLabel("Puan T\u00FCr\u00FC\r\n");
		lblTelefonNumaras_1_1_1_1.setBounds(336, 208, 44, 14);
		lblTelefonNumaras_1_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblScoreType = new JLabel("SAY");
		lblScoreType.setBounds(336, 222, 98, 17);
		lblScoreType.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras_1_1_2 = new JLabel("Lise");
		lblTelefonNumaras_1_1_2.setBounds(12, 256, 44, 14);
		lblTelefonNumaras_1_1_2.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblHighSchool = new JLabel("\u0130stanbul Kad\u0131k\u00F6y Lisesi");
		lblHighSchool.setHorizontalAlignment(SwingConstants.LEFT);
		lblHighSchool.setVerticalAlignment(SwingConstants.TOP);
		lblHighSchool.setBounds(12, 270, 283, 36);
		lblHighSchool.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras_1_1_1_1_1 = new JLabel("E\u011Fitim Durumu");
		lblTelefonNumaras_1_1_1_1_1.setBounds(336, 256, 73, 14);
		lblTelefonNumaras_1_1_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblEducationSituation = new JLabel("12. S\u0131n\u0131f");
		lblEducationSituation.setBounds(336, 270, 98, 17);
		lblEducationSituation.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblTelefonNumaras_1_2 = new JLabel("Nereden Duydun");
		lblTelefonNumaras_1_2.setBounds(12, 304, 73, 14);
		lblTelefonNumaras_1_2.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		
		JLabel lblWhere = new JLabel("Yaz\u0131l\u0131m M\u00FChendisli\u011Fi");
		lblWhere.setBounds(12, 318, 454, 67);
		lblWhere.setVerticalAlignment(SwingConstants.TOP);
		lblWhere.setHorizontalAlignment(SwingConstants.LEFT);
		lblWhere.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.setLayout(gl_contentPane);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		lblId.setBounds(12, 12, 11, 14);
		panel.add(lblId);
		
		JLabel lbldendity = new JLabel((String) null);
		lbldendity.setFont(new Font("Arial", Font.BOLD, 14));
		lbldendity.setBounds(12, 30, 130, 17);
		panel.add(lbldendity);
		
		JLabel lblDate = new JLabel("Kay\u0131t Tarihi");
		lblDate.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		lblDate.setBounds(179, 12, 73, 14);
		panel.add(lblDate);
		
		JLabel lblSave = new JLabel((String) null);
		lblSave.setFont(new Font("Arial", Font.BOLD, 14));
		lblSave.setBounds(179, 30, 230, 17);
		panel.add(lblSave);
		
		lblName.setText(studentList.get(row).getName());
		lblSurname.setText(studentList.get(row).getSurname());
		lblPhoneNumber.setText(studentList.get(row).getPhone_number());
		lblEmail.setText(studentList.get(row).getEmail());
		lblLocation.setText(studentList.get(row).getLocation());
		lblHighSchool.setText("<html><p style=\"width:240px\">"+studentList.get(row).getHighschool()+"</p></html>");
		lblScore.setText(String.valueOf(studentList.get(row).getScore()));
		lblScoreType.setText(studentList.get(row).getScore_type());
		lblPriority.setText(studentList.get(row).getPlacement_priority());
		lblEducationSituation.setText(studentList.get(row).getEducation_situation());
		lblWhere.setText("<html><p style=\"width:320px\">"+studentList.get(row).getWhere()+"</p></html>");
		lblDepartments.setText("<html><p style=\"width:320px\">"+studentList.get(row).getDepartments()+"</p></html>");
		lbldendity.setText(String.valueOf(studentList.get(row).getId()));
		lblSave.setText(studentList.get(row).getSave());
		
		
		
		panel.setLayout(null);
		panel.add(lblWhere);
		panel.add(lblAd);
		panel.add(lblSoyad);
		panel.add(lblTelefonNumaras);
		panel.add(lblName);
		panel.add(lblSurname);
		panel.add(lblPhoneNumber);
		panel.add(lblIl);
		panel.add(lblEposta);
		panel.add(lblLocation);
		panel.add(lblEmail);
		panel.add(lblTelefonNumaras_1);
		panel.add(lblDepartments);
		panel.add(lblTelefonNumaras_1_1);
		panel.add(lblTelefonNumaras_1_1_1);
		panel.add(lblTelefonNumaras_1_1_1_1);
		panel.add(lblScore);
		panel.add(lblPriority);
		panel.add(lblScoreType);
		panel.add(lblTelefonNumaras_1_1_2);
		panel.add(lblTelefonNumaras_1_1_1_1_1);
		panel.add(lblHighSchool);
		panel.add(lblEducationSituation);
		panel.add(lblTelefonNumaras_1_2);
		
		
	}
}

package studentRegistration;


import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import studentRegistration.business.abstracts.StudentService;
import studentRegistration.business.concretes.CheckSaveEnabled;
import studentRegistration.business.concretes.EducationTypeManager;
import studentRegistration.business.concretes.ExportManager;
import studentRegistration.business.concretes.FindManager;
import studentRegistration.business.concretes.ImportManager;
import studentRegistration.business.concretes.RefreshManager;
import studentRegistration.business.concretes.ResetManager;
import studentRegistration.business.concretes.StudentManager;
import studentRegistration.business.concretes.SwitchPanel;
import studentRegistration.business.concretes.TableManager;
import studentRegistration.business.concretes.WhereManager;
import studentRegistration.entities.concretes.Student;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;




import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Rectangle;

import java.awt.GridLayout;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class JFrame extends javax.swing.JFrame {
	
	
	EducationTypeManager educationTypeManager = new EducationTypeManager();
	StudentService studentManager = new StudentManager();
	CheckSaveEnabled checkSaveEnabled = new CheckSaveEnabled();
	SwitchPanel switchPanel = new SwitchPanel();
	ArrayList<Student> list = studentManager.getAllStudent();
	
	

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textSurname;
	private JTextField textPhone;
	private JTextField textMail;
	private JTextField textDeparments;
	private JTextField textScore;
	private JTextField textProprioraty;
	private JTextField textHighschool;
	private JTextField textFieldDiger;
	private JTable table;
	private JTextField textField;
	
	int updateValueId;
	boolean conditionName;
	boolean conditionSurname;
	boolean conditionEmail;
	boolean checkSearchField = false;
	boolean selectedSearchCheckBox = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		
			}
		});
		

		
	}
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public JFrame() {
		setResizable(false);
		setTitle("Kay\u0131t Formu\r\n");
		setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(1460, 800));
		setBounds(100, 100, 1200, 719);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 34, 1164, 632);
		layeredPane.setLayout(null);
		contentPane.add(layeredPane);
		
		JPanel panelkayit = new JPanel();
		layeredPane.setLayer(panelkayit, 2);
		panelkayit.setBackground(SystemColor.controlHighlight);
		panelkayit.setFont(new Font("Dialog", Font.PLAIN, 12));
		panelkayit.setBounds(0, 0, 1164, 639);
		layeredPane.add(panelkayit);
		
		
		JPanel panelogrenciler = new JPanel();
		panelogrenciler.setBackground(SystemColor.controlHighlight);
		layeredPane.setLayer(panelogrenciler, 1);
		panelogrenciler.setBounds(0, 0, 1164, 639);
		layeredPane.add(panelogrenciler);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setEnabled(false);
		btnKaydet.setBounds(680, 578, 89, 23);
		
		JLabel lblNewLabel = new JLabel("... \u00DCN\u0130VERS\u0130TES\u0130");
		lblNewLabel.setBounds(477, 105, 210, 31);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		
		JLabel lblAdayrenciKayt = new JLabel("Aday \u00D6\u011Frenci Kay\u0131t Formu");
		lblAdayrenciKayt.setBounds(470, 133, 223, 31);
		lblAdayrenciKayt.setFont(new Font("Arial", Font.PLAIN, 19));
		
		JLabel lblNewLabelName = new JLabel("Bu alan doldurulmalýdýr.");
		lblNewLabelName.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelName.setBounds(156, 225, 223, 16);
		panelkayit.add(lblNewLabelName);
		
		JLabel lblNewLabelSurname = new JLabel("Bu alan doldurulmal\u0131d\u0131r.");
		lblNewLabelSurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelSurname.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelSurname.setBounds(480, 225, 223, 16);
		panelkayit.add(lblNewLabelSurname);
		
		JLabel lblNewLabelMail = new JLabel("Bu alan doldurulmal\u0131d\u0131r.");
		lblNewLabelMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelMail.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelMail.setBounds(480, 270, 223, 16);
		panelkayit.add(lblNewLabelMail);
		
		
		
		textName = new JTextField();
		textName.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				
				if(textName.getText().toString().length()!=0) {
					lblNewLabelName.setText("");
					conditionName=true;
					
				}
				else {
					lblNewLabelName.setText("Bu alan doldurulmalýdýr.");
					conditionName=false;
				}
				
				checkSaveEnabled.checkSaveEnabled(conditionEmail, conditionName, conditionSurname, btnKaydet);
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				
				
				if(textName.getText().toString().length()!=0) {
					lblNewLabelName.setText("");
					conditionName=true;
					
				}
				else {
					lblNewLabelName.setText("Bu alan doldurulmalýdýr.");
					conditionName=false;
				}
				
				checkSaveEnabled.checkSaveEnabled(conditionEmail, conditionName, conditionSurname, btnKaydet);
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				
				
			}
		});
		
		textName.setBounds(193, 205, 172, 20);
		textName.setColumns(10);
		
		textSurname = new JTextField();		
		textSurname.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				
				if(textSurname.getText().toString().length()!=0) {
					lblNewLabelSurname.setText("");
					conditionSurname=true;
					
				}
				else {
					lblNewLabelSurname.setText("Bu alan doldurulmalýdýr.");
					conditionSurname=false;
				}
				
				checkSaveEnabled.checkSaveEnabled(conditionEmail, conditionName, conditionSurname, btnKaydet);
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				
				if(textSurname.getText().toString().length()!=0) {
					lblNewLabelSurname.setText("");
					conditionSurname=true;
					
				}
				else {
					lblNewLabelSurname.setText("Bu alan doldurulmalýdýr.");
					conditionSurname=false;
				}
				
				checkSaveEnabled.checkSaveEnabled(conditionEmail, conditionName, conditionSurname, btnKaydet);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				
				
			}
		});
		textSurname.setBounds(510, 205, 172, 20);
		textSurname.setColumns(10);
		
		JLabel lblAd = new JLabel("*Ad:");
		lblAd.setBounds(156, 208, 30, 14);
		lblAd.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JLabel lblSoyad = new JLabel("*Soyad:");
		lblSoyad.setBounds(451, 207, 56, 17);
		lblSoyad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoyad.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JLabel lblTelefonNo = new JLabel("Telefon No:");
		lblTelefonNo.setBounds(739, 207, 83, 17);
		lblTelefonNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefonNo.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textPhone = new JTextField();
		textPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textPhone.getText().length()==11) {
					e.consume();
				}
			}
		});
				textPhone.setBounds(829, 205, 172, 20);
		textPhone.setColumns(10);
		
		JLabel lblil = new JLabel("\u0130l:");
		lblil.setBounds(167, 253, 19, 17);
		lblil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblil.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(193, 251, 172, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Se\u00E7iniz", "Adana", "Ad\u0131yaman", "Afyonkarahisar", "A\u011Fr\u0131", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Ayd\u0131n", "Bal\u0131kesir", "Bart\u0131n", "Batman", "Bayburt", "Bilecik", "Bing\u00F6l", "Bitlis", "Bolu", "Burdur", "Bursa", "\u00C7anakkale", "\u00C7ank\u0131r\u0131", "\u00C7orum", "Denizli", "Diyarbak\u0131r", "D\u00FCzce", "Edirne", "Elaz\u0131\u011F", "Erzincan", "Erzurum", "Eski\u015Fehir", "Gaziantep", "Giresun", "G\u00FCm\u00FC\u015Fhane", "Hakk\u00E2ri", "Hatay", "I\u011Fd\u0131r", "Isparta", "\u0130stanbul", "\u0130zmir", "Kahramanmara\u015F", "Karab\u00FCk", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kilis", "K\u0131r\u0131kkale", "K\u0131rklareli", "K\u0131r\u015Fehir", "Kocaeli", "Konya", "K\u00FCtahya", "Malatya", "Manisa", "Mardin", "Mersin", "Mu\u011Fla", "Mu\u015F", "Nev\u015Fehir", "Ni\u011Fde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "\u015Eanl\u0131urfa", "Siirt", "Sinop", "Sivas", "\u015E\u0131rnak", "Tekirda\u011F", "Tokat", "Trabzon", "Tunceli", "U\u015Fak", "Van", "Yalova", "Yozgat", "Zonguldak"}));
		
		JLabel lblEposta = new JLabel("*E-Posta:");
		lblEposta.setBounds(435, 253, 69, 17);
		lblEposta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEposta.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textMail = new JTextField();
		textMail.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {

				
				if(textMail.getText().length()!=0) {
					lblNewLabelMail.setText("");
					conditionEmail=true;
					
				}
				else {
					lblNewLabelMail.setText("Bu alan doldurulmalýdýr.");
					conditionEmail=false;
				}
				
				checkSaveEnabled.checkSaveEnabled(conditionEmail, conditionName, conditionSurname, btnKaydet);
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {

				
				if(textMail.getText().length()!=0) {
					lblNewLabelMail.setText("");
					conditionEmail=true;
					
				}
				else {
					lblNewLabelMail.setText("Bu alan doldurulmalýdýr.");
					conditionEmail=false;
				}
				checkSaveEnabled.checkSaveEnabled(conditionEmail, conditionName, conditionSurname, btnKaydet);
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				
				
			}
		});
		
		textMail.setBounds(510, 251, 172, 20);
		textMail.setColumns(10);
		
		JLabel lblBölümler = new JLabel("B\u00F6l\u00FCmler:");
		lblBölümler.setBounds(739, 253, 83, 17);
		lblBölümler.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBölümler.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textDeparments = new JTextField();
		textDeparments.setBounds(829, 251, 172, 20);
		textDeparments.setColumns(10);
		
		JLabel lblPuan = new JLabel("Puan:");
		lblPuan.setBounds(140, 295, 46, 17);
		lblPuan.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPuan.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textScore = new JTextField();
		textScore.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char input = e.getKeyChar();
				
				if(input==',') {
					e.setKeyChar('.');
					input = '.';
				}
				
				if((input<'0'||input>'9') && input!='\b' && input!='.') {
					
					e.consume();
				}
			}
		});
		textScore.setBounds(193, 293, 172, 20);
		textScore.setColumns(10);
		
		JLabel lblPuanturu = new JLabel("Puan T\u00FCr\u00FC:");
		lblPuanturu.setBounds(739, 295, 83, 17);
		lblPuanturu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPuanturu.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(829, 293, 172, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Se\u00E7iniz", "SAY", "S\u00D6Z", "EA", "D\u0130L", "TYT"}));
		
		JLabel lblSiralama = new JLabel("S\u0131ralama:");
		lblSiralama.setBounds(435, 295, 69, 17);
		lblSiralama.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSiralama.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textProprioraty = new JTextField();
		textProprioraty.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==',') {
					e.setKeyChar('.');
				}
			}
		});
		textProprioraty.setBounds(510, 293, 172, 20);
		textProprioraty.setColumns(10);
		
		textHighschool = new JTextField();
		textHighschool.setBounds(193, 338, 172, 20);
		textHighschool.setColumns(10);
		
		JLabel lblLise = new JLabel("Lise:");
		lblLise.setBounds(140, 340, 46, 17);
		lblLise.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLise.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JLabel lblEgitimDurumu = new JLabel("E\u011Fitim Durumu:");
		lblEgitimDurumu.setBounds(593, 340, 109, 17);
		lblEgitimDurumu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEgitimDurumu.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		
		
		JCheckBox chckbox1 = new JCheckBox("12. S\u0131n\u0131f");
		chckbox1.setBackground(SystemColor.controlHighlight);
		chckbox1.setBounds(716, 338, 86, 20);
		
		JCheckBox chckbox2 = new JCheckBox("Mezun");
		chckbox2.setBackground(SystemColor.controlHighlight);
		chckbox2.setBounds(824, 338, 69, 20);
		
		
		chckbox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbox2.setSelected(false);
			}
		});
		
		chckbox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbox1.setSelected(false);
			}
		});
		
		JCheckBox chckbox3 = new JCheckBox("Gazete-Dergi \u0130lan\u0131");
		chckbox3.setBackground(SystemColor.controlHighlight);
		chckbox3.setBounds(156, 427, 124, 23);
		
		JCheckBox chckbox4 = new JCheckBox("Televizyon");
		chckbox4.setBackground(SystemColor.controlHighlight);
		chckbox4.setBounds(156, 462, 124, 23);
		
		JCheckBox chckbox5 = new JCheckBox("\u0130nternet");
		chckbox5.setBackground(SystemColor.controlHighlight);
		chckbox5.setBounds(156, 497, 124, 23);
		
		JCheckBox chckbox8 = new JCheckBox("Panel ve Seminerler");
		chckbox8.setBackground(SystemColor.controlHighlight);
		chckbox8.setBounds(392, 497, 139, 23);
		
		JCheckBox chckbox7 = new JCheckBox("Yak\u0131n \u00C7evre");
		chckbox7.setBackground(SystemColor.controlHighlight);
		chckbox7.setBounds(392, 462, 124, 23);
		
		JCheckBox chckbox6 = new JCheckBox("Okul");
		chckbox6.setBackground(SystemColor.controlHighlight);
		chckbox6.setBounds(392, 427, 124, 23);
		
		JCheckBox chckbox11 = new JCheckBox("\u00D6SYM K\u0131lavuzu");
		chckbox11.setBackground(SystemColor.controlHighlight);
		chckbox11.setBounds(628, 497, 124, 23);
		
		JCheckBox chckbox10 = new JCheckBox("\u00DCniversite Web Sayfas\u0131");
		chckbox10.setBackground(SystemColor.controlHighlight);
		chckbox10.setBounds(628, 462, 161, 23);
		
		JCheckBox chckbox9 = new JCheckBox("Billboard");
		chckbox9.setBackground(SystemColor.controlHighlight);
		chckbox9.setBounds(628, 427, 124, 23);
		
		JCheckBox chckbox14 = new JCheckBox("Online Etkinlikler");
		chckbox14.setBackground(SystemColor.controlHighlight);
		chckbox14.setBounds(864, 497, 124, 23);
		
		JCheckBox chckbox13 = new JCheckBox("Sosyal Medya");
		chckbox13.setBackground(SystemColor.controlHighlight);
		chckbox13.setBounds(864, 462, 124, 23);
		
		JCheckBox chckbox12 = new JCheckBox("E\u011Fitim Fuarlar\u0131");
		chckbox12.setBackground(SystemColor.controlHighlight);
		chckbox12.setBounds(864, 427, 124, 23);
		
		JCheckBox chckbox15 = new JCheckBox("Di\u011Fer (Yaz\u0131n\u0131z)");
		chckbox15.setBackground(SystemColor.controlHighlight);
		chckbox15.setBounds(156, 533, 124, 23);
		
		JCheckBox chckbxId = new JCheckBox("Id");
		chckbxId.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxId.setBounds(12, 79, 126, 23);
		
		JPanel panelAra = new JPanel();
		panelAra.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelAra.setBackground(UIManager.getColor("Button.background"));
		panelAra.setBounds(29, 42, 238, 569);
		panelogrenciler.add(panelAra);
		
		panelAra.add(chckbxId);
		
		JCheckBox chckbxName = new JCheckBox("Ad");
		chckbxName.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxName.setBounds(12, 112, 126, 23);
		
		panelAra.add(chckbxName);
		
		JCheckBox chckbxSurname = new JCheckBox("Soyad");
		chckbxSurname.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxSurname.setBounds(12, 145, 126, 23);
		
		panelAra.add(chckbxSurname);
		
		JCheckBox chckbxTelefonNumaras = new JCheckBox("Telefon Numaras\u0131");
		chckbxTelefonNumaras.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxTelefonNumaras.setBounds(12, 178, 126, 23);
		
		panelAra.add(chckbxTelefonNumaras);
		
		textField = new JTextField();
		textField.setBounds(12, 33, 144, 20);
		
		textField.setColumns(10);
		panelAra.add(textField);
		
		JCheckBox chckbxBolumler = new JCheckBox("B\u00F6l\u00FCmler");
		chckbxBolumler.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxBolumler.setBounds(12, 277, 126, 23);
		panelAra.add(chckbxBolumler);
		
		JCheckBox chckbxPuan = new JCheckBox("Puan");
		chckbxPuan.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxPuan.setBounds(12, 310, 126, 23);
		panelAra.add(chckbxPuan);
		
		JCheckBox chckbxSiralama = new JCheckBox("S\u0131ralama");
		chckbxSiralama.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxSiralama.setBounds(12, 343, 126, 23);
		panelAra.add(chckbxSiralama);
		
		JCheckBox chckbxPuanturu = new JCheckBox("Puan T\u00FCr\u00FC");
		chckbxPuanturu.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxPuanturu.setBounds(12, 376, 126, 23);
		panelAra.add(chckbxPuanturu);
		
		JCheckBox chckbxLise = new JCheckBox("Lise");
		chckbxLise.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxLise.setBounds(12, 409, 126, 23);
		panelAra.add(chckbxLise);
		
		JCheckBox chckbxNereden = new JCheckBox("Nereden Duydun?");
		chckbxNereden.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxNereden.setBounds(12, 475, 126, 23);
		panelAra.add(chckbxNereden);
		
		JCheckBox chckbxEitimDurumu = new JCheckBox("E\u011Fitim Durumu");
		chckbxEitimDurumu.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxEitimDurumu.setBounds(12, 442, 114, 23);
		panelAra.add(chckbxEitimDurumu);
		
		JCheckBox chckbxIl = new JCheckBox("\u0130l");
		chckbxIl.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxIl.setBounds(12, 211, 126, 23);
		panelAra.add(chckbxIl);


		JCheckBox chckbxMail = new JCheckBox("E-Mail");
		chckbxMail.setBounds(12, 244, 126, 23);
		
		panelAra.add(chckbxMail);
		
		
		JCheckBox chckbxKaytTarihi = new JCheckBox("Kay\u0131t Tarihi");
		chckbxKaytTarihi.setBounds(12, 508, 126, 23);
		panelAra.add(chckbxKaytTarihi);
		
		RefreshManager refreshManager = new RefreshManager(chckbxBolumler, chckbxEitimDurumu, chckbxId, chckbxIl, chckbxLise,
				chckbxMail, chckbxName, chckbxNereden, chckbxPuan, chckbxPuanturu, chckbxSiralama, chckbxSurname, chckbxTelefonNumaras, textField);
		
		JLabel lblCurrentUpdateText = new JLabel("\u015Eu An G\u00FCncellenen ID:");
		lblCurrentUpdateText.setBounds(480, 543, 124, 16);
		lblCurrentUpdateText.setVisible(false);
		panelkayit.add(lblCurrentUpdateText);
		
		JLabel lblCurrentUpdateId = new JLabel("");
		lblCurrentUpdateId.setBounds(609, 543, 43, 16);
		lblCurrentUpdateId.setVisible(false);
		panelkayit.add(lblCurrentUpdateId);
		
		
		JLabel labeltoday = new JLabel("0");
		labeltoday.setHorizontalAlignment(SwingConstants.CENTER);
		labeltoday.setBounds(1074, 476, 46, 14);
		panelogrenciler.add(labeltoday);

		
		JButton btnDelete = new JButton("Sil");
		btnDelete.setEnabled(false);
		JButton btnEdit = new JButton("D\u00FCzenle");
		btnEdit.setEnabled(false);
		JButton btnDetail = new JButton("Detaylar\u0131 G\u00F6ster\r\n");
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(new DetailScreen(), "", "Öðrenci Detayý", JOptionPane.PLAIN_MESSAGE);
				

				new DetailScreen(list,table.getSelectedRow()).setVisible(true);
				

			}
		});
		btnDetail.setEnabled(false);
		btnDetail.setBounds(291, 449, 125, 23);
		panelogrenciler.add(btnDetail);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBounds(291, 42, 843, 402);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Ad", "Soyad", "Bölümler"
			}
		));
		scrollPane.setViewportView(table);
		
		//List Selection Event Listener
		ListSelectionModel selectionModel = table.getSelectionModel();
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
				
				if(table.getSelectedRow()>=0) {
					btnDelete.setEnabled(true);
					btnEdit.setEnabled(true);
					btnDetail.setEnabled(true);
					
				}
				else {
					btnDelete.setEnabled(false);
					btnEdit.setEnabled(false);
					btnDetail.setEnabled(false);
				}
				
				
			}
		});
	
		JLabel labeltablo = new JLabel("New label");
		labeltablo.setHorizontalAlignment(SwingConstants.CENTER);
		labeltablo.setBounds(1074, 455, 46, 14);
		panelogrenciler.add(labeltablo);
		labeltablo.setText(String.valueOf(table.getRowCount()));
		
		
		chckbox15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldDiger.isEditable()) {
					textFieldDiger.setEditable(false);
					textFieldDiger.setText(null);
				}
				else
				{
					textFieldDiger.setEditable(true);
				}
			}
		});
		
		textFieldDiger = new JTextField();
		textFieldDiger.setBounds(156, 569, 172, 22);
		textFieldDiger.setEditable(false);
		textFieldDiger.setColumns(10);
		
		JLabel lblskdarniversitesiniNereden = new JLabel("... \u00DCniversitesini Nereden Duydunuz?");
		lblskdarniversitesiniNereden.setBounds(156, 385, 289, 31);
		lblskdarniversitesiniNereden.setFont(new Font("Arial", Font.BOLD, 16));
		
		
		JButton btnUpdate = new JButton("G\u00FCncelle");
		btnUpdate.setBounds(537, 578, 89, 23);
		btnUpdate.setEnabled(false);
		
		panelkayit.setLayout(null);
		panelkayit.add(btnUpdate);
		
		TableManager tableManager = new TableManager(table);
		
		ResetManager resetManager = new ResetManager(textName, textSurname, textPhone, textMail, textDeparments, textScore, textProprioraty,
				textHighschool, textFieldDiger, chckbox1, chckbox2, chckbox3, chckbox4, chckbox5, chckbox6, chckbox7, chckbox8, chckbox9,
				chckbox10, chckbox11, chckbox12, chckbox13, chckbox14, chckbox15, comboBox, comboBox_1, btnUpdate, lblCurrentUpdateText, lblCurrentUpdateId);
		
		//Save
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				Student student = new Student();
				WhereManager whereManager = new WhereManager(chckbox3, chckbox4, chckbox5, chckbox6, chckbox7, chckbox8, chckbox9, chckbox10, chckbox11, chckbox12, chckbox13, chckbox14);
				
					try {				
												
						student.setName(textName.getText());
						student.setSurname(textSurname.getText());
						student.setPhone_number(textPhone.getText());
						student.setEmail(textMail.getText());
						student.setDepartments(textDeparments.getText());
						student.setScore_type(comboBox_1.getSelectedItem().toString());
						if(textScore.getText().isEmpty() || textScore.getText().isBlank()) {
							student.setScore(0.0);
						}else {
							student.setScore(Double.parseDouble(textScore.getText()));
						}
						student.setPlacement_priority(textProprioraty.getText());
						student.setHighschool(textHighschool.getText());
						student.setEducation_situation(educationTypeManager.whichOne(chckbox1, chckbox2));
						student.setWhere(whereManager.whereYouHearFrom()+textFieldDiger.getText());
						student.setLocation(comboBox.getSelectedItem().toString());
						student.setSave(null);
						
						
						studentManager.saveStudent(student);
						btnUpdate.setEnabled(false);
						lblCurrentUpdateText.setVisible(false);
						lblCurrentUpdateId.setVisible(false);
						
						resetManager.resetAllField();
						

						list = studentManager.getAllStudent();
						tableManager.showStudent(list,labeltablo,labeltoday);
						refreshManager.RefreshTableAndCheckBox();
						
					}
					catch(java.lang.NumberFormatException error) {
						JOptionPane.showMessageDialog(null, "Puan Sekmesine Sayýsal Deðer Yazdýðýnýzdan Emin Olunuz!");
						System.out.println(error.getMessage());
						
					}
				
			}
		});
		
		
		
		
		
		
		//Reset
		JButton btnSfrla = new JButton("S\u0131f\u0131rla");
		btnSfrla.setBounds(402, 578, 89, 23);
		btnSfrla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "Sýfýrlamak Ýstediðinize Emin Misiniz?", "Sýfýrla?",  JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					resetManager.resetAllField();
				   
				}
			}
		});
		
		//Update
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					StudentService studentManager = new StudentManager();
					Student student=new Student();
					WhereManager whereManager = new WhereManager(chckbox3, chckbox4, chckbox5, chckbox6, chckbox7, chckbox8, chckbox9, chckbox10, chckbox11, chckbox12, chckbox13, chckbox14);
					TableManager tableManager = new TableManager(table);
					
					student.setName(textName.getText());
					student.setSurname(textSurname.getText());
					student.setPhone_number(textPhone.getText());
					student.setEmail(textMail.getText());
					student.setDepartments(textDeparments.getText());
					student.setScore_type(comboBox_1.getSelectedItem().toString());
					if(textScore.getText().isEmpty() || textScore.getText().isBlank()) {
						student.setScore(0.0);
					}else {
						student.setScore(Double.parseDouble(textScore.getText()));
					}
					student.setPlacement_priority(textProprioraty.getText());
					student.setHighschool(textHighschool.getText());
					student.setEducation_situation(educationTypeManager.whichOne(chckbox1, chckbox2));
					student.setWhere(whereManager.whereYouHearFrom()+textFieldDiger.getText());
					student.setLocation(comboBox.getSelectedItem().toString());
					student.setSave(null);

					studentManager.updateStudent(student, updateValueId);
					list = studentManager.getAllStudent();
					tableManager.showStudent(list,labeltablo,labeltoday);
					
					
					resetManager.resetAllField();
					refreshManager.RefreshTableAndCheckBox();
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
					JOptionPane.showMessageDialog(null,"Seçili Öðrenci Yok.");
					

					resetManager.resetAllField();
				}
				
	
			}
		});
		
		
		
		
		panelkayit.add(lblNewLabel);
		panelkayit.add(lblAdayrenciKayt);
		panelkayit.add(lblAd);
		panelkayit.add(textName);
		panelkayit.add(lblSoyad);
		panelkayit.add(textSurname);
		panelkayit.add(lblTelefonNo);
		panelkayit.add(textPhone);
		panelkayit.add(lblil);
		panelkayit.add(comboBox);
		panelkayit.add(lblEposta);
		panelkayit.add(textMail);
		panelkayit.add(lblBölümler);
		panelkayit.add(textDeparments);
		panelkayit.add(lblPuan);
		panelkayit.add(textScore);
		panelkayit.add(lblSiralama);
		panelkayit.add(textProprioraty);
		panelkayit.add(lblPuanturu);
		panelkayit.add(comboBox_1);
		panelkayit.add(lblLise);
		panelkayit.add(textHighschool);
		panelkayit.add(lblEgitimDurumu);
		panelkayit.add(chckbox1);
		panelkayit.add(chckbox2);
		panelkayit.add(lblskdarniversitesiniNereden);
		panelkayit.add(chckbox3);
		panelkayit.add(chckbox6);
		panelkayit.add(chckbox9);
		panelkayit.add(chckbox12);
		panelkayit.add(chckbox4);
		panelkayit.add(chckbox7);
		panelkayit.add(chckbox10);
		panelkayit.add(chckbox13);
		panelkayit.add(chckbox5);
		panelkayit.add(chckbox8);
		panelkayit.add(chckbox11);
		panelkayit.add(chckbox14);
		panelkayit.add(chckbox15);
		panelkayit.add(textFieldDiger);
		panelkayit.add(btnSfrla);
		panelkayit.add(btnKaydet);
		
	

		
		
		
		
		
		
		//Delete
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {

					int[] row = table.getSelectedRows();
					int rowcount = row.length;
					
					if(rowcount==0) {
						rowcount=-1;
					}

					int [] value = new int [rowcount+1];
			
					
					for(int i = 0; i < row.length; i++) {
						
	
						value[i]=list.get(row[i]).getId();
						
						System.out.println(table.getModel().getValueAt(row[i], 0));
					}
					
					
					
					
					int reply = JOptionPane.showConfirmDialog(null, "Silmek Ýstediðinize Emin Misiniz?", "Sil?",  JOptionPane.YES_NO_OPTION);
					if (reply == JOptionPane.YES_OPTION)		
					{	
					studentManager.deleteStudent(value,table);
					
					
					list = studentManager.getAllStudent();
					tableManager.showStudent(list,labeltablo,labeltoday);
					refreshManager.RefreshTableAndCheckBox();
					if(row.length==1) {
						JOptionPane.showMessageDialog(null, "Seçili Öðrenci Silindi!");
					}
					else if(row.length>1) {
						JOptionPane.showMessageDialog(null, "Seçili Öðrenciler Silindi!");
					}
					
					
					}
					
				}
				
				catch(java.lang.ArrayIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "Seçili Öðrenci Yok.");
				}
				
				
				

			}
		});
		
		btnDelete.setBounds(931, 558, 89, 23);
		panelogrenciler.add(btnDelete);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 1164, 649);
		panel_2.setLayout(null);
		
		
		
		JButton btnKayitFormu = new JButton("Kay\u0131t Formu");
		JButton btnOgrenciler = new JButton("\u00D6\u011Frenciler");
		
		btnKayitFormu.setFocusPainted(false);
		btnKayitFormu.setBorderPainted(false);
		btnKayitFormu.setBackground(SystemColor.controlHighlight);
		btnKayitFormu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel.switchPaneltoRegistered(panelkayit, layeredPane, btnKayitFormu, btnOgrenciler);
			}
		});
		btnKayitFormu.setBorder(null);
		btnKayitFormu.setBounds(0, 0, 89, 23);
		panel_2.add(btnKayitFormu);
		
		
		btnOgrenciler.setFocusPainted(false);
		btnOgrenciler.setBackground(Color.WHITE);
		btnOgrenciler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel.switchPaneltoStudent(panelogrenciler, layeredPane, btnKayitFormu, btnOgrenciler);
			}
		});
		
		
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				
				
				try {
					
					
					//Reset All Data which in Registered Screen
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
					
					
					
					
					int row = table.getSelectedRow();
					
					updateValueId=list.get(row).getId();
					
					lblCurrentUpdateId.setText(String.valueOf(updateValueId));
					textPhone.setText(list.get(row).getPhone_number());
					textName.setText(list.get(row).getName());
					textSurname.setText(list.get(row).getSurname());
					textMail.setText(list.get(row).getEmail());
					textDeparments.setText(list.get(row).getDepartments());
					textScore.setText(String.valueOf(list.get(row).getScore()));
					textProprioraty.setText(list.get(row).getPlacement_priority());
					textHighschool.setText(list.get(row).getHighschool());
					
					
					switch(list.get(row).getEducation_situation()){
						case "12. Sýnýf":
							chckbox1.setSelected(true);
							chckbox2.setSelected(false);
							break;
						case "Mezun":
							chckbox2.setSelected(true);
							chckbox1.setSelected(false);
							break;
							
					}
					
					String[] neredenArr = String.valueOf(list.get(row).getWhere()).split(", ");
					
					for(int i = 0 ; i < neredenArr.length ; i++) {
						
						switch(neredenArr[i]) {
						case"Gazete-Dergi Ýlaný":
							chckbox3.setSelected(true);
							break;
						case"Televizyon":
							chckbox4.setSelected(true);
							break;
						case"Ýnternet":
							chckbox5.setSelected(true);
							break;
						case"Okul":
							chckbox6.setSelected(true);
							break;
						case"Yakýn Çevre":
							chckbox7.setSelected(true);
							break;
						case"Panel ve Seminerler":
							chckbox8.setSelected(true);
							break;
						case"Billboard":
							chckbox9.setSelected(true);
							break;
						case"ÜÜ Web Sayfasý":
							chckbox10.setSelected(true);
							break;
						case"ÖSYM Kýlavuzu":
							chckbox11.setSelected(true);
							break;
						case"Eðitim Fuarlarý":
							chckbox12.setSelected(true);
							break;
						case"Sosyal Medya":
							chckbox13.setSelected(true);
							break;
						case"Online Etkinlikler":
							chckbox14.setSelected(true);
							break;
							default:
								chckbox15.setSelected(true);
								textFieldDiger.setEditable(true);
								textFieldDiger.setText(neredenArr[neredenArr.length-1]);
							
						
						}
						
						
						
					}
					
					
					for(int j = 0; j < comboBox.getModel().getSize(); j++) {
						
						if(list.get(row).getLocation().equals(comboBox.getModel().getElementAt(j))) {
							comboBox.setSelectedIndex(j);
							break;
						}
						
					}
					
					for(int j = 0; j < comboBox_1.getModel().getSize(); j++) {
						
						if(list.get(row).getScore_type().equals(comboBox_1.getModel().getElementAt(j))) {
							comboBox_1.setSelectedIndex(j);
							break;
						}
						
					}
					
					switchPanel.switchPaneltoRegistered(panelkayit, layeredPane, btnKayitFormu, btnOgrenciler);
					btnUpdate.setEnabled(true);
					lblCurrentUpdateText.setVisible(true);
					lblCurrentUpdateId.setVisible(true);
					
					
				}
				catch(java.lang.IndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "Seçili Öðrenci Yok.");
				}
				
				
				
				
				
			}
		});
		btnEdit.setBounds(1045, 558, 89, 23);
		panelogrenciler.add(btnEdit);
		
		
		
		
		
		
		
		
		JLabel lbltablotext = new JLabel("Tabloda G\u00F6sterilen \u00D6\u011Frenci Say\u0131s\u0131:");
		lbltablotext.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltablotext.setBounds(854, 455, 211, 14);
		panelogrenciler.add(lbltablotext);
		
		
		
		
		JButton btnNewButton = new JButton("Ara");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				FindManager findManager = new FindManager(chckbxId,chckbxName,chckbxSurname,chckbxTelefonNumaras,
						chckbxPuan,chckbxSiralama,chckbxPuanturu,chckbxNereden,chckbxEitimDurumu,
						chckbxIl,chckbxBolumler,chckbxLise,chckbxMail,chckbxKaytTarihi);
				TableManager tableManager = new TableManager(table);
				list = studentManager.getFindStudent(textField.getText(),findManager.findAt());
				
				tableManager.showStudent(list,labeltablo,labeltoday);
				
			}
		});
		panelAra.setLayout(null);
		
		btnNewButton.setBounds(168, 33, 55, 20);
		
		panelAra.add(btnNewButton);
		
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
		
			@Override
			public void removeUpdate(DocumentEvent e) {
				
				if(textField.getText().length()>0) {
					checkSearchField = true;
				}
				else {
					checkSearchField = false;
				}
				
				if(selectedSearchCheckBox && checkSearchField) {
					 btnNewButton.setEnabled(true);
				 }
				 else {
					 btnNewButton.setEnabled(false);
				 }
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				if(textField.getText().length()>0) {
					checkSearchField = true;
				}
				else {
					checkSearchField = false;
				}
				
				if(selectedSearchCheckBox && checkSearchField) {
					 btnNewButton.setEnabled(true);
				 }
				 else {
					 btnNewButton.setEnabled(false);
				 }
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				
				
			}
		});
		
		//Create Search Button Action Listener
			ActionListener actionListenerPanelAra = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				 selectedSearchCheckBox = chckbxId.isSelected() || chckbxName.isSelected()|| chckbxSurname.isSelected() || chckbxBolumler.isSelected() || chckbxEitimDurumu.isSelected() || chckbxIl.isSelected()
						 || chckbxKaytTarihi.isSelected() || chckbxLise.isSelected() || chckbxMail.isSelected() || chckbxNereden.isSelected()||
						 chckbxPuan.isSelected() || chckbxPuanturu.isSelected() || chckbxSiralama.isSelected()|| chckbxTelefonNumaras.isSelected();
				 
				 if(selectedSearchCheckBox && checkSearchField) {
					 btnNewButton.setEnabled(true);
				 }
				 else {
					 btnNewButton.setEnabled(false);
				 }
			     
				
			}
		};
		
		//Apply the Action Listener for Search Button
		chckbxId.addActionListener(actionListenerPanelAra);
		chckbxName.addActionListener(actionListenerPanelAra);
		chckbxSurname.addActionListener(actionListenerPanelAra);
		chckbxTelefonNumaras.addActionListener(actionListenerPanelAra);
		chckbxBolumler.addActionListener(actionListenerPanelAra);
		chckbxPuan.addActionListener(actionListenerPanelAra);
		chckbxSiralama.addActionListener(actionListenerPanelAra);
		chckbxPuanturu.addActionListener(actionListenerPanelAra);
		chckbxMail.addActionListener(actionListenerPanelAra);
		chckbxNereden.addActionListener(actionListenerPanelAra);
		chckbxLise.addActionListener(actionListenerPanelAra);
		chckbxEitimDurumu.addActionListener(actionListenerPanelAra);
		chckbxIl.addActionListener(actionListenerPanelAra);
		chckbxKaytTarihi.addActionListener(actionListenerPanelAra);
		
		
		
		
		
	
		
		
		
		btnOgrenciler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOgrenciler.setBorderPainted(false);
		btnOgrenciler.setBorder(null);
		btnOgrenciler.setBounds(88, 0, 89, 23);
		panel_2.add(btnOgrenciler);
		contentPane.setLayout(null);
		
		contentPane.add(panel_2);
		
		
		
		
		JButton btnRefresh = new JButton("Yenile");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list = studentManager.getAllStudent();
				tableManager.showStudent(list,labeltablo,labeltoday);

				tableManager.setWidth();
				textField.setText(null);
				
				refreshManager.RefreshTableAndCheckBox();
			}
		});
		btnRefresh.setBounds(815, 558, 89, 23);
		
		panelogrenciler.setLayout(null);
		panelogrenciler.add(scrollPane);
		panelogrenciler.add(btnRefresh);
		
		
		JLabel helpIcon = new JLabel("");
		helpIcon.setBounds(new Rectangle(100, 0, 0, 0));
		helpIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Arama yapmak istediðinizde: hangi sütunlarda arama yapmak istiyorsanýz\n ilgili kutucuklarý iþaretleyip, anahtar kelimenizi aratabilirsiniz. ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		helpIcon.setBounds(269, 588, 20, 23);
		panelogrenciler.add(helpIcon);
		helpIcon.setIcon(new ImageIcon(JFrame.class.getResource("/images/help3.png")));
		
		JButton btnExport = new JButton("D\u0131\u015Fa Aktar\r\n");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				try {
					ExportManager fileManager = new ExportManager();
					fileManager.writeTableOnExcelFile(table,list);
				}
				catch(java.lang.NullPointerException e3) {
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnExport.setBounds(1029, 12, 105, 23);
		panelogrenciler.add(btnExport);
		
		JLabel lblTodayText = new JLabel("Bug\u00FCn Kay\u0131t Olan \u00D6\u011Frenci Say\u0131s\u0131:");
		lblTodayText.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTodayText.setBounds(854, 477, 211, 14);
		panelogrenciler.add(lblTodayText);
		
		JButton btnImport = new JButton("\u0130\u00E7e Aktar");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
					
					ImportManager importManager = new ImportManager();
					ArrayList <Student>alllist = studentManager.getAllStudent();
					importManager.importDataBase(alllist);
					list = studentManager.getAllStudent();
					tableManager.showStudent(list,labeltablo,labeltoday);
					JOptionPane.showMessageDialog(null, "Baþarýyla Ýçe Aktarýldý!");
					refreshManager.RefreshTableAndCheckBox();
					
					
				}catch(java.lang.ArrayStoreException e1) {
					JOptionPane.showMessageDialog(null, "Farklý ID Deðerine Sahip Öðrenci Bulunamadý.");
				}
				catch(java.lang.IllegalStateException e2) {
					JOptionPane.showMessageDialog(null, "Deðerler Veritabaný Formatýna Uymuyor. Seçtiðiniz Dosyanýn Uygunluðunu Kontrol Edin.");
				}
				catch(java.lang.NullPointerException e3) {
					
				}
				catch(Exception e4) {
					e4.printStackTrace();
				}
				
			}
		});
		btnImport.setBounds(898, 12, 105, 23);
		panelogrenciler.add(btnImport);
		
		
		//Get All Data and Set Width (For Beginning)
		tableManager.showStudent(studentManager.getAllStudent(), labeltablo,labeltoday);
		tableManager.setWidth();
		
		
		
		
	}
}

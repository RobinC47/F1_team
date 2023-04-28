package controlleur;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;

import F1_team.*;
import vue.*;

public class f1fenetre extends JFrame {
	Formula1Team ferrari;
	Driver driver1;
	Mechanic mechanic1;
	Mechanic mechanic2;
	Tires tires1;
	Engine engine1;
	Body body1;
	TeamMember teammember1;
	TeamMember teammember2;
	
	
	
	private JTextField textFieldMecanics;
	private JTextField textFieldNameDriver;
	private JTextField textFieldNameMember;
	private JTextField textFieldTeam;
	private JTextField textFieldSpeciality;
	private JTextField textFieldType;
	private JTextField textFieldManufacturer;
	private JTextField textFieldRoleMember;
	private JTextField textFieldMaterial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1fenetre frame = new f1fenetre();
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
	public f1fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		setBounds(100, 100, 700, 475);
		
		JPanel panelTeam = new JPanel();
		tabbedPane.addTab("Team", null, panelTeam, null);
		panelTeam.setLayout(null);
		
		textFieldMecanics = new JTextField();
		textFieldMecanics.setBounds(175, 352, 130, 26);
		panelTeam.add(textFieldMecanics);
		textFieldMecanics.setColumns(10);
		
		textFieldNameDriver = new JTextField();
		textFieldNameDriver.setBounds(225, 273, 130, 26);
		panelTeam.add(textFieldNameDriver);
		textFieldNameDriver.setColumns(10);
		
		textFieldTeam = new JTextField();
		textFieldTeam.setBounds(130, 36, 130, 26);
		panelTeam.add(textFieldTeam);
		textFieldTeam.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("F1 Team");
		lblNewLabel.setBounds(21, 11, 106, 16);
		panelTeam.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Driver");
		lblNewLabel_1.setBounds(21, 233, 83, 16);
		panelTeam.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mechanics");
		lblNewLabel_2.setBounds(21, 325, 73, 16);
		panelTeam.add(lblNewLabel_2);
		
		textFieldSpeciality = new JTextField();
		textFieldSpeciality.setBounds(543, 352, 130, 26);
		panelTeam.add(textFieldSpeciality);
		textFieldSpeciality.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setBounds(441, 278, 61, 16);
		panelTeam.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setBounds(116, 357, 61, 16);
		panelTeam.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Speciality");
		lblNewLabel_5_1.setBounds(479, 357, 61, 16);
		panelTeam.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_3 = new JLabel("Team member");
		lblNewLabel_3.setBounds(21, 92, 106, 16);
		panelTeam.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("Name");
		lblNewLabel_5_2.setBounds(152, 278, 61, 16);
		panelTeam.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_8 = new JLabel("Name");
		lblNewLabel_8.setBounds(44, 41, 61, 16);
		panelTeam.add(lblNewLabel_8);
		
		JSpinner spinnerAgeDriver = new JSpinner();
		spinnerAgeDriver.setBounds(523, 273, 99, 26);
		panelTeam.add(spinnerAgeDriver);
		
		JLabel lblNewLabel_9 = new JLabel("Name");
		lblNewLabel_9.setBounds(43, 132, 61, 16);
		panelTeam.add(lblNewLabel_9);
		
		textFieldNameMember = new JTextField();
		textFieldNameMember.setBounds(130, 127, 130, 26);
		panelTeam.add(textFieldNameMember);
		textFieldNameMember.setColumns(10);
		
		textFieldRoleMember = new JTextField();
		textFieldRoleMember.setBounds(514, 127, 130, 26);
		panelTeam.add(textFieldRoleMember);
		textFieldRoleMember.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Role");
		lblNewLabel_10.setBounds(441, 132, 61, 16);
		panelTeam.add(lblNewLabel_10);
		
		JSpinner spinnerAgeMember = new JSpinner();
		spinnerAgeMember.setBounds(339, 127, 73, 26);
		panelTeam.add(spinnerAgeMember);
		
		JLabel lblNewLabel_4_1 = new JLabel("Age");
		lblNewLabel_4_1.setBounds(291, 132, 36, 16);
		panelTeam.add(lblNewLabel_4_1);
		
		JPanel panelCar = new JPanel();
		tabbedPane.addTab("Car", null, panelCar, null);
		panelCar.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Body");
		lblNewLabel_6.setBounds(6, 25, 61, 16);
		panelCar.add(lblNewLabel_6);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setBounds(87, 25, 74, 16);
		panelCar.add(textFieldMaterial);
		textFieldMaterial.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Material");
		lblNewLabel_7.setBounds(100, 6, 61, 16);
		panelCar.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Weight");
		lblNewLabel_7_1.setBounds(252, 6, 61, 16);
		panelCar.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Engine");
		lblNewLabel_6_1.setBounds(6, 106, 61, 16);
		panelCar.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Tires");
		lblNewLabel_6_2.setBounds(6, 183, 61, 16);
		panelCar.add(lblNewLabel_6_2);
		
		textFieldType = new JTextField();
		textFieldType.setColumns(10);
		textFieldType.setBounds(87, 106, 74, 16);
		panelCar.add(textFieldType);
		
		textFieldManufacturer = new JTextField();
		textFieldManufacturer.setColumns(10);
		textFieldManufacturer.setBounds(87, 183, 74, 16);
		panelCar.add(textFieldManufacturer);
		
		JLabel lblNewLabel_7_2 = new JLabel("Type");
		lblNewLabel_7_2.setBounds(105, 80, 61, 16);
		panelCar.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Horsepower");
		lblNewLabel_7_3.setBounds(239, 80, 90, 16);
		panelCar.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("Size");
		lblNewLabel_7_4.setBounds(262, 160, 61, 16);
		panelCar.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("Manufacturer");
		lblNewLabel_7_5.setBounds(87, 160, 97, 16);
		panelCar.add(lblNewLabel_7_5);
		
		JSpinner spinnerWeight = new JSpinner();
		spinnerWeight.setBounds(239, 20, 74, 26);
		panelCar.add(spinnerWeight);
		
		JSpinner spinnerHorsepower = new JSpinner();
		spinnerHorsepower.setBounds(239, 101, 74, 26);
		panelCar.add(spinnerHorsepower);
		
		JSpinner spinnerSize = new JSpinner();
		spinnerSize.setBounds(239, 178, 74, 26);
		panelCar.add(spinnerSize);
		
		JSpinner spinnerAgeMecha = new JSpinner();
		spinnerAgeMecha.setBounds(356, 352, 99, 26);
		panelTeam.add(spinnerAgeMecha);
		
		JPanel panelIndex = new JPanel();
		tabbedPane.addTab("Index", null, panelIndex, null);
		panelIndex.setLayout(null);
		
		JTextPane textPaneIndex = new JTextPane();
		textPaneIndex.setBounds(86, 78, 514, 272);
		panelIndex.add(textPaneIndex);
		
		JButton btnAfficher = new JButton("Print");
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPaneIndex.setText("Team: " + ferrari.getName() + "\r" 
									+ "Driver: " + driver1.getName() + " Age: " + driver1.getAge() + "\r"
									+ "TeamMember1: " + teammember1.getName() + " Age: " + teammember1.getAge() + " Role: " + teammember1.getRole() + "\r"
									+ "Mechanic1: " + mechanic1.getName() + " Speciality: " + mechanic1.getSpecialty() + "\r"
									+ "Engine1: " + engine1.getHorsepower() + " Type: " + engine1.getType() + "\r"
									+ "Tires1: " + tires1.getManufacturer() + " Size: " + tires1.getSize() + "\r"
									+ "Body1: " + body1.getMaterial() + "Weight: " + body1.getWeight() + "\r");
			}
		});
		btnAfficher.setBounds(545, 6, 117, 29);
		panelIndex.add(btnAfficher);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver1.write(driver1);
			}
		});
		btnSave.setBounds(31, 6, 117, 29);
		panelIndex.add(btnSave);
		
		JButton btnEngine = new JButton("Save");
		btnEngine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine1 = new Engine((int) spinnerHorsepower.getValue(), textFieldType.getText());
				System.out.println("Type de moteur "+ textFieldType.getText()+ " Puissance "+  spinnerHorsepower.getValue());
				textFieldType.setText("");
				spinnerHorsepower.setValue(0);
			}
		});
		btnEngine.setBounds(381, 101, 117, 29);
		panelCar.add(btnEngine);
		
		JButton btnTires = new JButton("Save");
		btnTires.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tires1 = new Tires(textFieldManufacturer.getText(), (int) spinnerSize.getValue());
				System.out.println("Manufacturer "+ textFieldManufacturer.getText()+ " Taille "+  spinnerSize.getValue());
				textFieldManufacturer.setText("");
				spinnerSize.setValue(0);
			}
		});
		btnTires.setBounds(381, 178, 117, 29);
		panelCar.add(btnTires);
		
		JButton btnSaveBody = new JButton("Save");
		btnSaveBody.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				body1 = new Body(textFieldMaterial.getText(), (int) spinnerWeight.getValue());
				System.out.println("Matériau "+ textFieldMaterial.getText()+ " Masse "+  spinnerWeight.getValue());
				textFieldMaterial.setText("");
				spinnerWeight.setValue(0);
				
			}
		});
		btnSaveBody.setBounds(381, 20, 117, 29);
		panelCar.add(btnSaveBody);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setColumns(10);
		textFieldMaterial.setBounds(87, 25, 74, 16);
		panelCar.add(textFieldMaterial);
		
		JButton btnSaveMember = new JButton("Save");
		btnSaveMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teammember1 = new TeamMember(textFieldNameMember.getText(), (int) spinnerAgeMember.getValue(), textFieldRoleMember.getText());
				System.out.println("Member "+ textFieldNameMember.getText()+ " Age "+  spinnerAgeMember.getValue() + " Role " + textFieldRoleMember.getText());
				textFieldNameMember.setText("");
				spinnerAgeMember.setValue(0);
				textFieldRoleMember.setText("");
			}
		});
		btnSaveMember.setBounds(130, 87, 83, 29);
		panelTeam.add(btnSaveMember);
		
		JButton btnSaveTeam = new JButton("Save");
		btnSaveTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ferrari = new Formula1Team(textFieldTeam.getText());
				System.out.println("Team "+ textFieldTeam.getText());
				textFieldTeam.setText("");
			}
		});
		btnSaveTeam.setBounds(523, 36, 83, 29);
		panelTeam.add(btnSaveTeam);
		
		JButton btnSaveDriver = new JButton("Save");
		btnSaveDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver1 = new Driver(textFieldNameDriver.getText(), (int) spinnerAgeDriver.getValue(), ferrari);
				System.out.println("Name "+ textFieldNameDriver.getText() + " Age " + spinnerAgeDriver.getValue());
				spinnerAgeDriver.setValue(0);
				textFieldNameDriver.setText("");
			}
		});
		btnSaveDriver.setBounds(21, 273, 83, 29);
		panelTeam.add(btnSaveDriver);
		
		JButton btnSaveMecanics = new JButton("Save");
		btnSaveMecanics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mechanic1 = new Mechanic(textFieldMecanics.getText(), (int) spinnerAgeMecha.getValue(), textFieldSpeciality.getText());
				System.out.println("Name "+ textFieldMecanics.getText() + " Speciality " + textFieldSpeciality.getText());
				textFieldMecanics.setText("");
				textFieldSpeciality.setText("");
			}
		});
		btnSaveMecanics.setBounds(21, 352, 83, 29);
		panelTeam.add(btnSaveMecanics);
		
		JLabel lblNewLabel_4_2 = new JLabel("Age");
		lblNewLabel_4_2.setBounds(330, 357, 42, 16);
		panelTeam.add(lblNewLabel_4_2);
		
	}
}

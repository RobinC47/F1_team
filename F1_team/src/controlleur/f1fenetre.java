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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;

public class f1fenetre extends JFrame {
	private JTextField textField;
	private JTextField textFieldNameDriver;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textFieldNameMember;
	private JTextField textFieldRoleMember;

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
		
		textField = new JTextField();
		textField.setBounds(225, 352, 130, 26);
		panelTeam.add(textField);
		textField.setColumns(10);
		
		textFieldNameDriver = new JTextField();
		textFieldNameDriver.setBounds(225, 273, 130, 26);
		panelTeam.add(textFieldNameDriver);
		textFieldNameDriver.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 36, 130, 26);
		panelTeam.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("F1 Team");
		lblNewLabel.setBounds(21, 11, 106, 16);
		panelTeam.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Driver");
		lblNewLabel_1.setBounds(21, 233, 83, 16);
		panelTeam.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mechanics");
		lblNewLabel_2.setBounds(21, 325, 73, 16);
		panelTeam.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(514, 352, 130, 26);
		panelTeam.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setBounds(441, 278, 61, 16);
		panelTeam.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setBounds(152, 357, 61, 16);
		panelTeam.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Speciality");
		lblNewLabel_5_1.setBounds(418, 357, 61, 16);
		panelTeam.add(lblNewLabel_5_1);
		
		JButton btnSaveMecanics = new JButton("Save");
		btnSaveMecanics.setBounds(21, 352, 83, 29);
		panelTeam.add(btnSaveMecanics);
		
		JLabel lblNewLabel_3 = new JLabel("Team member");
		lblNewLabel_3.setBounds(21, 92, 106, 16);
		panelTeam.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("Name");
		lblNewLabel_5_2.setBounds(152, 278, 61, 16);
		panelTeam.add(lblNewLabel_5_2);
		
		JButton btnSaveDriver = new JButton("Save");
		btnSaveDriver.setBounds(21, 273, 83, 29);
		panelTeam.add(btnSaveDriver);
		
		JLabel lblNewLabel_8 = new JLabel("Name");
		lblNewLabel_8.setBounds(44, 41, 61, 16);
		panelTeam.add(lblNewLabel_8);
		
		JButton btnSaveDriver_1 = new JButton("Save");
		btnSaveDriver_1.setBounds(523, 36, 83, 29);
		panelTeam.add(btnSaveDriver_1);
		
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
		
		JSpinner spinnerAgeDriver_1 = new JSpinner();
		spinnerAgeDriver_1.setBounds(339, 127, 73, 26);
		panelTeam.add(spinnerAgeDriver_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Age");
		lblNewLabel_4_1.setBounds(291, 132, 36, 16);
		panelTeam.add(lblNewLabel_4_1);
		
		JButton btnNewButtonSaveMember = new JButton("Save");
		btnNewButtonSaveMember.setBounds(130, 87, 83, 29);
		panelTeam.add(btnNewButtonSaveMember);
		
		JPanel panelCar = new JPanel();
		tabbedPane.addTab("Car", null, panelCar, null);
		panelCar.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Body");
		lblNewLabel_6.setBounds(6, 25, 61, 16);
		panelCar.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(87, 25, 74, 16);
		panelCar.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(239, 25, 74, 16);
		panelCar.add(textField_8);
		
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
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(87, 106, 74, 16);
		panelCar.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(239, 106, 74, 16);
		panelCar.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(87, 183, 74, 16);
		panelCar.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(239, 183, 74, 16);
		panelCar.add(textField_12);
		
		JLabel lblNewLabel_7_2 = new JLabel("Type");
		lblNewLabel_7_2.setBounds(105, 80, 61, 16);
		panelCar.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Horsepower");
		lblNewLabel_7_3.setBounds(239, 80, 90, 16);
		panelCar.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("size");
		lblNewLabel_7_4.setBounds(262, 160, 61, 16);
		panelCar.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("Manufacturer");
		lblNewLabel_7_5.setBounds(87, 160, 97, 16);
		panelCar.add(lblNewLabel_7_5);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(381, 20, 117, 29);
		panelCar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(381, 101, 117, 29);
		panelCar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(381, 178, 117, 29);
		panelCar.add(btnNewButton_2);
		
		JPanel panelIndex = new JPanel();
		tabbedPane.addTab("Index", null, panelIndex, null);
		panelIndex.setLayout(null);
		
		JButton btnNewButtonAfficher = new JButton("Afficher");
		btnNewButtonAfficher.setBounds(545, 6, 117, 29);
		panelIndex.add(btnNewButtonAfficher);
		
		JComboBox comboBoxChxTeam = new JComboBox();
		comboBoxChxTeam.setBounds(29, 7, 125, 27);
		panelIndex.add(comboBoxChxTeam);
		
		JTextPane textPaneIndex = new JTextPane();
		textPaneIndex.setBounds(86, 78, 514, 272);
		panelIndex.add(textPaneIndex);
	}
}

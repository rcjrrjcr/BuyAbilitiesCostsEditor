package com.rcjrrjcr.bukkitools.costseditor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class CostsEditorGUI {

	private JFrame frmBuyabilitiesCostsEditor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CostsEditorGUI window = new CostsEditorGUI();
					window.frmBuyabilitiesCostsEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CostsEditorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuyabilitiesCostsEditor = new JFrame();
		frmBuyabilitiesCostsEditor.setTitle("BuyAbilities Costs Editor");
		frmBuyabilitiesCostsEditor.setBounds(100, 100, 1024, 768);
		frmBuyabilitiesCostsEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmBuyabilitiesCostsEditor.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mntmSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnFile.add(mntmQuit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnHelp.add(mntmHelp);
		
		JMenuItem mntmInformation = new JMenuItem("Information");
		mnHelp.add(mntmInformation);
		
		JTabbedPane tabViews = new JTabbedPane(JTabbedPane.TOP);
		tabViews.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		JToolBar toolBar = new JToolBar();
		
		JPanel listView = new JPanel();
		tabViews.addTab("List View", null, listView, null);
		
		JTree tree = new JTree();
		
		JTabbedPane tabAbilityData = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_listView = new GroupLayout(listView);
		gl_listView.setHorizontalGroup(
			gl_listView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listView.createSequentialGroup()
					.addGap(12)
					.addComponent(tree, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tabAbilityData, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_listView.setVerticalGroup(
			gl_listView.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_listView.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_listView.createParallelGroup(Alignment.TRAILING)
						.addComponent(tabAbilityData, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
						.addComponent(tree, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
					.addGap(14))
		);
		
		JPanel abilityInfo = new JPanel();
		tabAbilityData.addTab("Ability Information", null, abilityInfo, null);
		
		JLabel lblAbilityName = new JLabel("Ability Name:");
		lblAbilityName.setFont(new Font("Dialog", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblLongName = new JLabel("Long Name:");
		lblLongName.setFont(new Font("Dialog", Font.BOLD, 15));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Dialog", Font.BOLD, 15));
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblmaxCharacters = new JLabel("(max 100 characters)");
		
		JTextArea textArea_1 = new JTextArea();
		
		JLabel lblmaxCharacters_1 = new JLabel("(max 100 characters)");
		
		JLabel lblHelpText = new JLabel("Help Text:");
		lblHelpText.setFont(new Font("Dialog", Font.BOLD, 15));
		GroupLayout gl_abilityInfo = new GroupLayout(abilityInfo);
		gl_abilityInfo.setHorizontalGroup(
			gl_abilityInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abilityInfo.createSequentialGroup()
					.addGroup(gl_abilityInfo.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_abilityInfo.createSequentialGroup()
							.addContainerGap(12, Short.MAX_VALUE)
							.addGroup(gl_abilityInfo.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblmaxCharacters_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHelpText, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_abilityInfo.createSequentialGroup()
							.addGroup(gl_abilityInfo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_abilityInfo.createSequentialGroup()
									.addGap(45)
									.addGroup(gl_abilityInfo.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblLongName)
										.addComponent(lblAbilityName)
										.addComponent(lblDescription)))
								.addGroup(gl_abilityInfo.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblmaxCharacters)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_abilityInfo.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
								.addComponent(textArea))))
					.addContainerGap(384, Short.MAX_VALUE))
		);
		gl_abilityInfo.setVerticalGroup(
			gl_abilityInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abilityInfo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_abilityInfo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAbilityName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_abilityInfo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLongName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_abilityInfo.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_abilityInfo.createSequentialGroup()
							.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblmaxCharacters)))
					.addGroup(gl_abilityInfo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_abilityInfo.createSequentialGroup()
							.addGap(18)
							.addComponent(lblHelpText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblmaxCharacters_1))
						.addGroup(gl_abilityInfo.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(268, Short.MAX_VALUE))
		);
		abilityInfo.setLayout(gl_abilityInfo);
		
		JPanel abilityPermsCats = new JPanel();
		tabAbilityData.addTab("Permissions and Categories", null, abilityPermsCats, null);
		
		JLabel lblPermissionNodes = new JLabel("Permission Nodes:");
		
		JList list = new JList();
		
		JLabel lblAddNode = new JLabel("Add Node:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnAddNode = new JButton("Add Node");
		
		JButton btnRemoveNode = new JButton("Remove Nodes");
		
		JButton btnAddCategories = new JButton("Add Category");
		
		JButton btnRemoveCategories = new JButton("Remove Categories");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblAddCategory = new JLabel("Add Category:");
		
		JLabel lblCategories = new JLabel("Categories:");
		
		JList list_1 = new JList();
		GroupLayout gl_abilityPermsCats = new GroupLayout(abilityPermsCats);
		gl_abilityPermsCats.setHorizontalGroup(
			gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abilityPermsCats.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPermissionNodes)
						.addGroup(gl_abilityPermsCats.createSequentialGroup()
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
								.addComponent(btnRemoveNode)
								.addComponent(btnAddNode)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddNode))))
					.addGap(18)
					.addGroup(gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCategories, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_abilityPermsCats.createSequentialGroup()
							.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addGroup(gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddCategory)
								.addComponent(btnAddCategories)
								.addComponent(btnRemoveCategories))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_abilityPermsCats.setVerticalGroup(
			gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abilityPermsCats.createSequentialGroup()
					.addGroup(gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_abilityPermsCats.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPermissionNodes)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_abilityPermsCats.createSequentialGroup()
							.addGap(131)
							.addComponent(lblAddNode)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAddNode)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRemoveNode))
						.addGroup(gl_abilityPermsCats.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCategories)
							.addGap(6)
							.addGroup(gl_abilityPermsCats.createParallelGroup(Alignment.LEADING)
								.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_abilityPermsCats.createSequentialGroup()
									.addGap(97)
									.addComponent(lblAddCategory)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnAddCategories)
									.addGap(12)
									.addComponent(btnRemoveCategories)))))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		abilityPermsCats.setLayout(gl_abilityPermsCats);
		
		JPanel abilityCosts = new JPanel();
		tabAbilityData.addTab("Costs", null, abilityCosts, null);
		
		JCheckBox chckbxCanBuy = new JCheckBox("Can Buy?");
		
		JLabel lblBuyCost = new JLabel("Buy Cost:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JCheckBox chckbxCanRent = new JCheckBox("Can Rent?");
		
		JLabel lblRentCost = new JLabel("Rent Cost:");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JCheckBox chckbxCanBuyUses = new JCheckBox("Can Buy Uses?");
		
		JLabel lblUseCost = new JLabel("Use Cost:");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblRentDuration = new JLabel("Rent Duration:");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblCommandData = new JLabel("Command Data:");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JButton btnAddAsWildcard = new JButton("Add as wildcard string");
		
		JButton btnAddAsRegular = new JButton("Add as regular expression");
		
		JList list_2 = new JList();
		
		JButton btnRemoveCommand = new JButton("Remove Commands");
		GroupLayout gl_abilityCosts = new GroupLayout(abilityCosts);
		gl_abilityCosts.setHorizontalGroup(
			gl_abilityCosts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abilityCosts.createSequentialGroup()
					.addGap(56)
					.addComponent(chckbxCanBuy)
					.addGap(269)
					.addComponent(chckbxCanRent))
				.addGroup(gl_abilityCosts.createSequentialGroup()
					.addGap(88)
					.addComponent(lblBuyCost)
					.addGap(12)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(157)
					.addComponent(lblRentCost, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_abilityCosts.createSequentialGroup()
					.addGap(406)
					.addComponent(lblRentDuration)
					.addGap(30)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_abilityCosts.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxCanBuyUses)
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(36)
							.addComponent(lblUseCost)
							.addGap(36)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addComponent(lblCommandData)
							.addGap(36)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(49)
							.addComponent(btnAddAsWildcard))
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(40)
							.addComponent(btnAddAsRegular)))
					.addGap(117)
					.addComponent(list_2, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_abilityCosts.createSequentialGroup()
					.addContainerGap(481, Short.MAX_VALUE)
					.addComponent(btnRemoveCommand)
					.addGap(113))
		);
		gl_abilityCosts.setVerticalGroup(
			gl_abilityCosts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abilityCosts.createSequentialGroup()
					.addGap(89)
					.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxCanBuy)
						.addComponent(chckbxCanRent))
					.addGap(8)
					.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(2)
							.addComponent(lblBuyCost))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(2)
							.addComponent(lblRentCost))
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(4)
							.addComponent(lblRentDuration))
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(85)
					.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addComponent(chckbxCanBuyUses)
							.addGap(13)
							.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_abilityCosts.createSequentialGroup()
									.addGap(2)
									.addComponent(lblUseCost))
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(gl_abilityCosts.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_abilityCosts.createSequentialGroup()
									.addGap(2)
									.addComponent(lblCommandData))
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addComponent(btnAddAsWildcard)
							.addGap(12)
							.addComponent(btnAddAsRegular))
						.addGroup(gl_abilityCosts.createSequentialGroup()
							.addGap(3)
							.addComponent(list_2, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnRemoveCommand)
					.addGap(16))
		);
		abilityCosts.setLayout(gl_abilityCosts);
		listView.setLayout(gl_listView);
		GroupLayout groupLayout = new GroupLayout(frmBuyabilitiesCostsEditor.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 988, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabViews, GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(tabViews, GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
					.addContainerGap())
		);
		frmBuyabilitiesCostsEditor.getContentPane().setLayout(groupLayout);
	}
}

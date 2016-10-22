package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Handle extends JFrame {
	
	private JPanel contentPane;
	public JTextField name;
	private JTextField nationality;
	boolean check= false;
	public  Amis a = new Amis();
	public String test;
	private JTextField search;
	private JTextField delete;
	boolean deleted= false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Handle frame = new Handle();
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
	public Handle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 389);
		setTitle("FriendZone");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenu mnTools = new JMenu("Tools");
		mnMenu.add(mnTools);
		
		JMenu mnColors = new JMenu("Colors");
		mnTools.add(mnColors);
		
		JMenu mnConfigure = new JMenu("Configure");
		mnMenu.add(mnConfigure);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnMenu.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		a.creerListeAmis();
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
			
		
		
		JLabel lblNom = new JLabel("Name:");
		lblNom.setBounds(33, 13, 56, 16);
		panel.add(lblNom);
		
		JLabel lblNationalit = new JLabel("Nationality:");
		lblNationalit.setBounds(33, 59, 88, 16);
		panel.add(lblNationalit);
		
		name = new JTextField();
		name.setText("");
		name.setBounds(127, 10, 116, 22);
		panel.add(name);
		name.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(115, 102, 254, 16);
		panel.add(label);
		
		nationality = new JTextField();
		nationality.setText("");
		nationality.setBounds(127, 56, 116, 22);
		panel.add(nationality);
		nationality.setColumns(10);
		
		JLabel lblSearchFor = new JLabel("Search for:");
		lblSearchFor.setBounds(33, 139, 78, 16);
		panel.add(lblSearchFor);
		
		JLabel lblDelete = new JLabel("Delete: ");
		lblDelete.setBounds(33, 185, 56, 16);
		panel.add(lblDelete);
		
		JMenuItem mntmBlack = new JMenuItem("Black");
		mntmBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			panel.setBackground(Color.BLACK);
			lblNom.setForeground(Color.WHITE);
			lblNationalit.setForeground(Color.WHITE);
			lblSearchFor.setForeground(Color.WHITE);
			lblDelete.setForeground(Color.WHITE);
			label.setForeground(Color.WHITE);
			}
		});
		mnColors.add(mntmBlack);
		
		JMenuItem mntmWhite = new JMenuItem("White");
		mntmWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setBackground(Color.WHITE);
				lblNom.setForeground(Color.BLACK);
				lblNationalit.setForeground(Color.BLACK);}
		});
		mnColors.add(mntmWhite);
		
		JMenuItem mntmRed = new JMenuItem("Red");
		mntmRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setBackground(Color.RED);
				lblNom.setForeground(Color.WHITE);
				lblNationalit.setForeground(Color.WHITE);
			}
		});
		mnColors.add(mntmRed);
		
		
		JButton btnAddFriend = new JButton("Add friend!");
		btnAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(name.getText().equals("") || nationality.getText().equals("")){
						label.setText("unvalid name or nationality");
					}else{
						Personne p = new Personne(name.getText(), nationality.getText());
						a.ajouterAmis(p);
						label.setText("Friend "+name.getText()+" added!");
					}
			}
		});
		btnAddFriend.setBounds(272, 30, 97, 25);
		panel.add(btnAddFriend);
		
		JButton btnNext = new JButton("Find foreign friends>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Search s = new Search();
				s.Text.setText("Foreign friends:");
				for (int i = 0; i <= a.nbAmis; i++) {
					if(!a.amis[i].nationalité.equals("algérien") && !a.amis[i].nationalité.equals("algerien") && !a.amis[i].nationalité.equals("algeria") && !a.amis[i].nationalité.equals("alg") && !a.amis[i].nationalité.equals("algerie") && !a.amis[i].nationalité.equals("algerian")){
						test = a.amis[i].nom;
					s.Text.setText(s.Text.getText() + "\n" +"- "+  test+".");
					}
				}
				if(s.Text.getText().equals("Foreign friends:")){
					s.Text.setText("Friends not found.");
				}
				s.setVisible(true);
				
			}
		});
		btnNext.setBounds(363, 268, 153, 25);
		panel.add(btnNext);
		
		JMenuItem mntmAddFriend = new JMenuItem("Add Friend");
		mntmAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().equals("") || nationality.getText().equals("")){
					label.setText("unvalid name or nationality");
				}else{
					Personne p = new Personne(name.getText(), nationality.getText());
					a.ajouterAmis(p);
					label.setText("Friend "+name.getText()+" added!");
				}
			}
		});
		mnConfigure.add(mntmAddFriend);
		
		JMenuItem mntmSearchForA = new JMenuItem("Search for a Friend");
		mntmSearchForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(search.getText().equals("")){
					label.setText("Fill search area!");
				}else{
					Search s = new Search();
					s.Text.setText("Search results:");
					
					for (int i = 0; i <= a.nbAmis; i++) {
						if(a.amis[i].nom.equals(search.getText())){
							test = a.amis[i].nom + " nationalité: "+ a.amis[i].nationalité;
						s.Text.setText(s.Text.getText() + "\n" +"friend number "+ (i+1) + ": " +  test+".");
						}
					}
					if(s.Text.getText().equals("Search results:")){
						s.Text.setText("Friend not found.");
					}
					s.setVisible(true);
				}
				
			}
		});
		mnConfigure.add(mntmSearchForA);
		
		JMenuItem mntmDeleteFriend = new JMenuItem("Delete Friend");
		mntmDeleteFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(delete.getText().equals("")){
					label.setText("Fill delete area!");
				}else{
					for (int i = 0; i <= a.nbAmis; i++) {
						if(a.amis[i].nom.equals(delete.getText())){
							label.setText(a.amis[i].nom + " deleted!");
						a.supprimer(i);
						deleted = true;
						}
					}
					if(!deleted){
						label.setText("Personne not found...");
					}
				}
				deleted=false;
			}
		});
		mnConfigure.add(mntmDeleteFriend);
		
		JButton btnFindAlgerienFriends = new JButton("Find Algerien friends>");
		btnFindAlgerienFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search s = new Search();
				s.Text.setText("Algerien friends:");
				for (int i = 0; i <= a.nbAmis; i++) {
					if(a.amis[i].nationalité.equals("algérien") || a.amis[i].nationalité.equals("algerien") || a.amis[i].nationalité.equals("algeria") || a.amis[i].nationalité.equals("alg") || a.amis[i].nationalité.equals("algerie") || a.amis[i].nationalité.equals("algerian")){
						test = a.amis[i].nom;
					s.Text.setText(s.Text.getText() + "\n" +"- "+  test+".");
					}
				}
				if(s.Text.getText().equals("Algerien friends:")){
					s.Text.setText("Friends not found.");
				}
				s.setVisible(true);
			}
		});
		btnFindAlgerienFriends.setBounds(12, 268, 165, 25);
		panel.add(btnFindAlgerienFriends);
		
		
		search = new JTextField();
		search.setBounds(127, 136, 116, 22);
		panel.add(search);
		search.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(search.getText().equals("")){
					label.setText("Fill search area!");
				}else{
					Search s = new Search();
					s.Text.setText("Search results:");
					
					for (int i = 0; i <= a.nbAmis; i++) {
						if(a.amis[i].nom.equals(search.getText())){
							test = a.amis[i].nom + " nationalité: "+ a.amis[i].nationalité;
						s.Text.setText(s.Text.getText() + "\n" +"friend "+ (i+1) + ": " +  test+".");
						}
					}
					if(s.Text.getText().equals("Search results:")){
						s.Text.setText("Friend not found.");
					}
					s.setVisible(true);
				}
			}
		});
		btnSearch.setBounds(272, 135, 97, 25);
		panel.add(btnSearch);
		
		
		delete = new JTextField();
		delete.setBounds(127, 182, 116, 22);
		panel.add(delete);
		delete.setColumns(10);
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(delete.getText().equals("")){
					label.setText("Fill delete area!");
				}else{
					for (int i = 0; i <= a.nbAmis; i++) {
						if(a.amis[i].nom.equals(delete.getText())){
							label.setText(a.amis[i].nom + " deleted!");
						a.supprimer(i);
						deleted = true;
						}
					}
					if(!deleted){
						label.setText("Personne not found...");
					}
				}
				deleted=false;
			}
		});
		btnDelete.setBounds(272, 181, 97, 25);
		panel.add(btnDelete);
	
	}

	public Amis getA() {
		return a;
	}

	public void setA(Amis a) {
		this.a = a;
	}
}

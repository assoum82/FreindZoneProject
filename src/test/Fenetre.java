package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Fenetre extends JFrame {
	private JPanel contentPane;
	public Amis a = new Amis();
	public String test= "test";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
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
	 boolean click = false;
	public Fenetre() {
		
		setTitle("FriendZone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(130, 138, 139, 16);
		panel.add(label);
		
		JLabel warning = new JLabel("");
		warning.setBounds(130, 124, 139, 16);
		panel.add(warning);
		
		JButton btnCreateFriendsList = new JButton("Create friends list!");
		btnCreateFriendsList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				a.creerListeAmis();
				warning.setText(null);
				label.setText("Liste Created!");
				click = true;
				
			}
		});
		btnCreateFriendsList.setBounds(108, 167, 188, 25);
		panel.add(btnCreateFriendsList);
		
		JButton btnNext = new JButton("Next>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!click){
					warning.setText("Must Creat a Liste");
					
				}else {  Handle h = new Handle();//
				h.a=new Amis(a);
				h.setVisible(true);
				setVisible(false);
				}
			}
		});
		btnNext.setBounds(286, 205, 97, 25);
		panel.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("Welcome to FriendZone!");
		lblNewLabel.setFont(new Font("Vladimir Script", Font.PLAIN, 32));
		lblNewLabel.setBounds(61, 36, 323, 75);
		panel.add(lblNewLabel);
		
		
	}
}

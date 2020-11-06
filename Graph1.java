//C4分支上对Graph1.Java文件的第一次修改
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Graph1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graph1 frame = new Graph1();
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
	public Graph1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7ED3\u679C\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBounds(297, 71, 90, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u6309\u94AE");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 30));
		btnNewButton.setBounds(151, 58, 113, 60);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 58, 131, 60);
		contentPane.add(lblNewLabel_1);
	}
}

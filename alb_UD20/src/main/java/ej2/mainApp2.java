package ej2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class mainApp2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainApp2 frame = new mainApp2();
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
	public mainApp2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		final JLabel label = new JLabel("New label");
		contentPane.add(label);
		
		JButton btn1 = new JButton("New button");
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("New button");
		contentPane.add(btn2);
		
		ActionListener puls1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("1");
			}
		};
		
		ActionListener puls2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("2");
			}
		};
		
		btn1.addActionListener(puls1);
		btn2.addActionListener(puls2);
	}

}

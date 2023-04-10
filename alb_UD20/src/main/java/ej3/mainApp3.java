package ej3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;

public class mainApp3 extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;
	private int n1 = 0;
	private int n2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainApp3 frame = new mainApp3();
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
	public mainApp3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("100dlu"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("100dlu"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("20dlu"), FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("20dlu"), }));

		final JLabel label1 = new JLabel("0");
		contentPane.add(label1, "2, 2, center, center");

		final JLabel label2 = new JLabel("0");
		contentPane.add(label2, "4, 2, center, center");

		JButton btn1 = new JButton("New button 1");
		contentPane.add(btn1, "2, 4");

		JButton btn2 = new JButton("New button 2");
		contentPane.add(btn2, "4, 4");
		ActionListener puls1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1++;
				label1.setText(Integer.toString(n1));
			}
		};

		ActionListener puls2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2++;
				label2.setText(Integer.toString(n2));
			}
		};
		
		btn1.addActionListener(puls1);
		btn2.addActionListener(puls2);
	}

}

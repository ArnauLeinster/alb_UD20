package ej6;

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
import javax.swing.JTextField;

public class mainApp6 extends JFrame {

	private JPanel contentPane;
	private JTextField altBox;
	private JTextField pesoBox;
	private JLabel resultLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainApp6 frame = new mainApp6();
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
	public mainApp6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("50dlu"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("50dlu"), FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("40dlu"), FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("50dlu"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		JLabel altBtn = new JLabel("altura");
		contentPane.add(altBtn, "2, 2, center, center");

		altBox = new JTextField();
		contentPane.add(altBox, "4, 2, fill, default");
		altBox.setColumns(10);

		JLabel pesoBtn = new JLabel("peso");
		contentPane.add(pesoBtn, "6, 2, center, center");

		pesoBox = new JTextField();
		contentPane.add(pesoBox, "8, 2, fill, default");
		pesoBox.setColumns(10);

		JButton resultBtn = new JButton("=");
		contentPane.add(resultBtn, "2, 4");

		resultLabel = new JLabel("0");
		contentPane.add(resultLabel, "4, 4, center, center");

		ActionListener equals = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(pesoBox.getText());
				double altura = Double.parseDouble(altBox.getText());
				double result = peso / Math.pow(altura, 2);
				resultLabel.setText(Double.toString(result));
			}
		};

		resultBtn.addActionListener(equals);
	}

}

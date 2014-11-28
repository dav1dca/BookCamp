import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.BoxLayout;
import javax.swing.JRadioButton;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Add_Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Delete frame = new Add_Delete();
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
	public Add_Delete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue_1);
		
		JButton btnNewButton = new JButton("Add Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnNewButton);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue);
		 ButtonGroup group = new ButtonGroup();
		
		JButton btnDeleteBook = new JButton("Delete Book");
		panel_1.add(btnDeleteBook);
		   
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue_2);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		JLabel lblId = new JLabel("ID");
		panel_6.add(lblId);
		
		Component horizontalStrut = Box.createHorizontalStrut(34);
		panel_6.add(horizontalStrut);
		
		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		
		JLabel lblTitulo = new JLabel("Titulo");
		panel_8.add(lblTitulo);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_1);
		
		textField_1 = new JTextField();
		panel_8.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		
		JLabel lblAutor = new JLabel("Autor");
		panel_9.add(lblAutor);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_2);
		
		textField_2 = new JTextField();
		panel_9.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		panel_10.add(lblAo);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(29);
		panel_10.add(horizontalStrut_3);
		
		textField_3 = new JTextField();
		panel_10.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		
		JLabel lblEditorial = new JLabel("Editorial");
		panel_11.add(lblEditorial);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(12);
		panel_11.add(horizontalStrut_4);
		
		textField_4 = new JTextField();
		panel_11.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_4.add(panel_12);
		
		JLabel lblStock = new JLabel("Stock");
		panel_12.add(lblStock);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(25);
		panel_12.add(horizontalStrut_5);
		
		textField_5 = new JTextField();
		panel_12.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("A\u00F1adir");
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		panel_5.add(btnNewButton_2);
	}
}

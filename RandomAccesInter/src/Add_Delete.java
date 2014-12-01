import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Add_Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_5;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnDeleteBook;
	private JPanel panel;
	private JPanel panel_2;
	private Component horizontalStrut_6;
	private Component horizontalStrut_7;
	private Component horizontalStrut_8;
	private BookStore bookstore;
	private Vista vista;
	private Book book;

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

	private void borrarid() {
		panel_3.setVisible(true);
		btnNewButton.setVisible(false);
		btnNewButton_1.setVisible(false);
		panel_7.setVisible(false);
		panel_8.setVisible(false);
		panel_9.setVisible(false);
		panel_10.setVisible(false);
		panel_11.setVisible(false);
	}

	private void alertaBorrar() {
		JFrame alert=new JFrame();
		JLabel a=new JLabel("Elemento borrado");
		alert.add(a);
		alert.setLocationRelativeTo(null);
		alert.pack();
		alert.setVisible(true);
	}
	private void alertaAñadir() {
		JFrame alert=new JFrame();
		JLabel a=new JLabel("Elemento Añadido");
		alert.add(a);
		alert.setLocationRelativeTo(null);
		alert.pack();
		alert.setVisible(true);
	}
	private void añadirlibros(){
		int id=Integer.parseInt(textField.getText());
		String titulo=textField_1.getText();
		int autor=Integer.parseInt(textField_1.getText());
		int anio=Integer.parseInt(textField_1.getText());
		int editorial=Integer.parseInt(textField_1.getText());
		int stock=Integer.parseInt(textField_1.getText());
		Book boook=new Book();
		boook.setTitulo(titulo);
		boook.setFk_Autor(autor);
		boook.setAnio(anio);
		boook.setFk_Editorial(editorial);
		boook.setStock(stock);
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

		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));

		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_6);

		btnNewButton = new JButton("Add Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.setVisible(true);
				btnNewButton_2.setVisible(false);
				btnDeleteBook.setVisible(false);
				

			}
		});
		panel_1.add(btnNewButton);

		horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_7);

		btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				borrarid();
				
			}
		});
		panel_1.add(btnDeleteBook);

		horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_8);

		panel_2 = new JPanel();
		panel.add(panel_2);

		panel_3 = new JPanel();
		panel_3.setVisible(false);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(6, 0, 0, 0));

		panel_6 = new JPanel();
		panel_4.add(panel_6);

		JLabel lblId = new JLabel("ID");
		panel_6.add(lblId);

		Component horizontalStrut = Box.createHorizontalStrut(34);
		panel_6.add(horizontalStrut);

		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(10);

		panel_7 = new JPanel();
		panel_4.add(panel_7);

		JLabel lblTitulo = new JLabel("Titulo");
		panel_7.add(lblTitulo);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_1);

		textField_1 = new JTextField();
		panel_7.add(textField_1);
		textField_1.setColumns(10);

		panel_8 = new JPanel();
		panel_4.add(panel_8);

		JLabel lblAutor = new JLabel("Autor");
		panel_8.add(lblAutor);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_2);

		textField_2 = new JTextField();
		panel_8.add(textField_2);
		textField_2.setColumns(10);

		panel_9 = new JPanel();
		panel_4.add(panel_9);

		JLabel lblAo = new JLabel("A\u00F1o");
		panel_9.add(lblAo);

		Component horizontalStrut_3 = Box.createHorizontalStrut(29);
		panel_9.add(horizontalStrut_3);

		textField_3 = new JTextField();
		panel_9.add(textField_3);
		textField_3.setColumns(10);

		panel_10 = new JPanel();
		panel_4.add(panel_10);

		JLabel lblEditorial = new JLabel("Editorial");
		panel_10.add(lblEditorial);

		Component horizontalStrut_4 = Box.createHorizontalStrut(12);
		panel_10.add(horizontalStrut_4);

		textField_4 = new JTextField();
		panel_10.add(textField_4);
		textField_4.setColumns(10);

		panel_11 = new JPanel();
		panel_4.add(panel_11);

		JLabel lblStock = new JLabel("Stock");
		panel_11.add(lblStock);

		Component horizontalStrut_5 = Box.createHorizontalStrut(25);
		panel_11.add(horizontalStrut_5);

		textField_5 = new JTextField();
		panel_11.add(textField_5);
		textField_5.setColumns(10);

		panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));

		btnNewButton_1 = new JButton("A\u00F1adir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//miguel mira esto
				
				añadirlibros(); // mira este metodo 
				alertaAñadir();

			}
		});
		panel_5.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField.getText());
				bookstore.DeleteBookFromBin(id);
				alertaBorrar();

			}
		});
		panel_5.add(btnNewButton_2);

	}

}

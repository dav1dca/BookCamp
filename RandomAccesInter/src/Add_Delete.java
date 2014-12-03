import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.sun.glass.events.MouseEvent;

import javax.swing.ImageIcon;


public class Add_Delete extends JFrame {

	public JPanel contentPane;
	public JTextField textID;
	public JTextField textTitulo;
	public JTextField textAutor;
	public JTextField textAnio;
	public JTextField textEditorial;
	public JTextField textStock;
	private BookStore bok = new BookStore();
	private Book book = new Book();
	private String[][] datosBusqueda;
	private String[] nombreColumnas = {"ID","TITLE","AUTHOR","PUBLISHER","YEAR","STOCK"};

	
	/**
	 * Create the frame.
	 */
	public Add_Delete() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		final JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		final JLabel lblId = new JLabel("ID");
		final JLabel lblTitulo = new JLabel("Titulo");
		final JLabel lblAutor = new JLabel("Autor");
		final JLabel lblAo = new JLabel("A\u00F1o");
		final JLabel lblEditorial = new JLabel("Editorial");
		final JLabel lblStock = new JLabel("Stock");
		final JButton btnAnadir = new JButton("");
		btnAnadir.setIcon(new ImageIcon(Add_Delete.class.getResource("/imagenes/a\u00F1adir1.png")));
		btnAnadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				try {
					book = new Book(Integer.valueOf(textID.getText()), textTitulo.getText(), Integer.parseInt(textAutor.getText()), Integer.valueOf(textEditorial.getText()),
							Integer.valueOf(textAnio.getText()), Integer.valueOf(textStock.getText()));
					bok.AddBookToBIN(book);
					if(bok.AddBookToBIN(book)){
						int vuelta = JOptionPane.showOptionDialog(e.getComponent(), "Libro añadido", "Libro añadido",
								   JOptionPane.YES_NO_CANCEL_OPTION,
								   JOptionPane.QUESTION_MESSAGE,
								   null,    // null for default icon
								   new Object[] { "OK" },   // null for YES, NO y CANCEL
								   "opcion 1");
					   }else{
						   int vuelta = JOptionPane.showOptionDialog(e.getComponent(), "Libro No añadido", "Libro No añadido",
								   JOptionPane.YES_NO_CANCEL_OPTION,
								   JOptionPane.QUESTION_MESSAGE,
								   null,    // null for default icon
								   new Object[] { "OK" },   // null for YES, NO y CANCEL
								   "opcion 1");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		final JButton btnBorrar = new JButton("");
		btnBorrar.setIcon(new ImageIcon(Add_Delete.class.getResource("/imagenes/borrar1.png")));
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				book.Id = Integer.parseInt(textID.getText());
				bok.DeleteBookFromBin(book.Id);
				if(bok.DeleteBookFromBin(book.Id)){
					int vuelta = JOptionPane.showOptionDialog(e.getComponent(), "Libro borrado", "Libro borrado",
							   JOptionPane.YES_NO_CANCEL_OPTION,
							   JOptionPane.QUESTION_MESSAGE,
							   null,    // null for default icon
							   new Object[] { "OK" },   // null for YES, NO y CANCEL
							   "opcion 1");
				   }else{
					   int vuelta = JOptionPane.showOptionDialog(e.getComponent(), "Libro No borrado", "Libro No borrado",
							   JOptionPane.YES_NO_CANCEL_OPTION,
							   JOptionPane.QUESTION_MESSAGE,
							   null,    // null for default icon
							   new Object[] { "OK" },   // null for YES, NO y CANCEL
							   "opcion 1");
				}
				
				
			}
		});
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				panel_3.setVisible(true);
				textID.setVisible(true);
				textTitulo.setVisible(true);
				textAutor.setVisible(true);
				textAnio.setVisible(true);
				textEditorial.setVisible(true);
				textStock.setVisible(true);
				lblId.setVisible(true);
				lblTitulo.setVisible(true);
				lblAo.setVisible(true);
				lblAutor.setVisible(true);
				lblEditorial.setVisible(true);
				lblStock.setVisible(true);
				btnBorrar.setVisible(false);
				btnAnadir.setVisible(true);
				
				///////
				
				
				
				
			}
		});
		
		panel_1.add(btnAddBook);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue);
		 ButtonGroup group = new ButtonGroup();
		
		JButton btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				panel_3.setVisible(true);
				textID.setVisible(true);
				textTitulo.setVisible(false);
				textAutor.setVisible(false);
				textAnio.setVisible(false);
				textEditorial.setVisible(false);
				textStock.setVisible(false);
				lblId.setVisible(true);
				lblTitulo.setVisible(false);
				lblAo.setVisible(false);
				lblAutor.setVisible(false);
				lblEditorial.setVisible(false);
				lblStock.setVisible(false);
				
				btnBorrar.setVisible(true);
				btnAnadir.setVisible(false);
				textID.getText();
				textTitulo.getText();
				textAutor.getText();
				textAnio.getText();
				textEditorial.getText();
				textStock.getText();
				
				
			}
		});
		panel_1.add(btnDeleteBook);
		   
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue_2);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
	
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		 
		panel_6.add(lblId);
		
		Component horizontalStrut = Box.createHorizontalStrut(34);
		panel_6.add(horizontalStrut);
		
		textID = new JTextField();
		panel_6.add(textID);
		textID.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		
		
		panel_8.add(lblTitulo);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_1);
		
		textTitulo = new JTextField();
		panel_8.add(textTitulo);
		textTitulo.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		
		
		panel_9.add(lblAutor);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_2);
		
		textAutor = new JTextField();
		panel_9.add(textAutor);
		textAutor.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		
		
		panel_10.add(lblAo);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(29);
		panel_10.add(horizontalStrut_3);
		
		textAnio = new JTextField();
		panel_10.add(textAnio);
		textAnio.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		
		
		panel_11.add(lblEditorial);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(12);
		panel_11.add(horizontalStrut_4);
		
		textEditorial = new JTextField();
		panel_11.add(textEditorial);
		textEditorial.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_4.add(panel_12);
		
		
		panel_12.add(lblStock);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(25);
		panel_12.add(horizontalStrut_5);
		
		textStock = new JTextField();
		panel_12.add(textStock);
		textStock.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		
	
		
		panel_5.add(btnAnadir);
		
		
		panel_5.add(btnBorrar);
		
		
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
	
		
	}
}

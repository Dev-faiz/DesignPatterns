package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.ProductController;

public class ProductMainFrame extends JFrame {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	private final  JButton okButton ;
	
	public  ProductMainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		okButton = new JButton("OK") ;
		okButton.addActionListener(ev -> new ProductController().okAction());
		add(okButton);
		
		setSize(500 , 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class UIBotones extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	public JPanel getPanel() {
		return panel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIBotones frame = new UIBotones();
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
	public UIBotones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{107, 109, 106, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lbl = new JLabel("  ");
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 0;
		gbc_lbl.gridy = 0;
		panel.add(lbl, gbc_lbl);
		
		JButton btnElegirColor = new JButton("ElegirColor");
		GridBagConstraints gbc_btnElegirColor = new GridBagConstraints();
		gbc_btnElegirColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnElegirColor.insets = new Insets(0, 0, 0, 5);
		gbc_btnElegirColor.gridx = 0;
		gbc_btnElegirColor.gridy = 1;
		panel.add(btnElegirColor, gbc_btnElegirColor);
		
		JButton btnBarajarfilas = new JButton("BarajarFilas");
		GridBagConstraints gbc_btnBarajarfilas = new GridBagConstraints();
		gbc_btnBarajarfilas.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBarajarfilas.insets = new Insets(0, 0, 0, 5);
		gbc_btnBarajarfilas.gridx = 1;
		gbc_btnBarajarfilas.gridy = 1;
		panel.add(btnBarajarfilas, gbc_btnBarajarfilas);
		
		JButton btnBorrarcolor = new JButton("BorrarColor");
		GridBagConstraints gbc_btnBorrarcolor = new GridBagConstraints();
		gbc_btnBorrarcolor.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarcolor.gridx = 2;
		gbc_btnBorrarcolor.gridy = 1;
		panel.add(btnBorrarcolor, gbc_btnBorrarcolor);
	}

}

package vista;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.border.LineBorder;

public class JLabelModel extends javax.swing.JLabel {

	
	private static final long serialVersionUID = 13423432L;

	public JLabelModel(Color color) {
		super();
		setText("       ");
		setBackground(color);
		setOpaque(true);
		setForeground(Color.WHITE);
		setPreferredSize(new Dimension(36, 36));
		setMinimumSize(new Dimension(36, 36));
		setMaximumSize(new Dimension(136, 136));
		setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
	}

	
	

}

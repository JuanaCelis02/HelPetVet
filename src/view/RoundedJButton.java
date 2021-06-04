package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RoundedJButton extends JButton{
	/**
	 * 
	 */
	private int arcW;
	private int arcH;
	private static final long serialVersionUID = 1L;
	public RoundedJButton(int arcW, int arcH, String text, String codeColorBackground, String codeColorForeground ) {
		super( text );
		this.arcW = arcW;
		this.arcH = arcH;
		this.setBackground( Color.decode( codeColorBackground ) );
	}

	public RoundedJButton(int arcW, int arcH, String text, String codeColorBackground, String codeColorForeground, String pathImageIcon) {
		super( text );
		this.arcW = arcW;
		this.arcH = arcH;
		this.setBackground( Color.decode( codeColorBackground ) );
		setContentAreaFilled( false );
		setForeground( Color.decode( codeColorForeground));
		this.setIcon( new ImageIcon(getClass().getResource( pathImageIcon )) );
	}
	
	public RoundedJButton(int arcW, int arcH, String text, Color codeColorBackground, Color codeColorForeground, String command, ActionListener listener) {
		super( text );
		this.arcW = arcW;
		this.arcH = arcH;
		this.setBackground( codeColorBackground );
		this.setContentAreaFilled( false );
		this.setForeground(  codeColorForeground );
		this.setActionCommand( command );
		this.addActionListener( listener );
	}
	
	public RoundedJButton(int arcW, int arcH, String text, Color codeColorBackground, Color codeColorForeground, Font font, String command, ActionListener listener) {
		super( text );
		this.arcW = arcW;
		this.arcH = arcH;
		this.setBackground( codeColorBackground );
		this.setContentAreaFilled( false );
		this.setForeground(  codeColorForeground );
		this.setFont( font );
		this.setActionCommand( command );
		this.addActionListener( listener );
	}



	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; 
		g2.setColor(getBackground());
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);           
		g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcW, arcH);
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcW, arcH);
	}

}

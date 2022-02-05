
package controls;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;


public class JTextBox extends JTextField{
    
    public JTextBox(int size)
    {
        super(size);
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 8, 8);
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(Color.decode("#040659"));
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 8, 8);
    }
}
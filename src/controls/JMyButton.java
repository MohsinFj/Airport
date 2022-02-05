
package controls;

import com.sun.glass.ui.Cursor;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;


public class JMyButton extends JButton{
    Graphics g;
    public JMyButton()
    {
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        g.setColor(new Color(70,130,180));
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 8, 8);
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(Color.decode("#040659"));
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 8, 8);
    }
    
    private void jMyButton1MousePressed(java.awt.event.MouseEvent evt) {                                        
        if(evt.getSource()==g)
        {
            g.setColor(new Color(115,118,247));
        }
    } 
    
}

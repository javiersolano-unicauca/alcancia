package vista;

import controlador.EnumBilletes;
import javax.swing.JButton;

/**
 * @author javiersolanop
 */
public class BotonBillete extends JButton{
    
    // Properties:
    private EnumBilletes atrBillete;
    
    // Constructors:
    public BotonBillete(EnumBilletes prmBillete, int x, int y, int width, int height)
    {
        atrBillete = prmBillete;
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setBounds(x, y, width, height);
    }
    
    // Method 'getter':
    public EnumBilletes getBillete(){ return atrBillete; }
}

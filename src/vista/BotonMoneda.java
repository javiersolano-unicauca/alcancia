package vista;

import controlador.EnumMonedas;
import javax.swing.JButton;

/**
 * @author javiersolanop
 */
public class BotonMoneda extends JButton{

    // Properties:
    private EnumMonedas atrMoneda;
    
    // Constructors:
    public BotonMoneda(EnumMonedas prmMoneda, int x, int y, int width, int height)
    {
        atrMoneda = prmMoneda;
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setBounds(x, y, width, height);
    }
    
    // Method 'getter':
    public EnumMonedas getMoneda(){ return atrMoneda; }
}

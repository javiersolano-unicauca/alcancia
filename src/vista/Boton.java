package vista;

import java.awt.Font;
import javax.swing.JButton;

/**
 * @author javiersolanop
 */
public class Boton extends JButton {
    
    // Constructors:
    public Boton(String prmTitulo, String prmFont, int prmFontSize, int x, int y, int width, int height)
    {
        super(prmTitulo);
        setFont(new Font(prmFont, Font.PLAIN, prmFontSize));
        setBounds(x, y, width, height);
    }
}

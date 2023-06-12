package vista;

import java.awt.Color;
import javax.swing.JFrame;
import controlador.Alcancia;
import controlador.EnumBilletes;
import controlador.EnumMonedas;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @author javiersolanop
 */
public final class AlcanciaVista extends JFrame implements ActionListener{
    
    // Controllers:
    Alcancia atrAlcancia = new Alcancia();
    
    // Components:
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 900;
    private static final int WIDTH_ALCANCIA = 400;
    private static final int HEIGHT_ALCANCIA = 400;
    private static final String RUTA_RAIZ = "C:\\Users\\ROOT\\Documents\\NetBeansProjects\\Alcancia\\src\\vista\\images\\";
    private static final String IMAGEN_ALCANCIA = RUTA_RAIZ+"alcancia.png";
    private static final String IMAGEN_CINCUENTA_MIL_PESOS = RUTA_RAIZ+"CINCUENTA_MIL_PESOS.jpg";
    private static final String IMAGEN_VEINTE_MIL_PESOS = RUTA_RAIZ+"VEINTE_MIL_PESOS.jpg";
    private static final String IMAGEN_DIEZ_MIL_PESOS = RUTA_RAIZ+"DIEZ_MIL_PESOS.jpg";    
    private static final String IMAGEN_CINCO_MIL_PESOS = RUTA_RAIZ+"CINCO_MIL_PESOS.jpg";
    private static final String IMAGEN_DOS_MIL_PESOS = RUTA_RAIZ+"DOS_MIL_PESOS.jpg";
    private static final String IMAGEN_MIL_PESOS = RUTA_RAIZ+"MIL_PESOS.jpg";
    private static final String IMAGEN_QUINIENTOS_PESOS = RUTA_RAIZ+"QUINIENTOS_PESOS.jpg";
    private static final String IMAGEN_DOSCIENTOS_PESOS = RUTA_RAIZ+"DOSCIENTOS_PESOS.jpg";
    private static final String IMAGEN_CIEN_PESOS = RUTA_RAIZ+"CIEN_PESOS.jpg";
    private static final String IMAGEN_CINCUENTA_PESOS = RUTA_RAIZ+"CINCUENTA_PESOS.jpg";
    private static final String IMAGEN_ROMPER_ALCANCIA = RUTA_RAIZ+"romper_alcancia.png";
    
    Contenedor ctnBilletes = new Contenedor("Billetes", Color.yellow, 105, 5, 790, 100);
    Contenedor ctnMonedas = new Contenedor("Monedas", Color.yellow, 5, 110, 100, 525);
    Contenedor ctnAlcancia = new Contenedor("Alcancia", IMAGEN_ALCANCIA, 120, 120, WIDTH_ALCANCIA, HEIGHT_ALCANCIA);
    Contenedor ctnCincuenta = new Contenedor(IMAGEN_CINCUENTA_MIL_PESOS, 105, 12, 158, 90);
    Contenedor ctnVeinte = new Contenedor(IMAGEN_VEINTE_MIL_PESOS, 263, 12, 158, 90);
    Contenedor ctnDiez = new Contenedor(IMAGEN_DIEZ_MIL_PESOS, 421, 12, 158, 90);
    Contenedor ctnCinco = new Contenedor(IMAGEN_CINCO_MIL_PESOS, 579, 12, 158, 90);
    Contenedor ctnDos = new Contenedor(IMAGEN_DOS_MIL_PESOS, 737, 12, 158, 90);
    Contenedor ctnMil = new Contenedor(IMAGEN_MIL_PESOS, 5, 125, 100, 105);
    Contenedor ctnQuinientos = new Contenedor(IMAGEN_QUINIENTOS_PESOS, 5, 230, 100, 105);
    Contenedor ctnDoscientos = new Contenedor(IMAGEN_DOSCIENTOS_PESOS, 5, 335, 100, 105);
    Contenedor ctnCien = new Contenedor(IMAGEN_CIEN_PESOS, 5, 440, 100, 105);
    Contenedor ctnCincuentaPesos = new Contenedor(IMAGEN_CINCUENTA_PESOS, 5, 545, 100, 100);
    Contenedor ctnRomperAlcancia = new Contenedor("Romper alcancia", IMAGEN_ROMPER_ALCANCIA, 530, 120, 400, 400);
    
    BotonBillete btnCincuenta = new BotonBillete(EnumBilletes.CINCUENTA_MIL_PESOS, 105, 12, 158, 90);
    BotonBillete btnVeinte = new BotonBillete(EnumBilletes.VEINTE_MIL_PESOS, 263, 12, 158, 90);
    BotonBillete btnDiez = new BotonBillete(EnumBilletes.DIEZ_MIL_PESOS, 421, 12, 158, 90);
    BotonBillete btnCinco = new BotonBillete(EnumBilletes.CINCO_MIL_PESOS, 579, 12, 158, 90);
    BotonBillete btnDos = new BotonBillete(EnumBilletes.DOS_MIL_PESOS, 737, 12, 158, 90);
    
    BotonMoneda  btnMil = new BotonMoneda(EnumMonedas.MIL_PESOS, 5, 125, 100, 105);
    BotonMoneda  btnQuinientos = new BotonMoneda(EnumMonedas.QUINIENTOS_PESOS, 5, 230, 100, 105);
    BotonMoneda  btnDoscientos = new BotonMoneda(EnumMonedas.DOSCIENTOS_PESOS, 5, 335, 100, 105);
    BotonMoneda  btnCien = new BotonMoneda(EnumMonedas.CIEN_PESOS, 5, 440, 100, 105);
    BotonMoneda  btnCicuentaPesos = new BotonMoneda(EnumMonedas.CINCUENTA_PESOS, 5, 545, 100, 100);
    
    Boton btnReiniciarAlcancia = new Boton("Reiniciar alcancia", "Arial", 20, 120, 530, WIDTH_ALCANCIA, 100);
    Boton btnRomperAlcancia = new Boton("Romper alcancia", "Arial", 20, 530, 530, 400, 100);
    
    Etiqueta lblTotal = new Etiqueta("Total: ", "Arial", 20, 5, 675, 60, 20);
    Etiqueta lblValorTotal = new Etiqueta(""+atrAlcancia.obtenerTotal(), "Arial", 20, Color.LIGHT_GRAY, 65, 665, 200, 40);
    
    public AlcanciaVista()
    {
        super("Dueño: Javier Solano");
        setLayout(null);
        add(ctnBilletes);
        add(ctnMonedas);
        add(ctnAlcancia);
        add(ctnCincuenta);
        add(ctnVeinte);
        add(ctnDiez);
        add(ctnCinco);
        add(ctnDos);
        add(ctnMil);
        add(ctnQuinientos);
        add(ctnDoscientos);
        add(ctnCien);
        add(ctnCincuentaPesos);
        add(ctnRomperAlcancia);
        
        btnCincuenta.addActionListener(this);
        add(btnCincuenta);
        btnVeinte.addActionListener(this);
        add(btnVeinte);
        btnDiez.addActionListener(this);
        add(btnDiez);
        btnCinco.addActionListener(this);
        add(btnCinco);
        btnDos.addActionListener(this);
        add(btnDos);
        
        btnMil.addActionListener(this);
        add(btnMil);
        btnQuinientos.addActionListener(this);
        add(btnQuinientos);
        btnDoscientos.addActionListener(this);
        add(btnDoscientos);
        btnCien.addActionListener(this);
        add(btnCien);
        btnCicuentaPesos.addActionListener(this);
        add(btnCicuentaPesos);
        
        btnReiniciarAlcancia.addActionListener(this);
        add(btnReiniciarAlcancia);
        btnRomperAlcancia.addActionListener(this);
        add(btnRomperAlcancia);

        add(lblTotal);
        add(lblValorTotal);

        setSize(WIDTH, HEIGHT);
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
    // Methods:
    
    public static void main(String[] args) {
        AlcanciaVista objAlcancia = new AlcanciaVista();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String varEntrada;
        int varCantidad;
        
        do{
            try{
                if(e.getSource() instanceof BotonBillete){

                    BotonBillete objBillete = (BotonBillete)e.getSource();
                    varEntrada = JOptionPane.showInputDialog("Ingrese la cantidad de billetes de "+objBillete.getBillete().obtenerDenominacion());
                    varCantidad = (varEntrada != null) ? Integer.parseInt(varEntrada) : 0;
                    atrAlcancia.agregarDinero(objBillete.getBillete(), varCantidad);
                    
                }else if(e.getSource() instanceof BotonMoneda){
                    
                    BotonMoneda objMoneda = (BotonMoneda)e.getSource();
                    varEntrada = JOptionPane.showInputDialog("Ingrese la cantidad de monedas de "+objMoneda.getMoneda().obtenerDenominacion());
                    varCantidad = (varEntrada != null) ? Integer.parseInt(varEntrada) : 0;
                    atrAlcancia.agregarDinero(objMoneda.getMoneda(), varCantidad);
                
                }else if(e.getSource() == btnReiniciarAlcancia){
                    
                    if(JOptionPane.showConfirmDialog(null, "Seguro que desea reinicial la alcancia?", "Reiniciar alcancia", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION)
                        atrAlcancia.reiniciarAlcancia();
                
                }else if(e.getSource() == btnRomperAlcancia)
                    JOptionPane.showMessageDialog(null, atrAlcancia.getBilletesAndMonedas());
                
                lblValorTotal.setText(""+atrAlcancia.obtenerTotal());
                break;
                       
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Tipo de dato invalido!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
    }
}

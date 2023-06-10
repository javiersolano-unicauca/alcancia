package controlador;

/**
 * @author javiersolanop
 */
public class Billete implements iDinero{
    
    private EnumBilletes atrBillete;
    private int atrCantidad;
    
    // Constructors:
    public Billete(EnumBilletes prmBillete, int prmCantidad)
    {
        atrBillete = prmBillete;
        atrCantidad = prmCantidad;
    }
    
    public Billete(EnumBilletes prmBillete)
    {
        atrBillete = prmBillete;
        atrCantidad = 0;
    }
    
    // Methods:
    public void agregarCantidad(int prmCantidad){ atrCantidad += prmCantidad; }

    @Override
    public String obtenerCantidad() 
    {
        return "Cantidad de billetes de "+atrBillete.obtenerDenominacion()+": "+atrCantidad;
    }

    @Override
    public long obtenerTotal() {
        return atrBillete.getValor() * atrCantidad;
    }
}
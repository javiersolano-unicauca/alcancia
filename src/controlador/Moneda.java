package controlador;

/**
 * @author javiersolanop
 */
public class Moneda implements iDinero{
    
    // Properties:
    private EnumMonedas atrMoneda;
    private int atrCantidad;
    
    // Contructors:
    public Moneda(EnumMonedas prmMoneda, int prmCantidad)
    {
        atrMoneda = prmMoneda;
        atrCantidad = prmCantidad;
    }
    
    public Moneda(EnumMonedas prmMoneda)
    {
        atrMoneda = prmMoneda;
        atrCantidad = 0;
    }
    
    // Methods:
    public void agregarCantidad(int prmCantidad){ atrCantidad += prmCantidad; }
    
    @Override
    public String obtenerCantidad() 
    {
        return "Cantidad de monedas de "+atrMoneda.obtenerDenominacion()+": "+atrCantidad;
    }

    @Override
    public long obtenerTotal() {
        return atrMoneda.getValor() * atrCantidad;
    }
}

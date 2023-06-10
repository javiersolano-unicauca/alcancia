package controlador;

/**
 * @author javiersolanop
 */
public enum EnumMonedas {
    
    // Enums:
    MIL_PESOS(1000),
    QUINIENTOS_PESOS(500),
    DOSCIENTOS_PESOS(200),
    CIEN_PESOS(100),
    CINCUENTA_PESOS(50);
    
    // Properties:
    private long atrValor;
    
    // Constructors:
    private EnumMonedas(long prmValor){ atrValor = prmValor; }
    
    // Method 'getter':
    public long getValor(){ return atrValor; }
    
    public String obtenerDenominacion()
    {
        return toString().replaceAll("_", " ");
    }
}

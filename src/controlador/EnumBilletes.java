package controlador;

/**
 * @author javiersolanop
 */
public enum EnumBilletes {
    
    // Enums:
    CINCUENTA_MIL_PESOS(50000),
    VEINTE_MIL_PESOS(20000),
    DIEZ_MIL_PESOS(10000),
    CINCO_MIL_PESOS(5000),
    DOS_MIL_PESOS(2000);
    
    // Properties:
    private long atrValor;
    
    // Constructors:
    private EnumBilletes(long prmValor){ atrValor = prmValor; }
    
    // Method 'getter':
    public long getValor(){ return atrValor; }
    
    public String obtenerDenominacion()
    {
        return toString().replaceAll("_", " ");
    }
}

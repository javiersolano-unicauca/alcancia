package controlador;

import java.util.ArrayList;

/**
 * @author javiersolanop
 */
public class Alcancia {
    
    // Properties
    private ArrayList<Billete> arrBilletes;
    private ArrayList<Moneda> arrMonedas;
    
    // Constructors: 
    public Alcancia()
    {
        arrBilletes = new ArrayList<>();
        arrMonedas = new ArrayList<>();
        inicializarListaBilletes();
        inicializarListaMonedas();
    }
       
    // Methods:
    public void reiniciarAlcancia()
    {
        arrBilletes.clear();
        arrMonedas.clear();
        inicializarListaBilletes();
        inicializarListaMonedas();
    }
    
    private void inicializarListaBilletes()
    {    
        for(EnumBilletes objBillete: EnumBilletes.values())
            arrBilletes.add(new Billete(objBillete, 0));   
    }
    
    private void inicializarListaMonedas()
    {   
        for(EnumMonedas objMoneda: EnumMonedas.values())
            arrMonedas.add(new Moneda(objMoneda, 0));
    }
    
    public long obtenerTotal()
    {
        long varTotal = 0;
        
        for(Billete objBillete: arrBilletes)
            varTotal += objBillete.obtenerTotal();
        
        for(Moneda objMoneda: arrMonedas)
            varTotal += objMoneda.obtenerTotal();
        return varTotal;
    }
    
    public void agregarDinero(EnumBilletes prmBillete, int prmCantidad)
    {
        int index = prmBillete.ordinal();
        Billete objBillete = arrBilletes.get(index);
        objBillete.agregarCantidad(prmCantidad);
        arrBilletes.set(index, objBillete);
    }
    
    public void agregarDinero(EnumMonedas prmMoneda, int prmCantidad)
    {
        int index = prmMoneda.ordinal();
        Moneda objMoneda = arrMonedas.get(index);
        objMoneda.agregarCantidad(prmCantidad);
        arrMonedas.set(index, objMoneda);
    }
    
    // Methods 'getter':
    public String getBilletes()
    { 
        String varBilletes = "";
        
        for(Billete objBillete: arrBilletes)
            varBilletes += "\n"+objBillete.obtenerCantidad();
        return varBilletes;
    }
    
    public String getMonedas()
    {
        String varMonedas = "";
        
        for(Moneda objMoneda: arrMonedas)
            varMonedas += "\n"+objMoneda.obtenerCantidad();
        return varMonedas;
    }
    
    public String getBilletesAndMonedas()
    {
        String varBilletesAndMonedas = "";
        varBilletesAndMonedas += getBilletes()+"\n";
        varBilletesAndMonedas += getMonedas();
        return varBilletesAndMonedas;
    }
}

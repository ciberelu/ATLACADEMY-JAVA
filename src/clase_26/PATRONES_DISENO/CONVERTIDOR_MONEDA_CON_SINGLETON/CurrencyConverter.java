package clase_26.PATRONES_DISENO.CONVERTIDOR_MONEDA_CON_SINGLETON;

public class CurrencyConverter {

    //creacion de la unica de instancia de esta clase

    private static final CurrencyConverter instance = new CurrencyConverter();

    //metodo par obtener la instancia

    public static CurrencyConverter getInstance() {
        return instance;
    }

    //constructor para garantizar que no se puedan hacer mas instancias.
    private CurrencyConverter() {
        
    }

    public double EurToUSD(double euros){
        return euros * 1.10;
    }

    public double USDToEur(double dolares){
        return dolares * 0.90;
    }
}

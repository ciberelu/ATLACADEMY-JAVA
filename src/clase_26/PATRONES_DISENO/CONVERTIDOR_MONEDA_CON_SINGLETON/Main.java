package clase_26.PATRONES_DISENO.CONVERTIDOR_MONEDA_CON_SINGLETON;

public class Main {
    public static void main(String[]args){
        System.out.println("Convertidor de moneda usando patron de diseño singleton");

        double euros = CurrencyConverter.getInstance().USDToEur(10);

        System.out.println("Tengo estos euros: " + euros);
    }
}

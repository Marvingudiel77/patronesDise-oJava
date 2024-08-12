package patronAdapter2;

public class Ejecutar {
    public static void main(String[] args) {
        Pago pago1 = new PagoAntiguoAdapter(new PagoAntiguo());
        pago1.procesarPago(100.50);
    }
}

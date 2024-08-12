package patronAdapter2;

public class PagoAntiguoAdapter implements Pago{
    private PagoAntiguo pagoAntiguo;

    public PagoAntiguoAdapter(PagoAntiguo pagoAntiguo) {
        this.pagoAntiguo = pagoAntiguo;
    }

    @Override
    public void procesarPago(double monto) {
        pagoAntiguo.realizarPago(monto);
    }
}

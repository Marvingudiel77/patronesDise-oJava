package patrones_diseño_java;

public class MotorElectricoAdapter implements Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void encender() {
        motorElectrico.Conectar();
        motorElectrico.Activar();
        motorElectrico.Mover();
    }
}

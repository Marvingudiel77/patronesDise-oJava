package patrones_diseño_java;

public class Ejecutar{
    public static void main(String Args[]){
        Motor motor1 = new MotorElectricoAdapter(new MotorElectrico());
        motor1.encender();
    }
}

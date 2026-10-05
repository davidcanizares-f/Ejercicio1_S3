package negocio;

import javax.swing.*;

public class MainMotor {
    public static void main() {
        Motor motor1 = new Motor();
        motor1.setNombre("Motor de banda transportadora");
        motor1.setPotencia(5.5);
        motor1.setVelocidad(1450);
        motor1.setEncendido(false);

        Motor motor2 = new Motor();
        motor2.setNombre("Motor de bomba de agua");
        motor2.setPotencia(3.0);
        motor2.setVelocidad(1750);
        motor2.setEncendido(true);

        System.out.println("> " + motor1.getNombre());
        System.out.println("-Potencia: " + motor1.getPotencia());
        System.out.println("-Velocidad: " + motor1.getVelocidad());
        System.out.println("-Encendido: " + motor1.getEncendido());

        System.out.println("---------------------");
        motor2.apagar();
        System.out.println("> " + motor2.getNombre());
        System.out.println("-Potencia: " + motor2.getPotencia());
        System.out.println("-Velocidad " + motor2.getVelocidad());
        System.out.println("-Encendido: " + motor2.getEncendido());



    }

}
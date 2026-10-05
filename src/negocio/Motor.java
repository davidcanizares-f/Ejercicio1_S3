package negocio;

public class Motor {
    private String nombre;
    private double potencia;
    private double velocidad;
    private boolean encendido;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPotencia(double potencia){
        if(potencia > 0){
            this.potencia=potencia;
        }

    }

    public void setVelocidad(double velocidad){
        if(velocidad < 0){
            velocidad = 0;
        }
        this.velocidad=velocidad;
    }

    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public double getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }
    public boolean getEncendido(){
        return encendido;
    }


    public void encender(){
        if(!encendido){
            encendido=true;
            System.out.println("[!] El " + nombre + " ha sido encendido.");
        } else {
            System.out.println("[!] El " + nombre + " ya ha sido encendido.");
        }

    }

    public void mostrarInformacion(){
        String estado = encendido ? "Encendido" : "Apagado";;

        System.out.println("Motor: " + nombre);
        System.out.println("Potencia: " + potencia + " kW");
        System.out.println("Velocidad: " + velocidad + " rpm");
        System.out.println("Estado: " + estado);
        System.out.println("--------------------------\n");
    }

    void apagar(){
        if(encendido){
            encendido = false;
            //velocidad = 0;
            System.out.println("[!] El " + nombre + " fue apagado.");
        } else {
            System.out.println("[!] El " + nombre + " ya fue apagado.");
        }

    }

    void mostrarEstado(){
        System.out.println("> " + nombre);
        if(encendido){
            System.out.println("\t -Estado: Encendido a " + velocidad + "rpm");
            System.out.println();
        } else {
            System.out.println("\t -Estado: Apagado");
            System.out.println();
        }

    }
}
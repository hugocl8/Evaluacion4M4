import java.util.Scanner;
public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;

    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca ;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        encendido = false;
    }

    public void encender() {
        if (encendido){
            System.out.println("No se puede hacer esta acción, porque su auto ya esta encendido.");
        }else{
            encendido = true;
            System.out.println("Se ha encendido el auto");
        }
    }
    public void apagar() {
        if (!encendido){
            System.out.println("No se puede apagar, porque su auto ya esta apagado");
        }else {
            encendido = false;
            System.out.println("Se ha apagado el auto");
        }
    }
    public void acelerar() {
        if (!encendido){
            System.out.println("No se puede acelerar, el auto está apagado");
        }else {
            System.out.println("El auto está acelerando");
        }
    }
    public void mostrarDatos(){
        System.out.println("Felicidades por su nuevo auto [marca = " + marca + ", modelo = " + modelo +
                ", color = " + color + ", velocidadMaxima= " + velocidadMaxima + ", encendido = " + encendido + "]");
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public boolean isEncendido(){
        return encendido;
    }
}
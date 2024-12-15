/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4proyecto;

import java.util.Calendar;

/**
 *
 * @author Juan Jose
 */
public class BaristaReserva {
    private String Bebida;
    private Calendar horaBebida;
    private Calendar diaBebida;
    
    public BaristaReserva() {
        this.Bebida = "";
        this.horaBebida = Calendar.getInstance();
        this.diaBebida = Calendar.getInstance();
    }
    public String getBebida() {
        return Bebida;
    }
    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }
    public Calendar getHoraBebida() {
        return horaBebida;
    }
    public void setHoraBebida(int hora, int minuto){
        horaBebida.set(Calendar.HOUR_OF_DAY, hora);
        horaBebida.set(Calendar.MINUTE, minuto);
        horaBebida.set(Calendar.SECOND, 0);    
    }
    public Calendar getDiaBebida() {
        return horaBebida;
    }
    public void setDiaBebida(int año, int mes, int dia) {
        diaBebida.set(Calendar.YEAR, año);
        diaBebida.set(Calendar.MONTH, mes-1);
        diaBebida.set(Calendar.DAY_OF_MONTH, dia);
    } 
    public void mostrarMenu() {
        System.out.println("Menu de bebida:");
        System.out.println("1. Cafe normal");
        System.out.println("2. Capuchino");
        System.out.println("3. Capuchino com vainilla");
        System.out.println("4. Chocolate");
        System.out.println("5. Moka");
        System.out.println("6. Te chai");
        System.out.println("7. Cafe trio");
    }
    private String seleccionaraBebida(int opcion) {
        switch (opcion) {
            case 1:
                return "cafe normal";
            case 2:
                return "capuchino";
            case 3:
                return "capuchino con vainilla";
            case 4:
                return "chocolate";
            case 5:
                return "moka";
            case 6:
                return "te chai";
            case 7:
                return "cafe trio";
            default:
                return "option no valida";
        }
    }
    public void mostrartPedido(){
        System.out.println("tu bebida es:"+ Bebida);
        System.out.println("Se entregará el día: " + diaBebida.get(Calendar.DAY_OF_MONTH) + "/"
                + (diaBebida.get(Calendar.MONTH) + 1) + "/" + diaBebida.get(Calendar.YEAR));
        System.out.println("A la hora: " + horaBebida.get(Calendar.HOUR_OF_DAY) + ":"
                + horaBebida.get(Calendar.MINUTE));
    }
    public String obtenerDatosReserva(){
        return Bebida + ", " + horaBebida.get(Calendar.HOUR_OF_DAY) + ":" + horaBebida.get(Calendar.MINUTE)
                + ", " + diaBebida.get(Calendar.DAY_OF_MONTH) + "/" + (diaBebida.get(Calendar.MONTH) + 1) + "/" + diaBebida.get(Calendar.YEAR);
    }
}

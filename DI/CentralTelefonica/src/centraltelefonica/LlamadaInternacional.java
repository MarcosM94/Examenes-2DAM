/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraltelefonica;

/**
 *
 * @author Usuario DAM 2
 */
public class LlamadaInternacional extends Llamada{
    String franja;

    public LlamadaInternacional(int nOrigen, int nDestino, int duracion, String franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
        caluclarCoste();
    }

    @Override
    public void caluclarCoste() {
        switch (franja) {
            case "A":
                coste = duracion*0.50;
                break;
            case "B":
                coste = duracion*0.70;
                break;
            case "C":
                coste = duracion*1;
                break;
            default:
                coste = 0;
                break;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Tarifa: %s %n",franja);
    }
}
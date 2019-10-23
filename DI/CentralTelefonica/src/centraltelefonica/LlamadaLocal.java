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
public class LlamadaLocal extends Llamada{


    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
        caluclarCoste();
    }

    @Override
    public void caluclarCoste() {
        coste = 0;
    }
}
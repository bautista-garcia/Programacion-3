package prog3.grafos.Respuestas;

import prog3.grafos.Vertice;
import prog3.listagenerica.ListaGenerica;

public class RutaMinima {
    private ListaGenerica<String> caminoMinimo;
    private boolean boletoUnico;

    private int distancia;

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public RutaMinima(boolean boletoUnico, int distancia){
        this.boletoUnico = boletoUnico;
        this.distancia = distancia;
    }

    public RutaMinima(){

    }


    public void setBoletoUnico(boolean boletoUnico) {
        this.boletoUnico = boletoUnico;
    }

    public void setCaminoMinimo(ListaGenerica<String> caminoMinimo) {
        this.caminoMinimo = caminoMinimo;
    }

    public ListaGenerica<String> getCaminoMinimo() {
        return caminoMinimo;
    }

    public boolean isBoletoUnico() {
        return boletoUnico;
    }
}

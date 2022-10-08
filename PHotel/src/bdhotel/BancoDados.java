package bdhotel;
import java.util.ArrayList;
import java.util.List;

import model.Aposento;

public class BancoDados {
    private static List<Aposento> aposentos = new ArrayList<Aposento>();
     
    /*
     * Aposentos
     */

    public static List<Aposento> getAposentos() {
        return aposentos;
    }

    public static void addAposento(Aposento aposento){
        aposentos.add(aposento);
    }

    public static void atualizaAposento(int linhaSelecionada, Aposento aposento){
        aposentos.set(linhaSelecionada, aposento);
    }

    public static void removeAposento(Aposento aposento){
        aposentos.remove(aposento);
    }
}

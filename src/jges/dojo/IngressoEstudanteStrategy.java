package jges.dojo;

import java.util.Calendar;

public class IngressoEstudanteStrategy implements IngressoStrategy {

    private static final double VALOR_INGRESSO = 8;
    
    public IngressoEstudanteStrategy() {
    }

    @Override
    public double no(int diaDaSemana) {
        return na(diaDaSemana);
    }

    @Override
    public double na(int diaDaSemana) {
        switch(diaDaSemana) {
            case Calendar.MONDAY: return VALOR_INGRESSO * 0.90;
            case Calendar.TUESDAY: return VALOR_INGRESSO * 0.95;
            case Calendar.WEDNESDAY: return VALOR_INGRESSO * 0.5;
            case Calendar.THURSDAY: return VALOR_INGRESSO * 0.7;
        
            default: return VALOR_INGRESSO;
        }
            
    }
    
}

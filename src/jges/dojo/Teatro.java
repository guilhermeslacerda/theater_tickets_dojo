package jges.dojo;

public class Teatro {
    
    public double valorIngresso(int diaDaSemana){
        return 7.2;
    }

    public IngressoStrategy ingressoPara(Estudante estudante) {
        return new IngressoEstudanteStrategy();
    }

}

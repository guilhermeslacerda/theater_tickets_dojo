package jges.dojo;

public class Teatro {
    
    public IngressoStrategy ingressoPara(Estudante estudante) {
        if(estudante instanceof Estudante)
          return new IngressoEstudanteStrategy();
        else 
          return null;
    }

}

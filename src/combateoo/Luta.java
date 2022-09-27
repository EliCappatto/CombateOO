package combateoo;

import java.util.Random;



public class Luta {
    //Atributos
    private Lutadora desafiada;
    private Lutadora desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos Públicos
    public void marcarLuta(Lutadora l1, Lutadora l2){
        if(l1.getCategoria().equals(l2.getCategoria())
           && l1 != l2){
            this.aprovada = true;
            this.desafiada = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiada = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADA ###");
           this.desafiada.apresentar();
            System.out.println("### DESAFIANTE ###");
           this.desafiante.apresentar();
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);//0 1 2 
           switch(vencedor) {
               case 0: //Empate
                   System.out.println("Empatou!");
                   this.desafiada.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
               case 1: //Desafiante vence
                   System.out.println("Vitória da " + this.desafiada.getNome());
                   this.desafiada.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
               case 2: //Desafiante vence 
                   System.out.println("Vitória da " + this.desafiante.getNome());
                   this.desafiante.ganharLuta();
                   this.desafiada.perderLuta();
                   break;
           }
           
        }else{
            System.out.println("A luta não pode acontecer!");
        }
        
         
    }
    //Métodos Especiais

    public Lutadora getDesafiada() {
        return desafiada;
    }

    public void setDesafiada(Lutadora desafiada) {
        this.desafiada = desafiada;
    }

    public Lutadora getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadora desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

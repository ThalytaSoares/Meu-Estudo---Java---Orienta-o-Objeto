
package aula07;

import java.util.Random;

public class Luta {
  private Lutador Desafiado;
  private Lutador Desafiante;
  private int Rounds;
  private boolean Aprovada;
  
public void marcarLuta(Lutador L1,Lutador L2){
    if(L1.getCategoria().equals (L2.getCategoria())&& L1 != L2){
        this.Aprovada = true;
        this.Desafiado = L1;
        this.Desafiante = L2;
    }
     else {
        this.Aprovada = false;
        this.Desafiado = null;
        this.Desafiante = null;
             
             }
       }
    public void Lutar(){
       if(this.Aprovada){
         this.Desafiado.apresentar();
         this.Desafiante.apresentar();
         
         Random aleatorio = new Random();
         int vencedor = aleatorio.nextInt(3);
         switch(vencedor){
             case 0:
                 System.out.println("Empatou");
                 this.Desafiado.empatarLuta();
                 this.Desafiante.empatarLuta();
                 break;
             case 1:
                 System.out.println("Vitória do"+ this.Desafiado.getNome());
                 this.Desafiado.ganharLuta();
                 this.Desafiante.perderLuta();
                 break;
             case 2:
                 System.out.println("Vitória do"+ this.Desafiante.getNome());
                 this.Desafiante.ganharLuta();
                 this.Desafiado.perderLuta();
                 break;
         }
       }else{
           System.out.println("A luta não pode acontecer");
       }
    }

    public Lutador getDesafiado() {
        return Desafiado;
    }

    public void setDesafiado(Lutador Desafiado) {
        this.Desafiado = Desafiado;
    }

    public Lutador getDesafiante() {
        return Desafiante;
    }

    public void setDesafiante(Lutador Desafiante) {
        this.Desafiante = Desafiante;
    }

    public int getRounds() {
        return Rounds;
    }

    public void setRounds(int Rounds) {
        this.Rounds = Rounds;
    }

    public boolean isAprovada() {
        return Aprovada;
    }

    public void setAprovada(boolean Aprovada) {
        this.Aprovada = Aprovada;
    }
}

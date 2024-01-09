
package disciplina;

public class Aula {
  private String Nome;
  private  int Duracao;
  private String Prof;
  private boolean Acontecendo;
    
   public void Status(){
        System.out.println("Aula: " + this.Nome);
        System.out.println("Duração da aula: " + this.Duracao);
        System.out.println("Professor: " + this.Prof);
        System.out.println("Está Rolando: " + this.Acontecendo);
    }
  public  void comecar(){
        if(this.Duracao == 30) {
            System.out.println("A aula foi completa");
        }else
            System.out.println("A aula acabou antes");
    }
    public void terminar(){
        if(this.Acontecendo == true) {
            System.out.println("A aula ainda está acontecendo");
        }else
            System.out.println("A aula acabou ou não começou");
        }
   public void cancelar(){
      if(this.Prof == null) {
            System.out.println("A aula foi cancelada");
        }
       }
}

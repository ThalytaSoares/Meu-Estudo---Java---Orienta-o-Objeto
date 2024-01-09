package aula02;

public class Bolo {
    String ingrediente;
    String sabor;
    int tamanho;
    boolean pronto;
    
    void Status(){
        System.out.println("Ingrediente do Bolo: " + this.ingrediente);
        System.out.println("Qual sabor: " + this.sabor);
        System.out.println("Tamanho do bolo: " + this.tamanho);
        System.out.println("Está pronto: " + this.pronto);
    }
    void Assar(){
     if(this.pronto == true){
         System.out.println("Pode Assar o bolo");
     }else
         System.out.println("O bolo ainda não está pronto");
    }
    void Comer(){
        if(this.pronto == true){
         System.out.println("Pode comer o bolo");
     }else
         System.out.println("O bolo ainda não está pronto");
    }
    void Rechear(){
        if(this.tamanho == 10){
            System.out.println("Pode rechear o bolo");
        }else
            System.out.println("O bolo ainda está assando");
    }
}


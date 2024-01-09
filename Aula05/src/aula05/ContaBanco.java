
package aula05;

public class ContaBanco {
    public int NumConta;
    protected String Tipo;
    private String Dono;
    private float Saldo;
    private boolean Status;
    
 public void estadoAtual(){
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
    
}        
public void abrirConta(String T){
    
    this.setTipo(T);
    this.setStatus(true);
    if (T == "CC") {
       this.setSaldo(50); 
    } else if(T == "CP"){
        this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso");
    }
public void fecharConta(){
    
    if(this.getSaldo() > 0){
        System.out.println("Conta com dinheiro");
    }
    else if (this.getSaldo() < 0){
        System.out.println("Conta em débito");
    }
     else{
       this.setStatus(false); 
        System.out.println("Conta fechada com sucesso");
    }
}
public void depositar(float V){
    
    if (this.getStatus()) {
        this.setSaldo(this.getSaldo() + V);
        System.out.println("Depósito realizado na conta de " + this.getDono());
    } 
    else {
        System.out.println("impossível depositar");
    }
}
public void sacar(float V){
    if(this.getStatus()){
      if(this.getSaldo() >= V){
        this.setSaldo(this.getSaldo() - V);
        System.out.println("Saque realizado na conta de " + this.getDono());
      }else{
    System.out.println("saldo insuficiente");
}
    }else {
        System.out.println("Impossível sacar");
    }
}
  
public void pagarMensal(){
      float V = 0;    
    if(this.getTipo() == "CC"){
         V = 12;
     }else if(this.getTipo() == "CP"){
          V = 20;
     }
    if(this.getStatus()){
        this.setSaldo(this.getSaldo() - V);
        System.out.println("mensalidade paga");
       }else {
           System.out.println("impossível pagar conta fechada");
        } 
}
public ContaBanco(){
       this.setSaldo(0);
       this.setStatus(false); 
    }

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

}

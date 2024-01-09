
package aula03;

public class Caneta {
    
  public String Modelo;
  private int Ponta;
  private boolean tampada;
  private String Cor;

    public Caneta(String Modelo, int Ponta) {
        this.Modelo = Modelo;
        this.Ponta = Ponta;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPonta() {
        return Ponta;
    }

    public void setPonta(int Ponta) {
        this.Ponta = Ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
  
  
}

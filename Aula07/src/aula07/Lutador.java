
package aula07;

public class Lutador {
  private String Nome;
  private String Nacionalidade;
  private int Idade;
  private float Altura;
  private float Peso;
  private String Categoria;
  private int Vitorias;
  private int Derrotas;
  private int Empates;
  
  public void apresentar(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Nacionalidade: " + this.getNacionalidade());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Altura: " + this.getAltura());
    System.out.println("Peso: " + this.getPeso()); 
    System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());     
  }
  public void status(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Categoria: " + this.getCategoria());
    System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());
      
  }
  public void ganharLuta(){
      this.setVitorias(getVitorias() + 1);
  }
  public void perderLuta(){
      this.setDerrotas(getDerrotas() + 1);
  }
  public void empatarLuta(){
      this.setEmpates(getEmpates() + 1);
  }
  public Lutador(String No, String Na, int ID, float Al, float Pe, int Vi, int De, int Em ){
  
  this.Nome = No;
  this.Nacionalidade = Na;
  this.Idade = ID;
  this.Altura = Al;
  this.setPeso(Pe);
  this.Vitorias = Vi;
  this.Derrotas = De;
  this.Empates = Em;
  
  }  

    public String getNome() {
        return Nome;
    }

    public void setNome(String No) {
        this.Nome = No;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Na) {
        this.Nacionalidade = Na;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int ID) {
        this.Idade = ID;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Al) {
        this.Altura = Al;
    }
    public String getCategoria() {
        return Categoria;
    }

    private void setCategoria() {
        
        if (Peso < 52.2){
            Categoria = "inválido";
        }
            else if (Peso <= 70.3){
              Categoria = "Leve";
                    }
        else if (Peso <= 83.9){
              Categoria = "Médio";
                    }
        else if (Peso <= 120.2){
              Categoria = "Pesado";
                    }
        else{
            Categoria = "Inválido";
        }
    }
    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Pe) {
        this.Peso = Pe;
        this.setCategoria();
    }
    public int getVitorias() {
        return Vitorias;
    }

    public void setVitorias(int Vi) {
        this.Vitorias = Vi;
    }

    public int getDerrotas() {
        return Derrotas;
    }

    public void setDerrotas(int De) {
        this.Derrotas = De;
    }

    public int getEmpates() {
        return Empates;
    }

    public void setEmpates(int Em) {
        this.Empates = Em;
    }
  
}


package aula06;

public class ControleRemoto implements Controlador {
    private int Volume;
    private boolean Ligado;
    private boolean tocando;
 
public ControleRemoto(){
  this.Volume = 50;
  this.Ligado = false;
  this.tocando = false;  
}

    private int getVolume() {
        return Volume;
    }

    private void setVolume(int Volume) {
        this.Volume = Volume;
    }

    private boolean getLigado() {
        return Ligado;
    }

    private void setLigado(boolean Ligado) {
        this.Ligado = Ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print
        
        ("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
    }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
    }
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
    }
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
    }
    }
    @Override
    public void Play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void Pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        
    }

    }
}

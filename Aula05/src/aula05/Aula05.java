package aula05;

public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco P1 = new ContaBanco();
        P1.setNumConta(123456);
        P1.setDono("Jubileu");
        P1.abrirConta("CP");
        //P1.fecharConta();
        P1.depositar(300);
        P1.pagarMensal();
        //P1.sacar(10);
        P1.estadoAtual();
        //ContaBanco P2 = new ContaBanco();
        //P2.setNumConta(52634);
        //P2.setDono("Creuza");
        //P2.abrirConta("CP");
        
        
    }
    
}

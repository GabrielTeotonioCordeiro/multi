package principal;

public class Principal {

    public static void main(String args[]) {
        System.out.println("Antes da Janela:" + Thread.activeCount());
        MultiplaThread janela1 = new MultiplaThread();
        janela1.setVisible(true);
        MultiplaThread janela2 = new MultiplaThread();
        janela2.setVisible(true);
        System.out.println("Depois da Janela:" + Thread.activeCount());
    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        int pUm = leitor.nextInt();

        System.out.println("Digite o segundo parametro");
        int pDois = leitor.nextInt();

        try {
            contar(pUm, pDois);
        }
        catch (ParametrosInvalidosException e){
            e.printStackTrace();
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        leitor.close();
    }

    static void contar(int pUm, int pDois) throws ParametrosInvalidosException {
        if (pUm > pDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = pDois - pUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("imprimindo o numero: " + i);
        }
    }
}

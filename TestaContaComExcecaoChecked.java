
public class TestaContaComExcecaoChecked {

    public static void main (String[] args) {

        Conta conta = new Conta ();

        try {

            conta.deposita ();

        } cacth (MinhaExcecao ex) {

            System.out.println("Tratamento...");

        }

    }

}
import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        int numero1= input.nextInt();
        System.out.println("inserisci il secondo numero");
        int numero2= input.nextInt();
        System.out.println("inserisci il terzo numero");
        int numero3= input.nextInt();

        if (numero1 < numero2 && numero2<numero3){
            System.out.println("La sequenza è crescente");
        }
        else if (numero3<numero2&&numero2<numero1){
            System.out.println("La sequenza è decrescente");
        }
        else {                                        //Non c'è bisogno qui di specificare la condizione: se non è crescente e non è decrescente è per forza "neither" a prescindere!
            System.out.println("neither");
        }

    }
}

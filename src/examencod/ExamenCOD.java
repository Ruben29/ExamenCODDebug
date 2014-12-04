package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iN = 11;
        if (metodoMio(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoMio(x)) {
                System.out.print(x + " ");
            }
        }
    }
// - Para variable=16 y j=2, aux=false
// - Para '(aux) && (j!=variable)' variable=22 y para j=21, variable aux=true ya que "if (variable % j == 0)" no se cumple.
    
    public static boolean metodoMio(int variable) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}

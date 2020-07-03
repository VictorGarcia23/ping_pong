

public class Main {
    public static void main(String[] args) {
        int num = 20;
        int contador = 1;

        while (contador <= num) {
            if (contador %5 == 0 ) {
                System.out.println("Ping");

            }
            else if (contador %10 == 0 && (contador %2 == 0)) {
                System.out.println("Pong");


            }
            else {
                System.out.println(contador);
            }
                contador = contador + 1;

        }
    }


}

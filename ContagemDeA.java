import java.util.Scanner;

public class ContagemDeA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
       
        int contador = 0;
       
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++; 
            }
        }
    
        System.out.println("A letra 'a' ocorre " + contador + " vezes na string.");
        scanner.close();}
}

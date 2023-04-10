import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double Celsius, Fahrenheit;

        System.out.println("Digite a temperatura em celsius: ");
        Celsius = entrada.nextDouble();

        Fahrenheit = (9 * Celsius + 160 ) / 5;
        System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
    }
}

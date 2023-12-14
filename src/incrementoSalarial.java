import java.util.Scanner;

public class incrementoSalarial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float salario;
        float incremento;

        System.out.println("Ingrese el salario del empleado:");
        salario = scanner.nextFloat();

        if (salario<15000) {
            incremento = (float) (salario * .20);
        } else {
            incremento = (float) (salario * .15);
        }
        System.out.println("El incremento sera de : "+incremento);
    }
}
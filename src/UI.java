import java.util.Scanner;

public class UI {

    public static void main(String[] args) {

        Animal tem_animal;
        adoptionFactory factory = new adoptionFactory();

        System.out.println("Centro de adopciones de animales");
        System.out.println("Opciones de adopación");
        System.out.println("\n 1.) Gato ");
        System.out.println("\n 2.) Perro");
        System.out.println("\n¿Qué animal deseas adoptar?\n");

        Scanner s = new Scanner(System.in);
        tem_animal = factory.askPet(s.nextLine());

        if (tem_animal != null) {
            tem_animal.printAdopted();
        } else {
            System.out.println("Animal incorrecto incorrectos");
        }
    }
}

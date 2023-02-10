

public class UI {
    
    public static void main(String[] args) {

        Animal tem_animal;
        adoptionFactory factory; 
        
        System.out.println("Centro de adopciones de animales");
        System.out.println("Opciones de adopación");
        System.out.println("\n 1.) ");
        System.out.println("\n 2.) ");
        System.out.println("\n 3.) ");

        if (tem_animal.getNombre() == "Gato") {
			tem_animal = factory.askPet(tem_animal.getTipoanimal());
			tem_animal.printAdopted();
		} else {
			System.out.println("Animal incorrecto incorrectos");
		}
    }
}

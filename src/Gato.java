public class Gato extends Animal {

    @Override
    public void printAdopted() {
        System.out.println("Has adoptado un gato");
        System.out.println("Su nombre es " + getNombre());
    }

}

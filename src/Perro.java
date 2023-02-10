public class Perro extends Animal {

    @Override
    public void printAdopted() {
        System.out.println("Has adoptado un perro");
        System.out.println("Su nombre es " + getNombre());
    }

}
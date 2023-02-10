public class adoptionFactory {
    // Usamos askPet método para obtener objeto la mascota seleccionada
    public Animal askPet(String petType) {
        if (petType == null) {
            return null;
        }
        if (petType.equalsIgnoreCase("Gato")) {
            return new Gato();
        } else if (petType.equalsIgnoreCase("Perro")) {
            return new Perro();
        }
        return null;
    }
}

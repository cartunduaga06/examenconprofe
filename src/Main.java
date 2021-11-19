public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Carlos","Artunduaga", "123");
        Examen parcial1 = new Parcial(alumno1,"POO","PROGRAMACION",5,3,0);
        System.out.println(parcial1.estaAProbado());
        System.out.println();
    }
}

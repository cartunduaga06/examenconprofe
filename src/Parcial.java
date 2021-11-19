public class Parcial extends Examen{
    private int numeroUnidad;
    private int reintentos;

    public Parcial(Alumno alumno, String tema, String enunciado, double nota, int numeroUnidad, int reintentos) {
        super(alumno, tema, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.reintentos = reintentos;
    }

    public String seguirRecuperando(){
        if(numeroUnidad>3){
            return "se puede recurperar 2 veces";
        } else {
            return "se puede recuperar 3 veces";
        }
    }

    @Override
    public boolean estaAProbado() {

        return  super.getNota()>4;
    }

}

public class Final extends Examen{
    private double notaOral;
    private String descripcionOral;

    public Final(Alumno alumno, String tema, String enunciado, double nota, double notaOral, String descripcionOral) {
        super(alumno, tema, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public boolean estaAProbado() {
        return super.getNota()>4;
    }


}

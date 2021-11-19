public abstract class Examen {
    private Alumno alumno;
    private String tema;
    private String enunciado;
    private double nota;

    public Examen(Alumno alumno, String tema, String enunciado, double nota) {
        this.alumno = alumno;
        this.tema = tema;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public abstract boolean estaAProbado();

    public abstract String seguirRecuperando();

}

public class Final extends Examen implements  Compa{
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

    @Override
    public String seguirRecuperando() {
        return null;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public String getDescripcionOral() {
        return descripcionOral;
    }

    public double promedio(){
        return (double) ((getNotaOral() + super.getNota())/2);
    }

    @Override
    public double compareTo(Object o){
        Final final1 = (Final) o;
        double promedioo = final1.promedio();
        return this.promedio() - promedioo;
            }




}

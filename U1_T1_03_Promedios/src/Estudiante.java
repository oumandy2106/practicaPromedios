public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota(int posicion, double nota) {
        notas[posicion] = nota;
    }

    public double getNota(int posicion) {
        return notas[posicion];
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public boolean aprobar() {
        return calcularPromedio() >= 70.0;
    }
}

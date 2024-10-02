public class Alumno {

    //Atributos ID alumno, Nombre completo, edad, tipo de membresia
    private int idAlumno;
    private String nombreCompleto;
    private int edadAlumno;
    private String tipoMembresia;

    //Constructor
    public Alumno(int idAlumno, String nombreCompleto, int edadAlumno, String tipoMembresia){
        this.tipoMembresia = tipoMembresia;
        this.idAlumno = idAlumno;
        this.edadAlumno = edadAlumno;
        this.nombreCompleto = nombreCompleto;
    }

    //get
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public int getEdadAlumno() {
        return edadAlumno;
    }
    public int getIdAlumno() {
        return idAlumno;
    }
    public String getTipoMembresia() {
        return tipoMembresia;
    }

    //set
    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    //toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "nombre alumno " + nombreCompleto + "id del alumno " + idAlumno + "edad " + edadAlumno + " tipo de Membresia" + tipoMembresia;
    }
}
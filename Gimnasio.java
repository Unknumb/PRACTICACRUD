import java.util.ArrayList;
import java.util.Scanner;
public class Gimnasio {
    //Atributos lista
    private ArrayList<Alumno> alumnos;
    //scanner
    private Scanner scanner;

    //Constructor
    public Gimnasio(){
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //Metodo agregar alumno
    public void agregarAlumnos(){

        System.out.println("Ingrese id del alumno: ");
        int idAlumno = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre completo del alumno");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Ingrese edad del alumno: ");
        int edadAlumno = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese membresia del alumno: ");
        String tipoMembresia = scanner.nextLine();

        //Agregar alumno a la lista
        Alumno alumno = new Alumno(idAlumno, nombreCompleto, edadAlumno, tipoMembresia);
        alumnos.add(alumno);
        System.out.println("El alumno: " + alumno + " ha sido agregado.");
    }
    //Metodo mostrar alumnos
    public void mostrarAlumnos(){
        // revisar si la lista esta vacio o no 
        if(alumnos.isEmpty()){
            System.out.println("No hay alumnos para mostrar.");
        }else{
            //y si no esta vacia 
            for(Alumno alumno : alumnos){
                System.out.println(alumno);
            }
        }
    }
    //Metodo actualizar a un alumno
    public void actualizarAlumno(){
        System.out.println("Ingrese el nombre del alumno a actualizar: ");
        int idAlumno = scanner.nextInt();
        scanner.nextLine();

        //buscar el id 
        for(Alumno alumno : alumnos){
            //busco en la lista si el alumno ingresado por el usuario esta
            if(alumno.getIdAlumno()==idAlumno){
                System.out.println("Ingrese el nuevo nombre del alumno:");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese la nueva edad del alumno:");
                int nuevaEdad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese la nueva membresía del alumno:");
                String nuevaMembresia = scanner.nextLine();

                alumno.setNombreCompleto(nuevoNombre);
                alumno.setEdadAlumno(nuevaEdad);
                alumno.setTipoMembresia(nuevaMembresia);
                System.out.println("Alumno actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
    
    //Metodo eliminar 
    public void eliminarAlumno() {
        System.out.println("Ingrese el ID del alumno que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Alumno alumnoAEliminar = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getIdAlumno() == id) {
                alumnoAEliminar = alumno;
                break;
            }
        }

        if (alumnoAEliminar != null) {
            alumnos.remove(alumnoAEliminar);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

}

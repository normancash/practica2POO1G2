import data.DataBase;
import model.Alumno;
import model.Carrera;
import servicio.IDaoAlumnos;
import servicio.ImplDAOAlumnos;

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(1,"Ingeniero en Sistema"
                ,"FIA","");
        Alumno a = new Alumno("001230874","Carlos",""
                ,"Lopez","",carrera);
        IDaoAlumnos dao = new ImplDAOAlumnos();
        dao.crearAlumno(a);
        a.setSegundoNombre("Jose");
        a.setSegundoApellido("Marin");
        dao.actualizarAlumno(a);
        imprimirAlumnos(dao);
    }

    private static void imprimirAlumnos(IDaoAlumnos d) {
        for (Alumno a : d.consultarTodos()){
            System.out.println(a);
        }
    }

}
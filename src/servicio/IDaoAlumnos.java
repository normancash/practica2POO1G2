package servicio;

import model.Alumno;

import java.util.List;

public interface IDaoAlumnos {

    public void crearAlumno(Alumno alumno);

    public void borrarAlumno(Alumno alumno);

    public List<Alumno> consultarTodos();

    public Alumno buscarPorCif(String cif);

    public void actualizarAlumno(Alumno a1);
}

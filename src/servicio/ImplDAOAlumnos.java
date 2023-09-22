package servicio;

import data.DataBase;
import model.Alumno;

import java.util.Collections;
import java.util.List;

public class ImplDAOAlumnos implements IDaoAlumnos{

    @Override
    public void crearAlumno(Alumno alumno) {
        DataBase.listado.add(alumno);
    }

    @Override
    public void borrarAlumno(Alumno alumno) {
            DataBase.listado.remove(alumno);
    }

    @Override
    public List<Alumno> consultarTodos() {
        if (DataBase.listado.size() == 0){
            return DataBase.listado;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public Alumno buscarPorCif(String cif) {
        if (("".equals(cif) ) || (cif.length() == 0)) {
            return null;
        }
        if (!DataBase.listado.isEmpty()) {
            for (Alumno a : DataBase.listado) {
                if (a.getCif().equals(cif)) {
                    return a;
                }
            }
        }
        return null;
    }

    @Override
    public void actualizarAlumno(Alumno a1) {
        Alumno a = buscarPorCif(a1.getCif());
        a.setPrimerNombre(a1.getPrimerNombre());
        a.setPrimerApellido(a1.getPrimerApellido());
        a.setSegundoNombre(a1.getSegundoNombre());
        a.setCarrera(a1.getCarrera());
        a.setSegundoApellido(a1.getSegundoApellido());
    }


}

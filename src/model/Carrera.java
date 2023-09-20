package model;

public class Carrera {

    private Integer id;

    private String nombre;

    private String facultad;

    private String descripcion;

    public Carrera(Integer id, String nombre, String facultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
        this.descripcion = descripcion;
    }

    public Carrera() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

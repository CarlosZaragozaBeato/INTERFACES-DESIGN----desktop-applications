/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemento;

/**
 *
 * @author SalvioQ
 * define cada elemento AlumnoDetalle a ser leido / escrito del fichero .CSV
 * @version 0.1
 * 
 */
public class AlumnoDetalle {
    

    private String nombre;
    private String apellidos;
    private String provincia;
    private String curso;
    private String codigoPostal;
    private String direccion;
    private String mail;
    private String fecha;
    

    public AlumnoDetalle(String nombre, 
            String apellidos,
            String provincia, 
            String curso, 
            String codigoPostal, 
            String direccion,
            String fecha,
            String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.curso = curso;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.fecha = fecha;
        this.mail = mail;
    }

    public AlumnoDetalle() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
    public String getProvincia() {
        return provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String ape) {
        this.apellidos = ape;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cur) {
        this.curso = cur;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", provincia=" + provincia + ", curso=" + curso + ", codigoPostal=" + codigoPostal + ", direccion = "+direccion + ", mail= "+mail+", fecha= "+fecha;
    }
}
    

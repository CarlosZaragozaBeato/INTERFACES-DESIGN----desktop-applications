/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import elemento.AlumnoDetalle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author usumaniana
 */
public class CSVReader {
        
    public ArrayList<AlumnoDetalle> readCsvFile(String filePath) throws Exception {
        ArrayList<AlumnoDetalle> listaAlumnos = new ArrayList();
 
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = null;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            //Skip the header row
            if(count == 0) {
                count++;
                continue;
            }
            // funcion para analizar separando por comas "CSV"
            String[] lineContents = line.split(",");
            AlumnoDetalle alumno = new AlumnoDetalle();
            alumno.setNombre(lineContents[0]);
            alumno.setApellidos(lineContents[1]);
            alumno.setProvincia(lineContents[2]);
            alumno.setCurso(lineContents[3]);
            alumno.setCodigoPostal(lineContents[4]);
            alumno.setDireccion(lineContents[5]);
            alumno.setFecha(lineContents[6]);
            alumno.setMail(lineContents[7]);
            listaAlumnos.add(alumno);
            count++;
        }
        return listaAlumnos;
    }
}

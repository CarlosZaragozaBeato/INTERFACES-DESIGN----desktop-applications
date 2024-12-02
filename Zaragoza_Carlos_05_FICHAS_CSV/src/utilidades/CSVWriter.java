/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import elemento.AlumnoDetalle;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usumaniana
 */
public class CSVWriter {

    public void writeToFile(String fileName, ArrayList<AlumnoDetalle> listaAlumno) throws Exception {

        File ficheroCsv = new File(fileName);

        try (
                 FileWriter writer = new FileWriter(ficheroCsv)) {
            BufferedWriter bwriter = new BufferedWriter(writer);
            bwriter.write("NOMBRE, APELLIDOS, PROVINCIA, CURSO, CODIGO POSTAL, DIRECCION, FECHA, MAIL");
            bwriter.newLine();

            for (AlumnoDetalle alumn : listaAlumno) {

                bwriter.write(alumn.getNombre() + ",");
                bwriter.write(alumn.getApellidos() + ",");
                bwriter.write(alumn.getProvincia() + ",");
                bwriter.write(alumn.getCurso() + ",");
                bwriter.write(alumn.getCodigoPostal() + ",");
                bwriter.write(alumn.getDireccion()+",");
                bwriter.write(alumn.getFecha()+ ",");
                bwriter.write(alumn.getMail());
                bwriter.newLine();
            }

            writer.flush();
            bwriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

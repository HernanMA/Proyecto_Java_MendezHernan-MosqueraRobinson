/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaproject;

import com.mycompany.model.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hernan
 */
public class JavaProject {

    public static void main(String[] args) {
        Conexion conexionDB = Conexion.getInstance();
        Connection conexion = null;

        try {
            conexion = conexionDB.conectar();

        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            conexionDB.cerrarConexion(conexion);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

/**
 *
 * @author hernan
 */
import com.mycompany.model.Event;
import com.mycompany.model.EventDAO;
import com.mycompany.view.Events;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class EventController {
    private EventDAO eventDAO;
    private Events Events; // Tu JFrame

    public EventController(Events eventsView) {
        this.eventDAO = new EventDAO();
        this.Events = eventsView;
    }

    public boolean createEvent(String name, String dateStr, int organizerId, int ageClassificationId, String status) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime dateTime;

    try {
        dateTime = LocalDateTime.parse(dateStr, formatter);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(Events, "Formato de fecha incorrecto. Use 'yyyy-MM-dd HH:mm:ss'.");
        return false;
    }

    try {
        boolean success = eventDAO.createEvent(name, dateStr, organizerId, ageClassificationId, status);
        if (success) {
            System.out.println("Evento creado exitosamente.");
            Events.updateTable(); 
        }
        return success;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(Events, e.getMessage()); // Muestra el mensaje de error
        return false;
    }
}







    public boolean updateEvent(int id, String name, String dateStr, int organizerId, int ageClassificationId, String status) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime;

        try {
            dateTime = LocalDateTime.parse(dateStr, formatter); // Parsea la fecha y hora desde la cadena
        } catch (DateTimeParseException e) {
            System.err.println("Error al parsear la fecha y hora: " + e.getMessage());
            return false;
        }

        Event event = new Event(name, dateTime, organizerId, ageClassificationId, status);

        return eventDAO.updateEvent(event); // Llama al método de instancia de EventDAO
    }

    public boolean deleteEvent(int id) {
        return eventDAO.deleteEvent(id); // Llama al método de instancia de EventDAO
    }
}

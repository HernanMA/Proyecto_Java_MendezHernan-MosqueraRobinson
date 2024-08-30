/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hernan
 */
public class DishDAO {

    public List<Dish> getAllDishes() {
        List<Dish> dishes = new ArrayList<>();
        String query = "SELECT id, restaurant_id, name, price, type, preparation_time FROM Dishes";

        try (Connection con = Conexion.getInstance().conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Dish dish = new Dish(
                    rs.getInt("id"),
                    rs.getInt("restaurant_id"),
                    rs.getString("name"),
                    rs.getBigDecimal("price"),
                    rs.getString("type"),
                    rs.getInt("preparation_time")
                );
                dishes.add(dish);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dishes;
    }

    public List<DishIngredient> getAllDishIngredients() {
        List<DishIngredient> ingredients = new ArrayList<>();
        String query = "SELECT id, name, available_quantity FROM Ingredients";

        try (Connection con = Conexion.getInstance().conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                DishIngredient ingredient = new DishIngredient(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("available_quantity")
                );
                ingredients.add(ingredient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredients;
    }
    
    public void buyDish(int dishId) throws SQLException {
    String getIngredientsQuery = "SELECT ingredient_id, quantity_required FROM DishIngredients WHERE dish_id = ?";
    String updateIngredientsQuery = "UPDATE Ingredients SET available_quantity = available_quantity - ? WHERE id = ?";

    try (Connection con = Conexion.getInstance().conectar();
         PreparedStatement getIngredientsStmt = con.prepareStatement(getIngredientsQuery);
         PreparedStatement updateIngredientsStmt = con.prepareStatement(updateIngredientsQuery)) {

        getIngredientsStmt.setInt(1, dishId);

        try (ResultSet rs = getIngredientsStmt.executeQuery()) {
            while (rs.next()) {
                int ingredientId = rs.getInt("ingredient_id");
                int quantityRequired = rs.getInt("quantity_required");

                System.out.println("Restando " + quantityRequired + " unidades del ingrediente con ID " + ingredientId);

                updateIngredientsStmt.setInt(1, quantityRequired);
                updateIngredientsStmt.setInt(2, ingredientId);
                
                int affectedRows = updateIngredientsStmt.executeUpdate();
                
                if (affectedRows > 0) {
                    System.out.println("Se actualizó la cantidad del ingrediente con ID " + ingredientId);
                } else {
                    System.err.println("No se pudo actualizar la cantidad del ingrediente con ID " + ingredientId);
                }
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Error al realizar la compra", e);
    }
}

}

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
        String query = "SELECT dish_id, ingredient_id, quantity_required FROM DishIngredients";

        try (Connection con = Conexion.getInstance().conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                DishIngredient ingredient = new DishIngredient(
                    rs.getInt("dish_id"),
                    rs.getInt("ingredient_id"),
                    rs.getInt("quantity_required")
                );
                ingredients.add(ingredient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredients;
    }
}
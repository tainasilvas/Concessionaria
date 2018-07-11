/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadastroveiculos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Taina Santos
 */
public class Conexao {

    public static Connection conexao;

    public static Connection getConexao() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrobd", "root", "");

            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Não Conectado" + e);
        }
        return conexao;

    }

}

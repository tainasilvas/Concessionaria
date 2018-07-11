/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadastroveiculos.dao;

import br.cadastroveiculos.jdbc.Conexao;
import br.cadastroveiculos.modelo.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Taina Santos
 */
public class CarroDAO {

    PreparedStatement ps;
    ResultSet rs;
    String sql;
    Connection conexao;

    public void inserir(Carro carros) {
        sql = "INSERT INTO tb_carros(fabricante, modelo, valor, placa, ano) VALUES(?,?,?,?,?)";

        try {
            Connection conectar = Conexao.getConexao();
            ps = conectar.prepareStatement(sql);
            ps.setString(1, carros.getFabricante());
            ps.setString(2, carros.getModelo());
            ps.setFloat(3, carros.getValor());
            ps.setString(4, carros.getPlaca());
            ps.setInt(5, carros.getAno());

            ps.execute();

            Conexao.getConexao().close();

            System.out.println("Cadastrou");
        } catch (Exception e) {
            System.out.println("Não Cadastrou" + e);
        }

    }

    public List listarTodos() {

        List<Carro> lista = new ArrayList<>();
        sql = "select * from tb_carros ";

        try {
            Connection conectar = Conexao.getConexao();
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Carro car = new Carro();
                car.setIdCarro(rs.getInt("id"));
                car.setFabricante(rs.getString("fabricante"));
                car.setModelo(rs.getString("modelo"));
                car.setValor(rs.getFloat("valor"));
                car.setPlaca(rs.getString("placa"));
                car.setAno(rs.getInt("ano"));
                lista.add(car);

                Conexao.getConexao().close();

            }

        } catch (Exception e) {
            System.out.println("Erro" + e);
        }
        return lista;
    }

    public Carro getCarro(int idCarro) throws SQLException {
        sql = "select fabricante, modelo, placa, valor from tb_carros "
                + "where id = " + idCarro;

        Connection conectar = Conexao.getConexao();
        ps = conectar.prepareStatement(sql);
        rs = ps.executeQuery();
        Carro car = new Carro();
        while (rs.next()) {

            car.setFabricante(rs.getString("fabricante"));
            car.setModelo(rs.getString("modelo"));
            car.setPlaca(rs.getString("placa"));

        }
        Conexao.getConexao().close();
        return car;
    }

    public void excluirCarro(int idCarro) throws SQLException {

        sql = "delete from tb_carros where id=?";
        Connection conectar = Conexao.getConexao();
        ps = conectar.prepareStatement(sql);
        ps.setInt(1, idCarro);
        ps.executeUpdate();
        Conexao.getConexao().close();

    }

    public void atualizarCarro(String placa, Carro car) throws SQLException {
        
        sql = "update tb_carros set fabricante=?, modelo=?, valor=?, placa=?, ano=? where placa= ?";
       try{        
        Connection conectar = Conexao.getConexao();
        ps = conectar.prepareStatement(sql);
        //Carro car = new Carro();
        ps.setString(1, car.getFabricante());
        ps.setString(2, car.getModelo());
        ps.setFloat(3, car.getValor());
        ps.setString(4, car.getPlaca());
        ps.setInt(5, car.getAno());
        ps.setString(6, placa);
       
        
        

        ps.executeUpdate();

        Conexao.getConexao().close();
        
       } catch(SQLException e){
           System.out.println("Não atualizou" + e);
       }
    }

     public Carro getBusca(String placa) throws SQLException {
        sql = "select * from tb_carros where placa='" + placa + "'";
                

        Connection conectar = Conexao.getConexao();
        ps = conectar.prepareStatement(sql);
        rs = ps.executeQuery();
        Carro car = new Carro();
        while (rs.next()) {

            car.setFabricante(rs.getString("fabricante"));
            car.setModelo(rs.getString("modelo"));
            car.setPlaca(rs.getString("placa"));
            car.setValor(rs.getFloat("valor"));
            car.setAno(rs.getInt("ano"));

        }
        Conexao.getConexao().close();
        return car;
    }


}

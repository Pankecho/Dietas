
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pankecho
 */
public class Database {
    
    private final String database = "Dietas";
    private final String usuario = "postgres";
    private final String password = "achisLosMariachis";
    private final String schema = "dietitas";
    
    private volatile static Database instance = new Database();
    
    private Connection conexion = null;

    private Database() {
        this.conexion = getConnection();
    }
    
    private Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/" + this.database + "?currentSchema="+this.schema, this.usuario, this.password);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static Database getInstance(){
        if(instance == null){
            synchronized (Database.class){
                if(instance == null){
                    instance = new Database();
                }
            }
        }
        return instance;
    }
    
    public List<Alimento> getAlimentos(){
        List<Alimento> lista = new ArrayList<Alimento>();
        String SQL = "SELECT id,nombre,calorias,descripcion,tipo FROM alimento";
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                lista.add(new Alimento(Integer.parseInt(rs.getString("id")),
                                        rs.getString("nombre"), 
                                        rs.getString("tipo"), 
                                        Integer.parseInt(rs.getString("calorias")), 
                                        rs.getString("descripcion")));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Alimento : " + ex.getMessage());
        }
        return lista;
    }
    
    public List<Ejercicio> getEjercicios(){
        List<Ejercicio> lista = new ArrayList<Ejercicio>();
        String SQL = "SELECT id,nombre,calorias_minuto,descripcion,tipo,imagen FROM ejercicio";
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                lista.add(new Ejercicio(Integer.parseInt(rs.getString("id")), 
                                        rs.getString("nombre"),
                                        rs.getString("descripcion"), 
                                        rs.getString("imagen"), 
                                        Integer.parseInt(rs.getString("calorias_minuto"))));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        return lista;
    }
    
    public List<Alimento> getAlimentosPorUsuario(Usuario u){
        List<Alimento> lista = new ArrayList<Alimento>();
        String SQL = "SELECT a.id,a.nombre,a.calorias,a.descripcion,a.tipo FROM alimento AS a INNER JOIN usuario_alimento AS ua ON a.id = ua.id_alimento WHERE ua.id_usuario = " + u.getId();
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                lista.add(new Alimento(Integer.parseInt(rs.getString("a.id")),
                                        rs.getString("a.nombre"), 
                                        rs.getString("a.tipo"), 
                                        Integer.parseInt(rs.getString("a.calorias")), 
                                        rs.getString("a.descripcion")));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Alimento_Usuario : " + ex.getMessage());
        }
        return lista;
    }
    
    public List<Ejercicio> getEjerciciosPorUsuario(Usuario u){
        List<Ejercicio> lista = new ArrayList<Ejercicio>();
        String SQL = "SELECT e.id,e.nombre,e.calorias_minuto,e.descripcion,e.tipo,e.imagen FROM ejercicio AS e INNER JOIN usuario_ejercicio AS ue ON e.id = ue.id_ejercicio WHERE ue.id_usuario = " + u.getId();
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                lista.add(new Ejercicio(Integer.parseInt(rs.getString("e.id")), 
                                        rs.getString("e.nombre"),
                                        rs.getString("e.descripcion"), 
                                        rs.getString("e.imagen"), 
                                        Integer.parseInt(rs.getString("e.calorias_minuto"))));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        return lista;
    }
    
    public void closeDatabase(){
        try {
            this.conexion.close();
        } catch (SQLException ex) {
            
        }
        finally{
            this.conexion = null;
        }
    }
    
}

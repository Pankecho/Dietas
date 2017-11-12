
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    
    private final String database = "Patrones";
    private final String usuario = "postgres";
    private final String password = "Jpmr01495";
    private final String schema = "dieta";
    
    private volatile static Database instance = new Database();
    
    private Connection conexion = null;

    private Database() {
        this.conexion = getConnection();
    }
    
    private Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/" + this.database + "?currentSchema="+this.schema, this.usuario, this.password);
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
        String SQL = "SELECT id,nombre,calorias,descripcion,tipo,tipo_comida FROM alimento";
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                lista.add(new AlimentoSimple(Integer.parseInt(rs.getString("id")),
                                        rs.getString("nombre"), 
                                        rs.getString("tipo"), 
                                        Integer.parseInt(rs.getString("calorias")), 
                                        rs.getString("descripcion"),
                                        rs.getString("tipo_comida")));
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
                                        Integer.parseInt(rs.getString("calorias_minuto")),
                                        rs.getString("tipo")));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        return lista;
    }
    
    public List<Alimento> getAlimentosPorDieta(int id){
        List<Alimento> lista = new ArrayList<Alimento>();
        String SQL = "SELECT a.id,a.nombre,a.calorias,a.descripcion,a.tipo,a.tipo_comida,ua.tipo_alimento "
                + "FROM alimento AS a INNER JOIN dieta_alimento AS ua ON a.id = ua.id_alimento "
                + "WHERE ua.id = " + id;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                Alimento a = new AlimentoSimple(Integer.parseInt(rs.getString("a.id")),
                                        rs.getString("a.nombre"), 
                                        rs.getString("a.tipo"), 
                                        Integer.parseInt(rs.getString("a.calorias")), 
                                        rs.getString("a.descripcion"),
                                        rs.getString("a.tipo_comida"));
                Alimento comp = new AlimentoCompuesto(a, rs.getString("ua.tipo_alimento"));
                lista.add(comp);
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla alimento dieta : " + ex.getMessage());
        }
        return lista;
    }
    
    public List<Ejercicio> getEjerciciosPorDieta(int id){
        List<Ejercicio> lista = new ArrayList<Ejercicio>();
        String SQL = "SELECT e.id,e.nombre,e.calorias_minuto,e.descripcion,e.tipo,e.imagen FROM ejercicio AS e INNER JOIN dieta_ejercicio AS ue ON e.id = ue.id_ejercicio WHERE ue.id = " + id;
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
                                        Integer.parseInt(rs.getString("e.calorias_minuto")),
                                        rs.getString("e.tipo")));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        return lista;
    }
    
    public void registrarLog(int id, String c){
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        String SQL = "INSERT INTO log_bd (id_usuario,accion) VALUES (?,?)";
        try {
            PreparedStatement stmnt = this.conexion.prepareStatement(SQL);
            stmnt.setInt(1, id);
            stmnt.setString(2,c);
            
            stmnt.executeUpdate();
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        
    }
    
    public int saveUsuario(Usuario u){
        int index = -1;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        String SQL = "INSERT INTO usuario (nombre,ap_paterno,username,password,edad,sexo,peso,estilo_vida,altura) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmnt = this.conexion.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
            stmnt.setString(1, (u.getNombre().split(" ")[0]));
            stmnt.setString(2,(u.getNombre().split(" ")[1]));
            stmnt.setString(3,u.getUsuario());
            stmnt.setString(4,u.getPassword());
            stmnt.setInt(5,u.getEdad());
            stmnt.setString(6,u.getSexo() + "");
            stmnt.setFloat(7, u.getPeso());
            stmnt.setString(8, u.getTipoVida());
            stmnt.setFloat(9, u.getAltura());
            
            int rows = stmnt.executeUpdate();
            if(rows >= 1){
                ResultSet rs = stmnt.getGeneratedKeys();
                if(rs.next()){
                    index = rs.getInt(1);
                }
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        return index;
    }
    
    public void guardarAlimento(int id, ArrayList<Alimento> a){
        String SQL = "INSERT INTO dieta_alimento VALUES ";
        String values = "";
        for(int i = 0; i < a.size(); i++){
            values += "(" + id + "," + a.get(i).getId() + "),";
        }
        values = values.substring(0,values.length()-1);
        SQL+=values;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            PreparedStatement stmnt = this.conexion.prepareStatement(SQL);
            stmnt.executeUpdate();
            System.out.println("Insertados");
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al insertar datos en Alimento : " + ex.getMessage());
        }
    }
    
    public void guardarEjercicio(int id, ArrayList<Ejercicio> a){
        String SQL = "INSERT INTO usuario_ejercicio VALUES ";
        String values = "";
        for(int i = 0; i < a.size(); i++){
            values += "(" + id + "," + a.get(i).getId() + "),";
        }
        values = values.substring(0,values.length()-1);
        SQL+=values;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            PreparedStatement stmnt = this.conexion.prepareStatement(SQL);
            stmnt.executeUpdate();
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al insertar datos de la tabla Ejercicio : " + ex.getMessage());
        }
    }
    
    public Usuario autenticar(String user, String pass){
        Usuario u = null;
        String SQL = "SELECT * FROM usuario AS u WHERE u.username = " + user + " and u.password = " + pass;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                u = new Usuario(rs.getString("nombre") + rs.getString("ap_paterno"),
                                Integer.parseInt(rs.getString("edad")), 
                                Float.parseFloat(rs.getString("peso")),
                                rs.getString("sexo").charAt(0), 
                                Float.parseFloat(rs.getString("altura")), 
                                rs.getString("tipo"), 
                                rs.getString("user"),
                                rs.getString("password"));
                u.setId(Integer.parseInt(rs.getString("id")));
            }
            Dieta d = getDietaPorUsuario(u.getId());
            List<Alimento> alimentos = getAlimentosPorDieta(d.getId());
            List<Ejercicio> ejercicio = getEjerciciosPorDieta(d.getId());
            for(int i = 0; i < alimentos.size(); i++){
                d.agregarComponente(alimentos.get(i));
            }
            for(int i = 0; i < ejercicio.size(); i++){
                d.agregarComponente(ejercicio.get(i));
            }
            u.setDieta(d);
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al tratar de obtener usuario : " + ex.getMessage());
        }
        return u;
    }
    
    public Dieta getDietaPorUsuario(int id){
        Dieta d = null;
        String SQL = "SELECT * FROM dieta as d WHERE id_usuario = " + id;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        try {
            Statement stament = this.conexion.createStatement();
            ResultSet rs = stament.executeQuery(SQL);
            while(rs.next()){
                d = new Dieta(rs.getString("nombre"), rs.getString("descripcion"));
                d.setId(Integer.parseInt(rs.getString("id")));
            }
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al tratar de obtener Dieta : " + ex.getMessage());
        }
        return d;
    }
    
    public int saveDieta(Dieta u, int i){
        int index = -1;
        if(this.conexion == null){
            this.conexion = getConnection();
        }
        String SQL = "INSERT INTO dieta (id_usuario,nombre,descripcion) VALUES (?,?,?)";
        try {
            PreparedStatement stmnt = this.conexion.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
            stmnt.setInt(1, i);
            stmnt.setString(2, u.getNombre());
            stmnt.setString(3,u.getDescripcion());

            
            int rows = stmnt.executeUpdate();
            
            if(rows >= 1){
                ResultSet rs = stmnt.getGeneratedKeys();
                if(rs.next()){
                    index = rs.getInt(1);
                }
            }
            
            closeDatabase();
        } catch (SQLException ex) {
            System.out.println("Error al ingresar datos de la tabla Dieta : " + ex.getMessage());
        }
        return index;
    }
    
    public void closeDatabase(){
        try {
            this.conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al regresar datos de la tabla Ejercicio : " + ex.getMessage());
        }
        finally{
            this.conexion = null;
        }
    }    
}

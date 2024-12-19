
package teste;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    
    int id;
    private String nome;
    private int idade;
    
    public Usuario(){
    }
    
    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        
    }
    
    public void inserir(){
        
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO usuarios(nome,idade) values(? ,? )";
        
        try {
            PreparedStatement pst;
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.nome);
            pst.setInt(2, this.idade);
            
            pst.execute();
            pst.close();
            
            conexao.close();
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro ao conectar no banco de dados");
        }
    }
    
    public void remover(int idSelect){
        
        String sql = "DELETE FROM usuarios WHERE id = ?";
        
        PreparedStatement pstm= null;
        
        try {
            Connection conexao = new Conexao().getConexao();
            
            pstm = conexao.prepareStatement(sql);
            
            pstm.setInt(1, idSelect);
            
            
            pstm.execute();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            
            try {
                
                if(pstm != null){
                    pstm.close();
                }
                
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    
    public void alterar(int idSelect){
        String sql = "UPDATE usuarios SET nome = ?, idade = ?"
                + " WHERE id = ?";
        
        
        PreparedStatement pstm = null;
        
        try {
            Connection conexao = new Conexao().getConexao();
            
            pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, this.nome);
            pstm.setInt(2, this.idade);
            pstm.setInt(3, idSelect);
            
            pstm.execute();
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            
            try {
                if( pstm != null){
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void listar(){
        String sql = "select * from usuarios";
        
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            Connection conexao = new Conexao().getConexao();
            
            pstm = conexao.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                System.out.println(rset.getInt("id"));
                System.out.println(rset.getString("nome"));
                System.out.println(rset.getInt("idade"));
                System.out.println("===================");
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                
                if(rset != null){
                    rset.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            } catch (SQLException e) {
                
                System.out.println(e.getMessage());
                
            }
        }
    }
}

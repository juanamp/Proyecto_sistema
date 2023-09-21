package aqp_cs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOUsuario extends DAO {

	public List<Usuario> consultarTodo(){
		List<Usuario> lst = new ArrayList<Usuario>();
		String  sql ="SELECT id, nombre FROM public.usuario;";
		Connection cnx = crearCnx();
		try {
		PreparedStatement pstm= cnx.prepareStatement(sql);
		ResultSet rs =  pstm.executeQuery();
		while (rs.next()) {
			Usuario u = new Usuario();
			u.setId(rs.getInt(1));
			u.setNombre(rs.getString(2));
			lst.add(u);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	
		return lst;
		
	}
	
}

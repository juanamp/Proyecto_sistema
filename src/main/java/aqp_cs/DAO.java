package aqp_cs;
import java.sql.Connection;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DAO {



	public Connection crearCnx() {
		Connection con = null;
			try {
				Context ctx = new InitialContext();
				
				DataSource ds = null;
				ds=(DataSource) ctx.lookup("java:jboss/datasources/ExampleDS");
			con = ds.getConnection();
	}catch(Exception e) {
		e.printStackTrace();
		}
			return con;
	}
	
}

package org.eam.is.dds.daosample.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.eam.is.dds.daosample.connection.DbConnection;
import org.eam.is.dds.daosample.vo.cuentaVO;

/**
 * Clase que permite el acceso a la base de datos
 * 
 * @author heider
 *
 */
public class cuentaDAO {


	/**
	 * permite consultar la lista de personas
	 * 
	 * @return
	 */
	public ArrayList<cuentaVO> consultarcuenta(int id) {
		ArrayList<cuentaVO> cuentas = new ArrayList<cuentaVO>();
		DbConnection dbConnection = new DbConnection();

		try {
			PreparedStatement consulta = dbConnection.getConnection().prepareStatement("SELECT * FROM cuenta where id = ? ");
			consulta.setInt(1, id);
			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				cuentaVO cuenta = new cuentaVO();
				cuenta.getId();
				cuenta.getsaldo();
				cuentas.add(cuenta);
			}
			res.close();
			consulta.close();
			dbConnection.getConnection().close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar la cuenta\n" + e);
		}
		return cuentas;
	}

}

package org.eam.is.dds.daosample.main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.eam.is.dds.daosample.dao.cuentaDAO;
import org.eam.is.dds.daosample.vo.cuentaVO;

/**
 * Clase Principal para la ejecucion del ejemplo.
 * 
 * @author Heider
 * @param <micuentaDao>
 *
 */
public class Principal<micuentaDao> {

	cuentaDAO micuentaDao;

	/**
	 * Método principal, hace el llamado al menú donde se presentan todas las
	 * opciones del sistema
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Principal miPrincipal = new Principal();
		
	}

	
	private void buscarPersona(int id) {
		micuentaDao = new cuentaDAO();
		cuentaVO micuenta;
		ArrayList<cuentaVO> cuentasEncontrada = micuentaDao.consultarcuenta(id);
		// se valida que se encuentre la persona
		if (cuentasEncontrada.size() > 0) {
			// se recorre la lista y se asignan los datos al objeto para
			// imprimir los valores
			for (int i = 0; i < cuentasEncontrada.size(); i++) {
				micuenta = cuentasEncontrada.get(i);
				System.out.println("****************Persona*************************");
				System.out.println("Id cuenta: " + micuenta.getId());
				System.out.println("saldo: " + micuenta.getsaldo());
			}
		} else {
			JOptionPane.showMessageDialog(null, "El id ingresado " + "no corresponde a ninguna cuenta", "INFORMACION",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

	
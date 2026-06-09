
package CONTROLADOR;

import MODELO.ListarProductos;
import MODELO.Producto;
import MODELO.Registro;
import CONEXION.formulario_RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador_del_formulario_RegistrarProducto implements ActionListener {
  formulario_RegistrarProducto  frm_rp; //frm rp SIGNIFICA FORMULARIO REGISTRAR PRODUCTO

  public Controlador_del_formulario_RegistrarProducto(formulario_RegistrarProducto  frm_rp){
      this.frm_rp = frm_rp;
      this.frm_rp.btnGUARDAR.addActionListener(this);//llamamos al boton guardar
  }

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==frm_rp){//cuando hagamos clic dentro del boton, se va a ejecutar todo lo que se vaya a poner dentro del IF
   String nombre = frm_rp.cajaNOMBRE.getText();
       int cantidad = Integer.parseInt(frm_rp.cajaCANTIDAD.getText());
       double precio = Double.parseDouble(frm_rp.cajaPRECIO.getText());
      
       Producto p = new Producto(nombre,cantidad,precio);
       Registro R= new Registro();
       R.registrarbd(p);
       
       ListarProductos lp = new ListarProductos();
       lp.MostrarTable(frm_rp.TABLAproducto);
       limpiarEntradas();
       
   }
    }

    private void limpiarEntradas() {
frm_rp.cajaNOMBRE.setText("");
frm_rp.cajaCANTIDAD.setText("");
frm_rp.cajaPRECIO.setText("");
    }
 }

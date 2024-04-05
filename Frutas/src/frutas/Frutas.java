package frutas;
import javax.swing.JOptionPane;

/**
 *
 * @author idiomas
 */
public class Frutas {
    
    final int precio = 4200;
    private int numKilo;
    private double valor1;
    //private double totalApagar;

    public Frutas(int numKilo) {
        this.numKilo = numKilo;
        
    }

    public double getValor1() {
        return valor1;
    }

   
    public double getPrecio() {
        return precio;
    }

    public int getNumKilo() {
        return numKilo;
    }
    
    public double calcularTotal(int numKilo){
        
        if(numKilo>0 && numKilo<=2){
            //totalApagar=precio*numKilo;
        }else if(numKilo>2 && numKilo<=5){
            valor1=(precio*numKilo)*10/100;
            //totalApagar=precio*numKilo-valor1;
        }else if(numKilo>5 && numKilo<=10){
            valor1=(precio*numKilo)*15/100;
            //totalApagar=precio*numKilo-valor1;
        }else{
            valor1=(precio*numKilo)*20/100;
            //totalApagar=precio*numKilo-valor1;
        }
        return precio*numKilo-valor1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String numStrg = JOptionPane.showInputDialog("Ingresar Kilos");
        int numInt = Integer.parseInt(numStrg);
        Frutas cliente = new Frutas(numInt);
        JOptionPane.showMessageDialog(null, "La compra de " +numInt + "kilos tiene un valor de "+cliente.precio*cliente.numKilo 
                                            +" \n pero usted tiene un descuento por valor de "+cliente.getValor1()
                                            +"\n por lo tanto usted debe pagar "+cliente.calcularTotal(numInt));
    }
    
}

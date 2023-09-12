import javax.swing.JOptionPane;

public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heredouble 
       double n1 , n2;
       int base, exponente, grados;
       
       double suma,resta,multiplicacion,division;
       n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nro1:"));
       
 

        n2=Double.parseDouble(
               JOptionPane.showInputDialog("Ingrese Nro2:"));

        grados=Integer.parseInt(
               JOptionPane.showInputDialog("Ingrese Grados:"));
        base=Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese Base:"));
        exponente=Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese Exponente:"));

        
        suma=n1+n2;
        resta=n1-n2;
        multiplicacion=n1*n2;
        division=n1/n2;
        
        double raiz_1 = Math.sqrt(n1);
        double raiz_2 = Math.sqrt(n2);
        double coseno = Math.cos(Math.toRadians(grados));
        double seno = Math.sin(Math.toRadians(grados));
        double potencia = Math.pow(base, exponente);
          

        System.out.println("Suma:"+suma);
        System.out.println("Resta:"+resta);
        System.out.println("multiplicacion:"+multiplicacion);
        System.out.println("division:"+division);
        
        System.out.println("RAIZ 1:"+raiz_1);
        System.out.println("RAIZ 2:"+raiz_2);
        System.out.println("COSENO:"+coseno);
        System.out.println("SENO:"+seno);
        System.out.println("POTENCIA:"+potencia);
        
        

        JOptionPane.showMessageDialog(null, " Suma: "+
                suma+" resta:  " + resta +" Multiplicacion: "+
                multiplicacion+ " Division: " + division + "Raiz 1: " + raiz_1 + "Raiz 2: " + raiz_2 + "Coseno: " + coseno + "Seno: " + seno  + "Potencia: " + potencia);
        
    }
    
    
}

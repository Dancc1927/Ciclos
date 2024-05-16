package menus;
import java.util.*;
import java.util.Scanner.*;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args) {

        String nombre="";
        int  a=0,b=0,resultado,MenuPrincipal=0;
        String entrada="";
        do{ 
            String menu="MENU PRINCIPAL\n\n";
            menu+="1.Saludo\n";
            menu+="2.Ingrese su nomnbre\n";
            menu+="3.Sume dos numeros\n";
            menu+="4. Salir\n";
            MenuPrincipal=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (MenuPrincipal){
            case 1:
        System.out.println("Hola");
        break;
           case 2:
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        nombre=entrada.next();
        System.out.println("Su nombre es :"+nombre);
        break;
        case 3:
        System.out.println("Ingrese un numero");
        a=Integer.parseInt(entrada.next());
        System.out.println("el numero a:"+a);
        System.out.println("Su nombre es :"+a);
       System.out.println("Ingrese otro numero");
        b=Integer.parseInt(entrada.next());
        System.out.println("el numero a:"+b);
        System.out.println("Su nombre es :"+b);
        resultado=a+b;
        System.out.println("La suma es :"+resultado);
        break;}
	    }while (MenuPrincipal<=4);
}
}

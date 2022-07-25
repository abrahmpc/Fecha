
package fechas;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fechas 
{
    public static void main(String[] args) 
    { 
        int anio,mes,dia,otro;
        
        /*
        Date fecha = new Date();
        anio=fecha.getYear()+1900;
        System.out.println("\nanio, "+anio);
        mes=fecha.getMonth();
        System.out.println("\nmes"+mes);
        otro=fecha.getDay();
        System.out.println("\nDia"+otro);
        fecha.getDate();
        System.out.println("\nFecha"+fecha); */
        
        
        
        Calendar calendario = new GregorianCalendar();
        anio = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH)+1 ; 
        dia = calendario.get(Calendar.DATE);
        System.out.println("Anio "+anio);
        System.out.println("Mes "+mes);
        System.out.println("Fecha "+dia);
        otro = calendario.get(Calendar.DAY_OF_YEAR);
        System.out.println("Dias " +otro);
        otro = calendario.get(Calendar.HOUR);
        System.out.print("Hora " +otro);
        otro = calendario.get(Calendar.MINUTE);
        System.out.print(": " +otro);
        otro = calendario.get(Calendar.SECOND);
        System.out.println(": " +otro);
        
        Date fecha = Calendar.getInstance().getTime();
        System.out.println("fecha: " +fecha);
 
    }
    
}

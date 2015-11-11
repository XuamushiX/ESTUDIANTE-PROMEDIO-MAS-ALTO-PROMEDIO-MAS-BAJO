/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deber2;
import java.io.*;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader DATO= new InputStreamReader(System.in);
        BufferedReader DATO1= new BufferedReader(DATO);
        double PROM,APORTE1,APORTE2,APORTE3;
        double PROMALTO,PROMBAJO,TOTAL,SUMA;
        int NUMESTU,i;
        String NOM,APE;

        i=1;
        PROMALTO=0;
        PROMBAJO=100000;
        SUMA=0;

        try
        {
         System.out.println("DETERMINAR EL PROMEDIO GENERAL DE PROGRAMACION 1 DE ");
         System.out.println("LA KENNEDY, CONSIDERANDO QUE CADA ESTUDIANTE TIENE ");
         System.out.println("3 APORTES. DETERMINE EL PROMEDIO MAS ALTO DEL CURSO ");
         System.out.println("Y EL PROMEDIO MAS BAJO");
         System.out.println("");
         System.out.println("INGRESE EL # DE ESTUDIANTES");
         NUMESTU=Integer.parseInt(DATO1.readLine());
         while (i<=NUMESTU)
             {
             System.out.println("Ingrese el nombre del estudiante "+i);
             NOM=DATO1.readLine();
             System.out.println("Ingrese el apellido del estudiante "+i);
             APE=DATO1.readLine();
             System.out.println("INGRESE EL PRIMER APORTE"+i);
             APORTE1=Integer.parseInt(DATO1.readLine());
             System.out.println("INGRESE EL SEGUNDO APORTE");
             APORTE2=Integer.parseInt(DATO1.readLine());
             System.out.println("INGRESE EL TERCER APORTE" );
             APORTE3=Integer.parseInt(DATO1.readLine());
             TOTAL=(APORTE1+APORTE2+APORTE3)/3;
             SUMA=SUMA+TOTAL;
             if(TOTAL<PROMBAJO)
            {
              PROMBAJO=TOTAL;
            }
            if(TOTAL>PROMALTO)
            {
                PROMALTO=TOTAL;
            }
              i=i+1;
          }

              PROM=SUMA/NUMESTU;

          System.out.println("EL PROMEDIO GENERAL EN PROGRAMACION 1 ES:"+PROM);
          System.out.println("EL PROMEDIO MAS BAJO ES DE:" + PROMBAJO);
          System.out.println("EL PROMEDIO MAS ALTO ES DE:" + PROMALTO);

             }

         catch (IOException e)
        {
            System.out.println("ERROR");
        }
    }
}

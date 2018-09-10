
package servletHTML;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;
   public class ServletCalc extends HttpServlet {

    double num1;
    double num2;
    String op;
    double op2;

    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) {
        num1 = Integer.parseInt(peticion.getParameter("nume1"));
        num2 = Integer.parseInt(peticion.getParameter("nume2"));
        op = peticion.getParameter("oper");
        switch(op){

            case "Suma":

                op2 = (num1 + num2) ;

                break;

            case "Resta":

                op2 = num1-num2;

                break;

            case "Multiplicacion":

                op2 = num1*num2;

                break;

            case "Division":

                op2 = num1/num2;

                break;
            case "Cos":

                op2 = Math.cos(num1);

            break;
            case "aCos":

                op2 = Math.acos(num1);

            break;
            case "Sen":

                op2 = Math.sin(num1);

            break;
            case "aSen":

                op2 = Math.asin(num1);

            break;
            case "ln":

                op2 = Math.log(num1);

            break;
            case "abs":

                op2 = Math.abs(num1);

            break;
                    

        }
        try {
            PrintWriter out = new PrintWriter(respuesta.getOutputStream());
            out.println("<html>");

            out.println("<head><title>Resustado</title></head>");

            out.println("<body>");            

            out.println("<br><br><br>");            

            out.println("<p><h2><center>Resultado: "+op2+"</center></h2></p>");

            out.println("</body></html>");

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


    




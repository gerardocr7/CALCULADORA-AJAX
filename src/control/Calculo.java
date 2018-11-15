package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Numero;

@WebServlet("/Control")
public class Calculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public Calculo() {
        super();
       }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Numero n = new Numero(Integer.parseInt(request.getParameter("num1")),Integer.parseInt(request.getParameter("num2")));
		Calculadora calc = new Calculadora();
		try{
			response.getWriter().print("Resposta do Ajax soma: " + calc.soma(n)+"\n");
			response.getWriter().print("Resposta do Ajax subtracao: " + calc.subtracao(n)+"\n");
			response.getWriter().print("Resposta do Ajax multiplicacao: " + calc.multiplicacao(n)+"\n");
			response.getWriter().print("Resposta do Ajax divisao: " + calc.divisao(n));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}



	
}

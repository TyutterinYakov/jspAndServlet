package folder;



import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        
        request.getSession().setAttribute("NAME", name);
       // request.getSession().setMaxInactiveInterval(1);
        
        
   //     response.getWriter().write((String)request.getSession().getAttribute("NAME"));
        
//        
//        String bigData = "BIG DATA";
//        request.setAttribute("key", bigData);
//        response.setContentType("text/html");
        
//        getServletContext().getRequestDispatcher("/newjsp.jsp").forward(request, response);
        
//        request.setCharacterEncoding("UTF-8");
//        String name = request.getParameter("name");
//        
//        
//        
//       // ServletOutputStream os = response.getOutputStream();
//       response.setCharacterEncoding("UTF-8");
//        
//        PrintWriter writer = response.getWriter();
//        if(name!=null&& !name.trim().isEmpty()){
//            writer.write("<strong>Hello, Bro, "+name+"</strong>");
//        } else {
//        writer.write("<strong>Hello my friend</strong>");
//        }
    }

} 


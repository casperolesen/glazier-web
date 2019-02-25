package presentation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author caspe
 */
public class HomeCommand extends Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home Page</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<form>");
            out.println("<input type=text placeholder=username name=uname>");
            out.println("<input type=password placeholder=password name=pword>");
            out.println("<input type=submit value=Login>");
            out.println("</form>");
            
            out.println("<h1>My Home Page</h1>");
            
            out.println("<form method='GET' action='Glazier/price'>");
            out.println("Frame <input type='text' placeholder='frame type' name='frame_name'>");
            out.println("Height <input type='number' name='height'>");
            out.println("Width <input type='number' name='width'>");
            out.println("<input type='submit' value='Get Price'>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    
}

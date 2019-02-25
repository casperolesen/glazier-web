package presentation;

import data.Frame;
import data.FrameDAO;
import data.Glass;
import data.GlassDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.PriceController;

/**
 *
 * @author caspe
 */
public class PriceCommand extends Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String frame_name = request.getParameter("frame_name");
        double height = Double.parseDouble(request.getParameter("height"));
        double width = Double.parseDouble(request.getParameter("width"));

        FrameDAO frameDao = new FrameDAO();
        GlassDAO glassDao = new GlassDAO();
        
        PriceController c = new PriceController();
        
        
        Frame frame = frameDao.getFrame(frame_name);
        Glass glass = glassDao.getGlass();
        
        double total_price = c.getPrice(frame, glass, height, width);

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculated Price</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Price</h1>");
            out.println("<p>Total: " + total_price + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}

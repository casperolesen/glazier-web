package presentation;

import data.Frame;
import data.FrameDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author caspe
 */
public class FramesCommand extends Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        FrameDAO frameDao = new FrameDAO();
        List<Frame> frames;
        frames = frameDao.getFrames();
        
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Frames Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>My Frames</h1>");
            
                for (Frame frame : frames) {
                    out.println("<p>" + frame.getName() + "</p>");
                }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    
}

package presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author caspe
 */
public abstract class Command {

    public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    public static Command from(HttpServletRequest request) {
        Command c;
        String path = request.getPathInfo().substring(1);

        switch (path) {
            case "":
                c = new HomeCommand();
                break;
            case "frames":
                c = new FramesCommand();
                break;
            case "price":
                c = new PriceCommand();
                break;
            default:
                c = new UnknownCommand();
        }

        return c;
    }
}

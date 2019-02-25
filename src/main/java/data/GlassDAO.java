package data;

/**
 *
 * @author caspe
 */
public class GlassDAO {
    Glass glass;
    
    public GlassDAO() {
        this.glass = new Glass(300.0);
    }
    
    public Glass getGlass() {
        return glass;
    }
}

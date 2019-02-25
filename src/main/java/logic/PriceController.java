package logic;

import data.Frame;
import data.Glass;

/**
 *
 * @author caspe
 */
public class PriceController {
    
    public double getPrice(Frame frame, Glass glass) {
        double frame_cost = frame.getPrice();
        double glass_cost = glass.getPrice();
        
        return frame_cost + glass_cost;
        
    }
}

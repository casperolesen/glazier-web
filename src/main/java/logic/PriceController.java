package logic;

import data.Frame;
import data.Glass;

/**
 *
 * @author caspe
 */
public class PriceController {

    public double getPrice(Frame frame, Glass glass, double height, double width) {
        double height_meter = height / 100;
        double width_meter = width / 100;
        double frame_sides_size = height_meter * 2;
        double frame_topAndBottom_size = width_meter * 2;

        double frame_cost = (frame_sides_size + frame_topAndBottom_size) * frame.getPrice();
        double glass_cost = (height_meter * width_meter) * glass.getPrice();

        return frame_cost + glass_cost;

    }
}

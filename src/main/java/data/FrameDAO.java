package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caspe
 */
public class FrameDAO {
    
    List<Frame> frames = new ArrayList();

    public FrameDAO() {
        frames.add(new Frame("type1", 100.0));
        frames.add(new Frame("type2", 200.0));
        frames.add(new Frame("type3", 300.0));
    }
    
    public Frame getFrame(String name) {
        for (Frame frame : frames) {
            if (frame.getName().equals(name)) return frame;
        }
        return null;
    }
    
    public List<Frame> getFrames() {
        return frames;
    }
}

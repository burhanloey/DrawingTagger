package drawingtagger.model;

import javafx.scene.shape.Line;

/**
 *
 * @author Burhanuddin
 */
public class TaggedLine {
    public int id;
    public Line line;
    public long timeStart, timeEnd;
    public String tag;
    
    /**
     * Constructs a tagged line based on specified values.
     * @param id
     * @param line
     * @param timeStart
     * @param timeEnd
     */
    public TaggedLine(int id, Line line, long timeStart, long timeEnd, String tag) {
        this.id = id;
        this.line = line;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.tag = tag;
    }
}

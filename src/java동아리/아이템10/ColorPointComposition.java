package java동아리.아이템10;

import java.awt.*;

public class ColorPointComposition {
    private Point point;
    private Color color;

    public ColorPointComposition(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPointComposition)){
            return obj.equals(this);
        }
        ColorPointComposition colorPoint = (ColorPointComposition) obj;
        return  colorPoint.point.equals(this.point) &&
                colorPoint.color.equals(this.color);
    }
}

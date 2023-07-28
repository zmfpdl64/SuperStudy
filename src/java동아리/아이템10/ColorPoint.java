package java동아리.아이템10;

import java.awt.*;

public class ColorPoint extends Point{
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint)){
            return false;
        }
        ColorPoint cp = (ColorPoint) obj;
        return super.equals(cp) && this.color == cp.color;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Point)){
//            return false;
//        }
//        // 대칭성은 지켰지만 추이성은 못지킴
//        if(!(obj instanceof ColorPoint)){
//            return obj.equals(this);
//        }
//        ColorPoint cp = (ColorPoint) obj;
//        return super.equals(cp) && this.color.equals(cp.color);
//    }
}

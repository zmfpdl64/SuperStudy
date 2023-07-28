package java동아리.아이템10;

import snow.day1.upcast.A;

import javax.tools.JavaFileManager;
import java.awt.*;
import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ColorPointComposition colorPoint = new ColorPointComposition(1, 1, new Color(255));
        Point point = new Point(1, 1);
        ColorPointComposition colorPoint2 = new ColorPointComposition(1, 1, new Color(257));

        // 대칭성 확인
        System.out.println("대칭성 확인");
        System.out.println("colorPoint.equals(point): " + colorPoint.equals(point));
        System.out.println("point.equals(colorPoint): " + point.equals(colorPoint));

        System.out.println("-------------------------------------");

        // 추이성 확인
        System.out.println("추이성 확인");
        System.out.println("colorPoint.equals(point): " + colorPoint.equals(point));
        System.out.println("point.equals(colorPoint2): " + point.equals(colorPoint2));
        System.out.println("colorPoint2.equals(colorPoint): " + colorPoint2.equals(colorPoint));
    }
}

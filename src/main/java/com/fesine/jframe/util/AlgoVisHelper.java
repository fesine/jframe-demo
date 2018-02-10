package com.fesine.jframe.util;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @description: 图形绘制工具类
 * @author: Fesine
 * @createTime:2018/2/10
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/2/10
 */
public class AlgoVisHelper {

    private AlgoVisHelper(){}

    public static void setStrokeWidth(Graphics2D g2d,int w){
        g2d.setStroke(new BasicStroke(w,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
    }

    /**
     * 给定圆心坐标，半径长度绘制空心圆
     * @param g2d
     * @param x 圆心横坐标
     * @param y 圆心纵坐标
     * @param r 半径长度
     */
    public static void strokeCircle(Graphics2D g2d,int x,int y,int r){
        Ellipse2D circle = new Ellipse2D.Double(x-r, y-r, 2*r, 2*r);
        g2d.draw(circle);
    }

    /**
     * 给定圆心坐标，半径长度绘制实心圆
     * @param g2d
     * @param x 圆心横坐标
     * @param y 圆心纵坐标
     * @param r 半径长度
     */
    public static void fillCircle(Graphics2D g2d,int x,int y,int r){
        Ellipse2D circle = new Ellipse2D.Double(x-r, y-r, 2*r, 2*r);
        g2d.fill(circle);
    }

    public static void setColor(Graphics2D g2d, Color color) {
        g2d.setColor(color);
    }
}

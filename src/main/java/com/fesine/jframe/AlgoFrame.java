package com.fesine.jframe;

import javax.swing.*;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/2/10
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/2/10
 */
public class AlgoFrame extends JFrame {
    private static final long serialVersionUID = -212103718224798470L;

    private int canvasWidth;
    private int canvasHeight;
    public AlgoFrame(String title){
        this(title, 1024, 768);
    }

    public AlgoFrame(String title,int canvasWidth,int canvasHeight){
        super(title);
        this.canvasWidth=canvasWidth;
        this.canvasHeight=canvasHeight;
        setSize(canvasWidth, canvasHeight);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }


    public int getCanvasHeight() {
        return canvasHeight;
    }

}

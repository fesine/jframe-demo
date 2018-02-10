package com.fesine.jframe;

import com.fesine.jframe.util.AlgoVisHelper;

import javax.swing.*;
import java.awt.*;

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
        AlgoCanvas canvas = new AlgoCanvas();
        //canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
        setContentPane(canvas);
        pack();
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

    private class AlgoCanvas extends JPanel{

        private static final long serialVersionUID = -9105108446016026356L;

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            //强转
            Graphics2D g2d = (Graphics2D) g;
            AlgoVisHelper.setStrokeWidth(g2d,5);
            AlgoVisHelper.setColor(g2d,Color.BLUE);
            AlgoVisHelper.fillCircle(g2d,canvasWidth/2,canvasHeight/2,200);
            AlgoVisHelper.setColor(g2d,Color.RED);
            AlgoVisHelper.strokeCircle(g2d,canvasWidth/2,canvasHeight/2,200);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth,canvasHeight);
        }
    }

}

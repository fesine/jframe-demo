package com.fesine.jframe;

import com.fesine.jframe.util.AlgoVisHelper;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/2/10
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/2/10
 */
public class AlgoVisualizer {

    private Circle[] circles;
    private AlgoFrame frame;
    private boolean isAnimated = true;


    public AlgoVisualizer(int sceneWidth, int sceneHeight, int n,int r) {

        circles = new Circle[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * (sceneWidth - 2 * r)) + r;
            int y = (int) (Math.random() * (sceneHeight - 2 * r)) + r;
            int vx = new Random().nextInt(11) - 5;
            int vy = new Random().nextInt(11) - 5;
            circles[i] = new Circle(x, y, r, vx, vy);
        }

        EventQueue.invokeLater(() -> {
            frame = new AlgoFrame("welcome", sceneWidth, sceneHeight);
            frame.addKeyListener(new AlgoKeyListener());
            frame.addMouseListener(new AlgoMouseListener());
            new Thread(() -> {
                run();
                return;
            }).start();
        });
    }

    /**
     * 动画动作
     */
    private void run() {
        while (true) {
            //绘制数据
            frame.render(circles);
            AlgoVisHelper.pause(20);
            //更新数据
            if (isAnimated) {
                for (Circle circle : circles) {
                    circle.move(0, 0, frame.getCanvasWidth(), frame.getCanvasHeight());
                }
            }
        }
    }

    private class AlgoKeyListener extends KeyAdapter{
        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyChar() == ' '){
                isAnimated =!isAnimated;
            }
        }
    }

    private class AlgoMouseListener extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
            e.translatePoint(0, -(frame.getBounds().height - frame.getCanvasHeight()));
            System.out.println(e.getPoint());
            for (Circle circle : circles) {
                if(circle.contain(e.getPoint())){
                    circle.isFilled = !circle.isFilled;
                }
            }
        }
    }

    public static void main(String[] args) {

        int sceneWidth = 600;
        int sceneHeight = 600;
        int n = 10;
        int r = 50;
        AlgoVisualizer visualizer = new AlgoVisualizer(sceneWidth, sceneHeight, n,r);
    }
}

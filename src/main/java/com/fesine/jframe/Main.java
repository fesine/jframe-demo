package com.fesine.jframe;

import java.awt.*;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/2/10
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/2/10
 */
public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            //JFrame frame = new JFrame("welcome");
            //frame.setSize(500,500);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setVisible(true);
            AlgoFrame frame = new AlgoFrame("welcome", 500, 500);
            //AlgoFrame frame = new AlgoFrame("welcome");
        });
    }
}

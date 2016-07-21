package com.cangjie.designpatternexercise.create;

/**
 * author：CangJie on 2016/7/21 10:32
 * email：cangjie2016@gmail.com
 */
public class PieChartFactory implements Factory{

    @Override
    public Chart buildChart() {
        return new PieChart();
    }
}

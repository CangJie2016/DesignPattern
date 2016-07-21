package com.cangjie.designpatternexercise.create;

/**
 * author：CangJie on 2016/7/19 17:17
 * email：cangjie2016@gmail.com
 */
public class BarChartFactory implements Factory {

    @Override
    public Chart buildChart() {
        return new BarChart();
    }
}

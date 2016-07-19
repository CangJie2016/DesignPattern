package com.cangjie.designpatternexercise.create;

/**
 * author：CangJie on 2016/7/19 17:17
 * email：cangjie2016@gmail.com
 */
public class ChartFactory {
    public static Chart buildChart(String type){
        Chart chart = null;
        if(type.equals("bar")){
            chart = new BarChart();
        }else if(type.equals("pie")){
            chart = new PieChart();
        }
        return chart;
    }
}

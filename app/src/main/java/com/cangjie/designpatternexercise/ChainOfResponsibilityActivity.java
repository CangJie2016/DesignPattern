package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.chain.Boss;
import com.cangjie.designpatternexercise.chain.Company;
import com.cangjie.designpatternexercise.chain.Director;
import com.cangjie.designpatternexercise.chain.Employee;
import com.cangjie.designpatternexercise.chain.Manager;

public class ChainOfResponsibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility);
        Employee director, manager, boss, company;
        director = new Director("李主任");
        manager = new Manager("李经理");
        boss = new Boss("李总");
        company = new Company("金箍棒有限公司");
        director.setEmployee(manager);
        manager.setEmployee(boss);
        boss.setEmployee(company);

        director.approve(2);
        director.approve(4);
        director.approve(8);
        director.approve(12);
        director.approve(52);
    }
}

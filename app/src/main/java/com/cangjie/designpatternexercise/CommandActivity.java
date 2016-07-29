package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.cangjie.designpatternexercise.command.AddCommand;
import com.cangjie.designpatternexercise.command.CalculatorForm;
import com.cangjie.designpatternexercise.command.Command;

public class CommandActivity extends AppCompatActivity {

    private CalculatorForm form;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        et = (EditText) findViewById(R.id.et);

        form = new CalculatorForm();
        Command command = new AddCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.compute(5);
    }
    public void undo(View view){
        form.undo();
    }
    public void redo(View view){
        form.redo();
    }
    public void add(View view){
        form.compute(Integer.parseInt(et.getText().toString().trim()));
    }
}

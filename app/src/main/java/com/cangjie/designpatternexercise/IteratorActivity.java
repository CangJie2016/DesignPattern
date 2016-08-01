package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.iterator.AbstractIterator;
import com.cangjie.designpatternexercise.iterator.Student;
import com.cangjie.designpatternexercise.iterator.StudentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        List students = new ArrayList();
        students.add(new Student("Tony",32,33));
        students.add(new Student("Tony",12,33));
        students.add(new Student("Tony",22,33));

        Collections.sort(students);
        StudentList studentList = new StudentList(students);
        AbstractIterator iterator = studentList.iterator();
        iterator.print();


//        List<Student> students = new ArrayList<Student>();
//        students.add(new Student("Tony",32,33));
//        students.add(new Student("Tony",12,33));
//        students.add(new Student("Tony",22,33));
//        Collections.sort(students);
//        Iterator<Student> iterator = students.iterator();
//        while(true){
//            if(!iterator.hasNext())
//                break;
//            Student stu = iterator.next();
//            DebugLog.w(stu.getName()+",年龄"+stu.getAge()+",成绩:"+stu.getScore());
//        }
    }
}

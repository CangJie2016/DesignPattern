package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.visitor.AcademyAwardSystem;
import com.cangjie.designpatternexercise.visitor.AcademyPerson;
import com.cangjie.designpatternexercise.visitor.AcademyStudent;
import com.cangjie.designpatternexercise.visitor.AcademyTeacher;
import com.cangjie.designpatternexercise.visitor.GradeExcellentAward;
import com.cangjie.designpatternexercise.visitor.ScienceResearchAward;

public class VisitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);
        AcademyAwardSystem system = new AcademyAwardSystem();
        AcademyPerson teacher1 = new AcademyTeacher(12,99,"Teacher1");
        AcademyPerson teacher2 = new AcademyTeacher(2,99,"Teacher2");
        AcademyPerson teacher3 = new AcademyTeacher(12,80,"Teacher3");
        AcademyStudent student1 = new AcademyStudent(12,80,"student1");
        AcademyStudent student2 = new AcademyStudent(2,900,"student2");
        AcademyStudent student3 = new AcademyStudent(1,80,"student3");
        system.addPerson(teacher1);
        system.addPerson(teacher2);
        system.addPerson(teacher3);
        system.addPerson(student1);
        system.addPerson(student2);
        system.addPerson(student3);

        system.visit(new GradeExcellentAward());
        system.visit(new ScienceResearchAward());
    }
}

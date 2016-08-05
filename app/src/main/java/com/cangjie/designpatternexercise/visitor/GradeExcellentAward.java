package com.cangjie.designpatternexercise.visitor;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/5 10:21
 * email：cangjie2016@gmail.com
 */
public class GradeExcellentAward extends Award {
    @Override
    public void teacher(AcademyTeacher teacher) {
        if(teacher.getGrade() >= 90){
            DebugLog.w(teacher.getName() + " grade excellent!");
        }
    }

    @Override
    public void student(AcademyStudent student) {
        if(student.getGrade() >= 90){
            DebugLog.w(student.getName() + " grade excellent!");
        }
    }
}

package com.cangjie.designpatternexercise.visitor;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/5 10:25
 * email：cangjie2016@gmail.com
 */
public class ScienceResearchAward extends Award {
    @Override
    public void teacher(AcademyTeacher teacher) {
        if(teacher.getPaper() > 10)
            DebugLog.w(teacher.getName() + " science award");
    }

    @Override
    public void student(AcademyStudent student) {
        if(student.getPaper() > 2)
            DebugLog.w(student.getName() + " science award");
    }
}

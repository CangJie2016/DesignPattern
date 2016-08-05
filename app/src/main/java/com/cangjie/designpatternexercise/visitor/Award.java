package com.cangjie.designpatternexercise.visitor;

/**
 * author：CangJie on 2016/8/5 10:20
 * email：cangjie2016@gmail.com
 */
public abstract class Award {
    public abstract void teacher(AcademyTeacher teacher);
    public abstract void student(AcademyStudent student);
}

package com.cangjie.designpatternexercise.visitor;

/**
 * author：CangJie on 2016/8/5 10:23
 * email：cangjie2016@gmail.com
 */
public class AcademyTeacher extends AcademyPerson {
    private int paper;
    private int grade;
    private String name;

    public AcademyTeacher(int paper, int grade, String name) {
        this.paper = paper;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public void grade(Award award) {
        award.teacher(this);
    }

    public int getPaper() {
        return paper;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}

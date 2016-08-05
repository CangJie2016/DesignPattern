package com.cangjie.designpatternexercise.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * author：CangJie on 2016/8/5 10:31
 * email：cangjie2016@gmail.com
 */
public class AcademyAwardSystem {
    private List<AcademyPerson> personList = new ArrayList<>();
    public void visit(Award award){
        for (AcademyPerson person : personList)
            person.grade(award);
    }
    public void addPerson(AcademyPerson person){
        personList.add(person);
    }
}

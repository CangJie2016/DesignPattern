package com.cangjie.designpatternexercise.iterator;

/**
 * author：CangJie on 2016/8/1 15:56
 * email：cangjie2016@gmail.com
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student another) {
        if(this.getAge() > another.getAge()){
            return 1;
        }else if(this.getAge() == another.getAge()){
            return 0;
        }else if(this.getAge() < another.getAge()){
            return -1;
        }
        return 0;
    }
}

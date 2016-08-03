package com.cangjie.designpatternexercise.memento;

/**
 * author：CangJie on 2016/8/3 10:48
 * email：cangjie2016@gmail.com
 */
public class PlayerState {
    private int score;
    private int distance;
    private int skillNum;
    private String name;

    public PlayerState(int score, int distance, int skillNum, String name) {
        this.score = score;
        this.distance = distance;
        this.skillNum = skillNum;
        this.name = name;
    }
    public PlayerMemento storeMemento(){
        return new PlayerMemento(this.score,this.distance,this.skillNum);
    }
    public void restoreMemento(PlayerMemento memento){
        this.setScore(memento.getScore());
        this.setDistance(memento.getDistance());
        this.setSkillNum(memento.getSkillNum());
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getSkillNum() {
        return skillNum;
    }

    public void setSkillNum(int skillNum) {
        this.skillNum = skillNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlayerState{" +
                "score=" + score +
                ", distance=" + distance +
                ", skillNum=" + skillNum +
                ", name='" + name + '\'' +
                '}';
    }
}

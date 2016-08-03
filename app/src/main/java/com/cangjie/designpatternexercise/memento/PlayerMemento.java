package com.cangjie.designpatternexercise.memento;

/**
 * author：CangJie on 2016/8/3 10:49
 * email：cangjie2016@gmail.com
 */
class PlayerMemento {
    private int score;
    private int distance;
    private int skillNum;

    public PlayerMemento(int score, int distance, int skillNum) {
        this.score = score;
        this.distance = distance;
        this.skillNum = skillNum;
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
}

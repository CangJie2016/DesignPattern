package com.cangjie.designpatternexercise.composite;

/**
 * Created by Administrator on 2016/7/25.
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}

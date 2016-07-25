package com.cangjie.designpatternexercise.composite;

import com.cangjie.designpatternexercise.utils.DebugLog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/25.
 */
public class Folder extends AbstractFile {
    private List<AbstractFile> files = new ArrayList<>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    public void killVirus() {
        DebugLog.w(name+ " kill virus");
        for (AbstractFile file : files)
            file.killVirus();
    }
}

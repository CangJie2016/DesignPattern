package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.composite.AbstractFile;
import com.cangjie.designpatternexercise.composite.Folder;
import com.cangjie.designpatternexercise.composite.ImageFile;
import com.cangjie.designpatternexercise.composite.TextFile;

public class CompositeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);

        AbstractFile folder1,folder2,folder3,file1,file2,file3,file4;
        folder1 = new Folder("main folder");
        folder2 = new Folder("image folder");
        folder3 = new Folder("text folder");

        file1 = new ImageFile("photo.jpg");
        file2 = new ImageFile("park.jpg");
        file3 = new TextFile("computer.doc");
        file4 = new TextFile("issues.wps");

        folder1.add(folder2);
        folder1.add(folder3);

        folder2.add(file1);
        folder2.add(file2);

        folder3.add(file3);
        folder3.add(file4);

        folder1.killVirus();
    }
}

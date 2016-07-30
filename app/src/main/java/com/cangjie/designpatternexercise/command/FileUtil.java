package com.cangjie.designpatternexercise.command;

import android.os.Environment;

import com.cangjie.designpatternexercise.utils.DebugLog;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/30.
 */
public class FileUtil {
    public final static String FILE_NAME = Environment.getExternalStorageDirectory()+"/config.log";
        //将命令集合写入日志文件
        public static void writeCommands(List commands) {
            try {
                FileOutputStream file = new FileOutputStream(new File(FILE_NAME));
                //创建对象输出流用于将对象写入到文件中
                ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
                //将对象写入文件
                objout.writeObject(commands);
                objout.close();
            }
            catch(Exception e) {
                System.out.println("命令保存失败！");
                e.printStackTrace();
            }
        }

        //从日志文件中提取命令集合
        public static ArrayList readCommands() {
            try {
                FileInputStream file = new FileInputStream(new File(FILE_NAME));
                //创建对象输入流用于从文件中读取对象
                ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));

                //将文件中的对象读出并转换为ArrayList类型
                ArrayList commands = (ArrayList)objin.readObject();
                objin.close();
                return commands;
            }
            catch(Exception e) {
                System.out.println("命令读取失败！");
                e.printStackTrace();
                return null;
            }
    }
}

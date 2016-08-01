package com.cangjie.designpatternexercise.iterator;

import com.cangjie.designpatternexercise.utils.DebugLog;

import java.util.List;

/**
 * author：CangJie on 2016/8/1 15:59
 * email：cangjie2016@gmail.com
 */
public class StudentList extends AbstractList{

    public StudentList(List<Object> lists) {
        super(lists);
    }

    @Override
    public AbstractIterator iterator() {
        return new StudentIterator(this);
    }
    public class StudentIterator extends AbstractIterator{


        public StudentIterator(StudentList list) {
            super(list);
        }

        @Override
        public void next() {
            if(cursor1 < objs.size())
                cursor1++;
        }

        @Override
        public void previous() {
            if(cursor2 > -1)
                cursor2 -- ;
        }

        @Override
        public boolean isLast() {
            return cursor1 == objs.size();
        }

        @Override
        public boolean isFirst() {
            return cursor2 == -1;
        }

        @Override
        public Object getNextItem() {
            return objs.get(cursor1);
        }

        @Override
        public Object getPreviousItem() {
            return objs.get(cursor2);
        }

        @Override
        public void print(){
            while (true){
                if(isLast())
                    break;
                Student stu = (Student)getNextItem();
                DebugLog.w(stu.getName()+",年龄"+stu.getAge()+",成绩:"+stu.getScore());
                next();
            }
        }
    }
}

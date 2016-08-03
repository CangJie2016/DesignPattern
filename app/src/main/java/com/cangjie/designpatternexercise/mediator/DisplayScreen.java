package com.cangjie.designpatternexercise.mediator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * Created by Administrator on 2016/8/2.
 */
public class DisplayScreen extends Component {
    public DisplayScreen(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void fun(String info) {
        DebugLog.w("-- display : "+info);
    }
}

package com.cangjie.designpatternexercise.mediator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * Created by Administrator on 2016/8/2.
 */
public class TextView extends Component {
    public TextView(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void method2() {
        DebugLog.w("=== textView ===");
    }
}

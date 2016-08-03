package com.cangjie.designpatternexercise.mediator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * Created by Administrator on 2016/8/2.
 */
public class SaleTicketMediator extends AbstractMediator {
    private Component displayScreen ,printer ,destinationKeyboard,ticketKeyBoard ,continueBtn,cancelBtn ,card ,coin , cash ;
    private String info;

    public void setDisplayScreen(Component displayScreen) {
        this.displayScreen = displayScreen;
    }

    public void setPrinter(Component printer) {
        this.printer = printer;
    }

    public void setDestinationKeyboard(Component destinationKeyboard) {
        this.destinationKeyboard = destinationKeyboard;
    }

    public void setTicketKeyBoard(Component ticketKeyBoard) {
        this.ticketKeyBoard = ticketKeyBoard;
    }

    public void setContinueBtn(Component continueBtn) {
        this.continueBtn = continueBtn;
    }

    public void setCancelBtn(Component cancelBtn) {
        this.cancelBtn = cancelBtn;
    }

    public void setCard(Component card) {
        this.card = card;
    }

    public void setCoin(Component coin) {
        this.coin = coin;
    }

    public void setCash(Component cash) {
        this.cash = cash;
    }

    @Override
    public void operator(Component component, String str) {
        if(component.getClass() == DestinationKeyboard.class){
            this.info = str;
            DebugLog.w("已选择"+ info +"为目的站，请选择车票");
            ticketKeyBoard.fun(info);
        }else if(component.getClass() == TicketKeyBoard.class){
            DebugLog.w("已选择车票："+ info+" 。请支付");
            card.fun(info);
            coin.fun(info);
            cash.fun(info);
        }else if(component.getClass() == ContinueBtn.class){
            DebugLog.w("请继续支付");
            card.fun(info);
            coin.fun(info);
            cash.fun(info);
        }else if(component.getClass() == CancelBtn.class){
            DebugLog.w("取消当次交易！！！");
        }else if(component.getClass() == Card.class){
            DebugLog.w("已通过卡槽成功为车票支付");
        }else if(component.getClass() == Coin.class){
            DebugLog.w("已通过投币口成功为车票支付");
        }else if(component.getClass() == Cash.class){
            DebugLog.w("已通过现金槽成功为车票支付");
        }
    }
}

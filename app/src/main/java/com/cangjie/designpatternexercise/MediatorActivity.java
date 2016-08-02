package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cangjie.designpatternexercise.mediator.CancelBtn;
import com.cangjie.designpatternexercise.mediator.Card;
import com.cangjie.designpatternexercise.mediator.Cash;
import com.cangjie.designpatternexercise.mediator.Coin;
import com.cangjie.designpatternexercise.mediator.Component;
import com.cangjie.designpatternexercise.mediator.ContinueBtn;
import com.cangjie.designpatternexercise.mediator.DestinationKeyboard;
import com.cangjie.designpatternexercise.mediator.DisplayScreen;
import com.cangjie.designpatternexercise.mediator.Printer;
import com.cangjie.designpatternexercise.mediator.SaleTicketMediator;
import com.cangjie.designpatternexercise.mediator.TicketKeyBoard;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class MediatorActivity extends AppCompatActivity {
    private Component displayScreen ,printer ,destinationKeyboard,ticketKeyBoard ,continueBtn,cancelBtn ,card ,coin , cash ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        SaleTicketMediator mediator = new SaleTicketMediator();
        displayScreen =  new DisplayScreen(mediator);
        printer = new Printer(mediator);
        destinationKeyboard = new DestinationKeyboard(mediator);
        ticketKeyBoard = new TicketKeyBoard(mediator);
        continueBtn = new ContinueBtn(mediator);
        cancelBtn = new CancelBtn(mediator);
        card = new Card(mediator);
        coin = new Coin(mediator);
        cash = new Cash(mediator);

        mediator.setCancelBtn(cancelBtn);
        mediator.setCard(card);
        mediator.setCoin(coin);
        mediator.setCash(cash);
        mediator.setContinueBtn(continueBtn);
        mediator.setTicketKeyBoard(ticketKeyBoard);
        mediator.setDestinationKeyboard(destinationKeyboard);
        mediator.setPrinter(printer);
        mediator.setDisplayScreen(displayScreen);

        DebugLog.w("购票机初始化完成");
    }
    public void DestinationKB(View view){
        destinationKeyboard.operator("深圳北站");
    }
    public void buyAgain(View view){
        continueBtn.operator();
    }
    public void cancel(View view){
        cancelBtn.operator();
    }
    public void TicketKB(View view){
        ticketKeyBoard.operator();
    }
    public void card(View view){
        card.operator();
    }
    public void coin(View view){
        coin.operator();
    }
    public void cash(View view){
        cash.operator();
    }

}

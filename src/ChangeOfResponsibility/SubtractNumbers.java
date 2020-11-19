package ChangeOfResponsibility;

import ChangeOfResponsibility.Chain;
import ChangeOfResponsibility.Numbers;

public class SubtractNumbers implements Chain {

    private  Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalculationWanted() == "subtract"){
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " + (request.getNumber1() - request.getNumber2()));
        }
        else {
            nextInChain.calculate(request);
        }

    }
}

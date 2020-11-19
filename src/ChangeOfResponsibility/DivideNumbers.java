package ChangeOfResponsibility;

import ChangeOfResponsibility.Chain;

public class DivideNumbers implements Chain {

    private  Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalculationWanted() == "divide"){
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
        }
        else {
            System.out.println("Sorry only functions are Addition,Subtraction, Multiplication and Division");
        }

    }
}

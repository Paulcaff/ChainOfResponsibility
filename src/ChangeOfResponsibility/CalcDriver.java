package ChangeOfResponsibility;

import ChangeOfResponsibility.AddNumbers;

public class CalcDriver {

    public static void main(String[] args) {
       Chain addChain = new AddNumbers();
       Chain subtractChain = new SubtractNumbers();
       Chain multiplyChain = new MultiplyNumbers();
       Chain divideChain = new DivideNumbers();

       addChain.setNextChain(subtractChain);
       subtractChain.setNextChain(multiplyChain);
       multiplyChain.setNextChain(divideChain);

       Numbers request = new Numbers(104,14,"square");
       addChain.calculate(request);
    }
}

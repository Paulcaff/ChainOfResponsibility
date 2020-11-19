package ChangeOfResponsibilityRefactoring;

public class ChainDemoCOR{
    public static void main(String[] args) {
        HandlerCOR rootChain = new HandlerCOR();
        rootChain.add(new HandlerCOR());
        rootChain.add(new HandlerCOR());
        rootChain.add(new HandlerCOR());
        rootChain.wrapAround(rootChain);
        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);
            System.out.println();
        }
    }
}

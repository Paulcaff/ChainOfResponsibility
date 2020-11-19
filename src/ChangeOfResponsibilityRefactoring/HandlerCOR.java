package ChangeOfResponsibilityRefactoring;

import java.util.Random;

public class HandlerCOR {
    private final static Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    private HandlerCOR nextInChain;

    public void add(HandlerCOR next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    public void wrapAround(HandlerCOR root) {
        if (nextInChain == null) {
            nextInChain = root;
        } else {
            nextInChain.wrapAround(root);
        }
    }

    public void execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            nextInChain.execute(num);
        } else {
            System.out.println(id + "-handled-" + num);
        }
    }
}

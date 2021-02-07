package com.yevgenyk.training.designpatterns.behavioral.interpreter;

/**
 * @author Yevgeny Kuznetsov
 */
public class InterpreterDemo {

    /**
     * This represents the possible expressions the interpreter accepts - the rule set/grammar/language of the
     * interpreter. We add rules here to control our interpreter "language".
     */
    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        // Bears and (Lions or (Tigers and Bears))
        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
        // Creates the possible expressions tree:
        Expression define = buildInterpreterTree();

        // Lions is not an acceptable expression:
        String context = "Lions";
        System.out.println(String.format("%s is %s", context, define.interpret(context)));

        // Bears and Lions is an acceptable expression:
        context = "Bears Lions";
        System.out.println(String.format("%s is %s", context, define.interpret(context)));

        // Bears and Tigers is an acceptable expression:
        context = "Bears Tigers";
        System.out.println(String.format("%s is %s", context, define.interpret(context)));
    }
}

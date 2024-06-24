package com.example.calculator;

public class Operation{
    public static Stage currentStage=Stage.FIRST_STAGE;
    private static Integer a=0;
    private static Integer b=0;
    private static Symbol symbol = Symbol.emptySymbol;

    public static void doNumberAction(int symbolINT){
        System.out.println("doNumberAction");
        if(currentStage == Stage.FIRST_STAGE){
            if(a == 0){
                Operation.setA(symbolINT);
            }else{
                Operation.setA(addFromLabelA(symbolINT));
            }
        }
        if(currentStage == Stage.SECOND_STAGE){
            if (b == 0) {
                Operation.setB(symbolINT);
            } else {
                Operation.setB(addFromLabelB(symbolINT));
            }
        }
    }
    public static void doNumberAction(){
        System.out.println("doNumberAction");
        if(currentStage == Stage.FIRST_STAGE && a != 0){
            if(getA() > 0){
                setA(getA() / -1);
            }else if (getA() < 0) {
                setA(getA() / -1);
            }
        }
        if(currentStage == Stage.SECOND_STAGE && b != 0){
            if(getB() > 0){
                setB(getB() / -1);
            }else if (getB() < 0) {
                setB(getB() / -1);
            }
        }
    }

    public static void doSymbolAction(Symbol symbolAction){
        System.out.println("setSymbol");
        currentStage = Stage.SECOND_STAGE;
        setSymbol(symbolAction);
    }

    public static void doMainOperation(){
        int result=0;
        switch (symbol){
            case subtraction -> result = getA() - getB();
            case division -> {
                if(getB() == 0 )result = 0;
                else result = getA() / getB();
            }
            case addition -> result = getA() + getB();
            case multiplication -> result = getA() * getB();
        }
        doDelete();
        setA(result);
        currentStage = Stage.FIRST_STAGE;
    }

    public static void doDelete(){
        setSymbol(Symbol.emptySymbol);
        setA(0);
        setB(0);
        currentStage = Stage.FIRST_STAGE;
    }

    public static int addFromLabelA(int symbolINT){
         if(getA().toString().length() == 9){
            return getA();
        }else return Integer.parseInt(getA().toString() +symbolINT);
    }

    public static int addFromLabelB(int symbolINT) {
        if(getB().toString().length() == 9){
            return getB();
        }else return Integer.parseInt( getB() + String.valueOf(symbolINT));
    }

    public static Integer getA() {
        return a;
    }

    public static void setA(Integer a) {
        Operation.a = a;
        if (a == 0)Calculator.label1.setText(null);
        else Calculator.label1.setText(a.toString());

    }

    public static Integer getB() {
        return b;

    }

    public static void setB(Integer b) {
        Operation.b = b;
        if(b == 0)Calculator.label3.setText(null);
        else Calculator.label3.setText(b.toString());

    }

    public static void setSymbol(Symbol symbolSet){
        Operation.symbol = symbolSet;
        if(symbolSet == Symbol.emptySymbol) Calculator.label2.setText(null);
        else Calculator.label2.setText(symbolSet.toString());

    }
    public enum Symbol{
        division('/'), multiplication('*'), addition('+'), subtraction('-'),
        delete('C'), equals('='), emptySymbol('0'), plusMinus('∓');

        final Character strSym;
        Symbol(Character strSym){
            this.strSym = strSym;
        }
        @Override
        public String toString(){
            return this.strSym.toString();
        }
            }
    public enum Stage{
        FIRST_STAGE(),
        SECOND_STAGE(),
    }
}

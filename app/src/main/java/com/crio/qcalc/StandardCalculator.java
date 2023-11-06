package com.crio.qcalc;

public class StandardCalculator {
    private int result;


public int getResult()
{
    return result;
}

private void setResult(int value)
{
    this.result= value;
}


public void clearResult()
{
    result = 0;
}


public void printResult()
{
    System.out.println("Standard Calculator Result:"+ getResult());
}

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }


public void add(int num1, int num2)
{
    int sum=0;
    sum= num1+num2;
    setResult(sum);
}


public void subtract(int num1, int num2)
{
    int sub=0;
    sub = num1-num2;
    setResult(sub);
}


public void multiply(int num1, int num2)
{
    int prod=0;
    prod = num1*num2;
    setResult(prod);
}


public void divide(int num1, int num2)
{
    int div=0;
    div = num1/num2;
    setResult(div);
}

}

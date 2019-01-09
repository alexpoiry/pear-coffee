package me.alex.tryitout.ps.jfundlang;

public class CalcEngine {
  private double val1, val2, result;
  private char opCode;

  public void calc(double val1, double val2, char opCode) {
    this.val1 = val1;
    this.val2 = val2;
    this.opCode = opCode;

    if(opCode == 'a')
      result = val1 + val2;
    else if(opCode == 's')
      result = val1 - val2;
    else if(opCode == 'm')
      result = val1 * val2;
    else if(opCode == 'd')
      result = val1 / val2;
    else if(opCode == 'f')
      result = factorial(val1);
  }

  private double factorial(double val1) {
    int factorial = 1;
    while(val1 > factorial) {
      factorial *= val1--;
    }
    return factorial;
  }
}

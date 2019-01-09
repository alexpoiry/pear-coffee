package me.alex.tryitout.ps.jfundlang;

public class LogicMain {
  public static void main(String... args) {
    //Conditional assignment:
    // result = condition ? true-value : false-value;
    String test = true ? "true" : "false";
    System.out.print("Testing the code: String test = true ? \"true\" : \"false\";... Result = ");
    System.out.println(test);
    System.out.println();

    //Blocks are delimited with { }
    //Variables have a scope
    //A variables scope is only within the bounds of its block

    //Logical Operators
    // & = AND
    // | = OR
    // ^ = XOR
    // ? = NOT

    //Conditional Logical Operators
    //Just like logical operators, but they stop if the first value definitely indicates the result, i.e.,
    // if true || false
    // The second check won't occur, since we already know the value will be true.

    //while(condition) loops execute so long as the condition being checked is true.

    //do-while(condition) loops are the same as while loops except the do block is always done at least once.
  }
}

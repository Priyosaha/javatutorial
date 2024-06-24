import java.util.Scanner;

import java.io.StringWriter;
import java.io.PrintWriter;
public class Demo{

public static void main(String[] args){

String x = "abcdef";
String y = "abcdes";

if(x==y){
    System.out.println("true");
}else{
    System.out.println("false");
}

System.out.println(x.substring(0, 6));

}
}
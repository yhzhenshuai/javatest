package test1;

import java.util.Scanner;

public class work1 {
  public static void main(String[] args) {
	Circle x;
	Rectangle y;
	//final double PI=3.1415;
	x=new Circle();
	y=new Rectangle();
//	System.out.println("r="+x.r);
//	System.out.println(x);
    System.out.println(y);
//	System.out.println("wid="+y.wid+" "+"heg="+y.heg);
	Scanner input=new Scanner(System.in);
	x.r=input.nextInt();
	y.wid=input.nextDouble();
	y.heg=input.nextDouble();
    x.s=Math.PI*(x.r)*(x.r);
    input.close();
	y.s=y.wid*y.heg;
	System.out.println("圆的面积是"+x.s+"  "+"矩形的面积是"+y.s);
  }
}

package pk;

import java.util.Scanner;

interface addtion{
    float add(float a, float b);
}
interface difference{
    float diff(float a, float b);
}
interface product{
    float prod(float a, float b);
}
interface safedivision{
    float safe(float a, float b);
}

   

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 float aa=sc.nextFloat();
	 float bb=sc.nextFloat();
	 
	 addtion add = (float a, float b) -> {
         return (a + b);
     };
     difference diff=(float a, float b)->{
         return (a-b);
     };
     product prod=(float a, float b)->{
         return (a*b);
     };
     safedivision sfd=(float a, float b)->{
         return (a/b);
     };
	System.out.println(add.add(aa,bb));
	System.out.println(diff.diff(aa, bb));
	System.out.println(prod.prod(aa, bb));
	System.out.println(sfd.safe(aa, bb));
}
}
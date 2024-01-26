//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] My2DArray={ {1,2,3,4},
                            {1,6,7,8},
                            {4,8,9,6},
                            {7,8,2,3,}
        };
        int sum=0;
        System.out.println("      ---ARRAY---       ");
        System.out.println("Hello and welcome! This is 2-D Array printed in Java");
        for(int row=0; row<My2DArray.length; row++) {
            for(int column=0; column<My2DArray[row].length; column++){
                System.out.print(My2DArray[row][column] + " ");
                sum=sum+My2DArray[row][column];
              }
           System.out.println(" ");
        }
        System.out.println("Sum of All Elements In 2D-Array Given Above:");
        System.out.println(sum);
        /*for(int row=0; row<My2DArray.length; row++) {
            for(int column=0; column<My2DArray[row].length; column++){
                sum=sum+My2DArray[row][column];
            }
        }
        System.out.println(sum);*/

        System.out.println("      ---STRING FUNCTION---       ");
        char[] myArrayOfChar={'W','E','L','C','O','M','E'};
        String firstString="WELCOME";
        //string is the sequence of characters
        System.out.println("Length of Char Array: " + myArrayOfChar.length);
        System.out.println("Length of string: " + firstString.length());
        System.out.println("Element at index 2 of String: " + firstString.charAt(2));
        System.out.println("Element at index 2 of String: " + firstString.charAt(6));
        System.out.println("Converting the string to LowerCase: " + firstString.toLowerCase());
        System.out.println("Converting the string to UpperCase: " + firstString.toUpperCase());
        System.out.println("Checking the element J in String: " + firstString.contains("j"));
        sayHello();
        sayHello();    //method can be called as many times we need
    }
    public static void sayHello(){  //this is how we create new method
        System.out.println("      ---METHOD---       ");  //to make this method usable we need to call method in main method
    }


}























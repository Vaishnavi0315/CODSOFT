
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name;
        int age;
        String bloodGrp;
        String GrpColor = null;

        System.out.print("Enter Student Name:");
        name= scanner.next();

        System.out.print("Enter Student Age:");
        age = scanner.nextInt();

        System.out.print("Enter Student Blood Group:");
        bloodGrp= scanner.next();
        
        
        if(age>=20){
            GrpColor="RED";
        } else if (age>=15 && age<20) {
            GrpColor="BLUE";
        } else if (age>=10 && age<15) {
            GrpColor="YELLOW";
        }else{
            System.out.println("Due to invalid age can't decide your group");
        }

        System.out.println("---------------------------------");
        System.out.println("    Name:" + name);
        System.out.println("    Age:" + age);
        System.out.println("    Blood Group:" + bloodGrp);
        System.out.println("---------------------------------");
        System.out.println("    Your Group Name is " + GrpColor);
        System.out.println("---------------------------------");
        






    }
}
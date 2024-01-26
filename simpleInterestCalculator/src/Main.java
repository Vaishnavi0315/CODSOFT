public class Main {
    public static void main(String[] args) {
        System.out.println("    ----SIMPLE INTEREST CALCULATOR----    ");

        double si1=calculatesSimpleInterest(10000,15.56f,789);
        System.out.println(si1);
        double si2=calculatesSimpleInterest(145600,875.3f,7245);
        System.out.println(si2);

        System.out.println("--Addition of 2 nos--");
        int n1=45;
        int n2=89;
        int sum1= SumOfNos(n1,n2);
        System.out.println("Addition of " + n1 + " & " + n2 + " = " + sum1);

        System.out.println("   ----METHOD OVERLOADING----   ");

        add();

        add(45,89);

        add(45.23f,98.23f,78.56f);

    }
    public static double calculatesSimpleInterest(int principle, float rateOfInterest, int timePeriod) {
        double si = principle * rateOfInterest * timePeriod / 100;
        //System.out.println("Simple Interest for user: " + si);
        return si;
    }
    public static int SumOfNos(int No1, int No2){
        int Sum = No1+No2;
        return Sum;
    }
    /*In method overloading the method name remains the same but the parameters changes.
     Method Overloading: same method name but different parameters*/
    public static void add(){            //Method 1
        int sum=4+5;
        System.out.println(sum);
    }

    public static void add(int a, int b){ //Method 2
        int sum = a+b;
        System.out.println(sum);
    }

    public static void add(float a, float b, float c){//method 3
        float sum =a+b+c;
        System.out.println(sum);
    }

}
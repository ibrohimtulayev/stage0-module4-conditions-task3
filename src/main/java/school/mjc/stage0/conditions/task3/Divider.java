package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if(number % 5 == 0 && number % 11== 0){
            System.out.println("Divedable");
        }else {
            System.out.println("Non-dividable");
        }if (number==0)
            System.out.println("cannot divided by zero");
    }
}

package Junittests;

public class FactorialCalculation {


    public  long calculatefactorial(int a){
        if(a<0) throw new IllegalArgumentException("შეყვანილი რიცხი არ უნდა იყოს უარყოფითი");

        long ans=1;
        for (int i = 0; i < a; i++) {
            ans=ans*i;
        }
        return ans;

    }



}

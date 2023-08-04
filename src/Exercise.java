public class Exercise {

    public static void main(String[] args) {
       int pounds = 10000;
       int euro = 0;
       int days = 0;
       double poundToEuro = 1 + (Math.random()* 0.2);

       while (pounds > 0) {
           poundToEuro = 1 + (Math.random()* 0.2);
           if (poundToEuro > 1.15) {
               int poundToSell = Math.min(1000, pounds);
               euro += (int) (poundToSell * poundToEuro);
               pounds -=poundToSell;
           }
           days++;
       }
        System.out.println("Number of days to sell all pounds: " + days);
    }
   }


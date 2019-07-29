import java.util.Scanner;

class prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        boolean valore = scanner.nextBoolean();
        boolean b = true;

        if(value>=10 && value<=20 && valore==false )
        {
            b = true;
        } else if(value>=10 && value<=20 && valore==true)
        {
            b = false;
        } else if(value>=15 && value<=25 && valore==true )
        {
            b = true;
        }
        else if(value>=15 && value<=25 && valore==false)
        {
            b=false;
        } else{
            b= false;
        }

        System.out.println(b);


//        import java.util.Scanner;
//
//        class Main {
//            public static void main(String[] args) {
//                final Scanner scanner = new Scanner(System.in);
//
//                final int peanuts = scanner.nextInt();
//                final boolean isWeekend = scanner.nextBoolean();
//                final boolean goodForNormalDays = peanuts >= 10 && peanuts <= 20 && !isWeekend;
//                final boolean goodForWeekend = peanuts >= 15 && peanuts <= 25 && isWeekend;
//
//                System.out.println(goodForNormalDays || goodForWeekend);
//            }
//        }



    }
}

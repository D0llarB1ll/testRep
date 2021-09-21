    public class Main{
        public static void main(String[] args){
            Date d1 = new Date("2028/4/25");
            Date d2 = new Date(2025, 7, 23);
            d1.Plus(70);
            d1.Print();
            d2.Minus(984);
            d2.Print();
            int d = Date.Delay(d1, d2);
            System.out.print("Дней между датами: ");
            System.out.println(d);
        }
    }

    package d6if_switch_ternary;

    public class Switch01 {
        public static void main(String[] args) {
            String dayname="WEDnesday";
            if (dayname.equalsIgnoreCase("Sunday")) {
                System.out.println(1);
            } else if (dayname.equalsIgnoreCase("Mondey")) {
                System.out.println(2);
            } else if (dayname.equalsIgnoreCase("tuesday")) {
                System.out.println(3);
            } else if (dayname.equalsIgnoreCase("Wednesday")) {
                System.out.println(4);
            } else if (dayname.equalsIgnoreCase("Thursday")) {
                System.out.println(5);
            } else if (dayname.equalsIgnoreCase("Friday")) {
                System.out.println(6);
            } else if (dayname.equalsIgnoreCase("Saturday")) {
                System.out.println(7);
            }else {
                System.out.println("lütfen geçerli bir gün giriniz ");
            }


            switch (dayname.toLowerCase()) {
                case "sunday":
                    System.out.println(1);
                    break;
                case "Mondey":

                    System.out.println(2);
                    break;
                case "tuesday":
                    System.out.println(3);
                    break;
                case "wednesday":
                    System.out.println(4);
                    break;
                case "thursday":
                    System.out.println(5);
                    break;
                case "friday":
                    System.out.println(6);
                    break;
                case "saturday":
                    System.out.println(7);
                    break;
                default:
                    System.out.println("geçerli bir gün giriniz");


            }
        }
    }

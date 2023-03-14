package strings;

public class StringStarsEndsWith {
    public static void main(String[] args) {

        String banner = "ThanksGiving Sale 20%";
        boolean isSale = banner.startsWith("Thanks");//true
        System.out.println(isSale);
        System.out.println(banner.startsWith("thanks"));//false
        System.out.println(banner.startsWith("T"));//true
        System.out.println(banner.startsWith("Giving"));//false


        boolean endsWith = banner.endsWith("%");//true
        System.out.println(banner.endsWith("Sale 20"));//false
        System.out.println(banner.endsWith("sale 20%"));//false
        

    }
}

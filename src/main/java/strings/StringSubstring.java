package strings;

public class StringSubstring {
    public static void main(String[] args) {
        String messege = "Hello Chicago, why are you cold and windy?";
        String city = messege.substring(6,13);
        System.out.println(city);
        String question = messege.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA,our population is 140 million people, "
                +"the average salary is 90k dollars,and our president is Joe Biden";
        String country = welcomeSign.substring(11,14);
        System.out.println(country);
        String  population = welcomeSign.substring(33,45);
        System.out.println(population);
        String salary = welcomeSign.substring(welcomeSign.indexOf("9"),welcomeSign.indexOf(",and"));
        System.out.println(salary);
        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);

        String phrase = "Just one positive thought in the morning can change your whole day";
        System.out.println(phrase.substring(0,4) + " a " + phrase.substring(18,25));
        int  beginIndex = phrase.indexOf("positive");
        int endIndex = phrase.indexOf("thought");
        int morning = phrase.indexOf("morning");
        int morning2 = phrase.indexOf("can");
        System.out.println(phrase.substring(beginIndex,endIndex)+phrase.substring(morning,morning2));

        int whole = phrase.indexOf("w");
        int whole2 = phrase.indexOf("day");
        System.out.println(phrase.substring(whole,whole2)+phrase.substring(morning,morning2));

        int one = phrase.indexOf("one");
        int one1 = phrase.indexOf("positive");
        int day = phrase.indexOf("d");
        int day2 = phrase.indexOf("");




        String str = "hi";
        String str2 = "bye";
        System.out.println(str2+str2+str2+str);
        System.out.println(str+" "+str2+" "+str.toUpperCase()+ " "+str.toUpperCase()+" "+str2.toUpperCase()+" "+str2+" "+str2+" "+str);
        System.out.println(str2.substring(0,1)+str.substring(1));
        System.out.println(str.replace('h','b'));
        System.out.println(str2.charAt(0)+""+str.charAt(1));

        String see = "see";
        String hear = "hear";
        System.out.println(see.substring(0,1)+hear.substring(1,4));
        System.out.println(hear.replace('h','s'));
        System.out.println(see.charAt(0)+hear.substring(1,4));




    }
}

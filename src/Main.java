public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if(grade <= 49){
            return 'F';
        }
        else if(grade <= 59 && grade >= 50){
            return 'E';
        }
        else if(grade <= 69 && grade >= 60){
            return 'D';
        }
        else if(grade <= 79 && grade >= 70){
            return 'C';
        }
        else if(grade <= 89 && grade >= 80){
            return 'B';
        }
        else{
            return 'A';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int n) {
        if(n%3==0 && n%5==0){
            return "fizzbuzz";
        }
        else if(n%3==0){
            return "fizz";
        }
        else if(n%5==0){
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if(str.length()>=3){
            String front = str.substring(0,2);
            return front+str+front;
        }
        else if(str.length() == 2){
            return str+str+str;
        }
        else{
            return str;
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if(a+b==c || a+c==b || b+c==a){
            return true;
        }
        return false;
    }
    // Question 5 - endUp
    public static String endUp(String str){
        if(str.length()>=3){
            int len = str.length();
            int thirdLast = str.length()-3;
            String sub = str.substring(thirdLast,len);
            String front = str.substring(0,thirdLast);
            String nextSub = sub.toUpperCase();
            return front + nextSub;
        }
        else{
            return str.toUpperCase();
        }
    }
}

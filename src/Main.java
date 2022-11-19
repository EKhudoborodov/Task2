import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        // TASK №1
            System.out.printf("repeat(\"mice\", 5) -> \"%s\"\n", repeat("mice", 5));
            System.out.printf("repeat(\"hello\", 3) -> \"%s\"\n", repeat("hello", 3));
            System.out.printf("repeat(\"stop\", 1) -> \"%s\"\n\n", repeat("stop", 1));
        // TASK №2
            System.out.printf("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> %d\n", differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
            System.out.printf("differenceMaxMin([44, 32, 86, 19]) -> %d\n\n", differenceMaxMin(new int[] {44, 32, 86, 19}));
        // TASK №3
        int[] c={1,3}, d={1, 2, 3, 4}, e={1, 5, 6}, f={1, 1, 1}, g={9, 2, 2, 5};
            System.out.printf("isAvgWhole([1, 3]) -> %b\n", isAvgWhole(c));
            System.out.printf("isAvgWhole([1, 2, 3, 4]) -> %b\n", isAvgWhole(d));
            System.out.printf("isAvgWhole([1, 5, 6]) -> %b\n", isAvgWhole(e));
            System.out.printf("isAvgWhole([1, 1, 1]) -> %b\n", isAvgWhole(f));
            System.out.printf("isAvgWhole([9, 2, 2, 5]) -> %b\n\n", isAvgWhole(g));
        // TASK №4
        int[] h={1, 2, 3}, i={1, -2, 3}, k={3, 3, -2, 408, 3, 3};
            System.out.printf("cumulativeSum([1, 2, 3]) -> %s\n", printArray(cumulativeSum(h)));
            System.out.printf("cumulativeSum([1, -2, 3]) -> %s\n", printArray(cumulativeSum(i)));
            System.out.printf("cumulativeSum([3, 3, -2, 408, 3, 3]) -> %s\n\n", printArray(cumulativeSum(k)));
        // TASK №5
            System.out.printf("getDecimalPlaces(\"43.20\") -> %d\n", getDecimalPlaces("43.20"));
            System.out.printf("getDecimalPlaces(\"400\") -> %d\n", getDecimalPlaces("400"));
            System.out.printf("getDecimalPlaces(\"3.1\") -> %d\n\n", getDecimalPlaces("3.1"));
        // TASK №6
            System.out.printf("Fibonacci(3) -> %d\n", Fibonacci(3));
            System.out.printf("Fibonacci(7) -> %d\n", Fibonacci(7));
            System.out.printf("Fibonacci(12) -> %d\n\n", Fibonacci(12));
        // TASK №7
            System.out.printf("isValid(\"59001\") -> %b\n", isValid("59001"));
            System.out.printf("isValid(\"853a7\") -> %b\n", isValid("853a7"));
            System.out.printf("isValid(\"732 32\") -> %b\n", isValid("732 32"));
            System.out.printf("isValid(\"393939\") -> %b\n\n", isValid("393939"));
        // TASK №8
            System.out.printf("isStrangePair(\"ratio\", \"orator\") -> %b\n", isStrangePair("ratio", "orator"));
            System.out.printf("isStrangePair(\"sparkling\", \"groups\") -> %b\n", isStrangePair("sparkling", "groups"));
            System.out.printf("isStrangePair(\"bush\", \"hubris\") -> %b\n", isStrangePair("bush", "hubris"));
            System.out.printf("isStrangePair(\"\", \"\") -> %b\n\n", isStrangePair("", ""));
        // TASK №9
            System.out.printf("isPrefix(\"automation\", \"auto-\") -> %b\n", isPrefix("automation", "auto-"));
            System.out.printf("isSuffix(\"arachnophobia\", \"-phobia\") -> %b\n", isSuffix("arachnophobia", "-phobia"));
            System.out.printf("isPrefix(\"retrospect\", \"sub-\") -> %b\n", isPrefix("retrospect", "sub-"));
            System.out.printf("isSuffix(\"vocation\", \"-logy\") -> %b\n\n", isSuffix("vocation", "-logy"));
         // TASK №10
            System.out.printf("boxSeq(0) -> %d\n", boxSeq(0));
            System.out.printf("boxSeq(1) -> %d\n", boxSeq(1));
            System.out.printf("boxSeq(2) -> %d\n", boxSeq(2));

    }
    // TASK №1
    public static String repeat(String s, int n){ // повторить символы строки n раз
        String new_s = "";
        for(int i=0; i<s.length(); ++i){
            for(int j=0; j<n; ++j){
                new_s += s.charAt(i);
            }
        }
        return new_s;
    }
    // TASK №2
    public static int differenceMaxMin(int[] s){ // разница между максимальным и минимальным числом массива
        int min=s[0], max=s[0];
        for (int i : s) {
            if (min > i) {
                min = i;
            }if(max < i){
                max = i;
            }
        }
        return max-min;
    }
    // TASK №3
    public static boolean isAvgWhole(int[] s){ // является ли среднее значение целым числом
        int cnt=0;
        for(int i:s){
            cnt += i;
        }
        return cnt%s.length==0;
    }
    // TASK №4
    public static int[] cumulativeSum(int[] s){ // массив префиксных сумм
        for(int i=1; i<s.length; i++){
            s[i]=s[i]+s[i-1];
            //System.out.print(s[i]);
        }
        //System.out.println();
        return s;
    }
    public static String printArray(int[] s){ // функция для вывода массива как в примере
        String a="[";
        for (int i=0; i<s.length; i++){
            if(i!=s.length-1){a+=s[i]+", ";}
            else {a+=s[i]+"]";}
        }
        return a;
    }
    // TASK №5
    public static int getDecimalPlaces(String s){ // десятичная часть числа
        int res = 0, check=0;
        for(int i=0; i<s.length(); i++){
            if(check==1){
                res++;
            }
            if(s.charAt(i)=='.'){
                check=1;
            }
        }
        return res;
    }
    // TASK №6
    public static int Fibonacci(int s){ // число Фибоначчи под номером s
        int[] res = {0, 1};
        int k=0;
        for(int i=0; i < s; i++){
            res[k]+=res[1-k];
            k = 1-k;
        }
        return res[1-k];
    }
    // TASK №7
    public static boolean isValid(String s){ // длина только 5, без пробелов, только цифры
        if(s.length()!=5){
            return false;
        }else{
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)==' '){
                    return false;
                }else if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                    return false;
                }
            }
            return true;
        }
    }
    // TASK №8
    public static boolean isStrangePair(String s, String k){ // проверить совпадение первых и последних символов строк
       if(s=="" && k==""){
           return true;
       }else if(s=="" || k==""){
           return false;
       }
       else{
           return (s.charAt(0)==k.charAt(k.length()-1)&&s.charAt(s.length()-1)==k.charAt(0));
       }
    }
    // TASK №9
    public static boolean isPrefix(String s, String k){ // начинается ли строка s со строки k
        for (int i = 0; i<k.length()-1; i++){
            if(s.charAt(i)!=k.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isSuffix(String s, String k){ // заканчивается ли строка s строкой k
        for(int i=s.length()-k.length()+1;i<s.length();i++){
            //System.out.printf("%s, %s",s.charAt(i), k.charAt(i+k.length()-s.length()));
            if(s.charAt(i)!=k.charAt(i+k.length()-s.length())){
                return false;
            }
        }
        return true;
    }
    // TASK №10
    public static int boxSeq(int s){ // s/2+s%2 - нечётные итерации (*3); s/2 - чётные итерации(-1)
        return 3*((s/2)+(s%2))-(s/2);
    }
}
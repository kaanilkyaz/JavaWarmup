public class RepeatedString {

    static long repeatedString(String s, long n) {
       long times = (n/s.length());
       int remainder = (int) (n%s.length());
       int numberOfa = 0;

       for(Character c:s.toCharArray()){
           if(c == 'a'){
               numberOfa++;
           }
       }
       long total = numberOfa*times;
        if(remainder>0){
           String add = s.substring(0,remainder);
           for(Character c:add.toCharArray()){
               if(c == 'a'){
                   total++;
               }
           }
       }
       return total;

    }
}

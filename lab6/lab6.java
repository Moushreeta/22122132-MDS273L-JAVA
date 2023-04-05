import java.io.*;
import java.util.*;

public class lab6
{   
    public static List<String> textToArray(String input) {
        String frequent_word = "";
        List<String> words = new ArrayList<String>();
        for (String str : new String[]{input}) {
            String[] arr=new String[input.length()];
            arr=str.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
            for (String w : arr) {
                
                words.add(w);
            }
        }
        return words;
    }

    public static void countVowels(String input) {
        int a_count=0;
        int e_count=0;
        int i_count=0;
        int o_count=0;
        int u_count=0;
        input.toLowerCase();
        for (int i=0 ; i<input.length(); i++){
            char ch = input.charAt(i);
            switch(ch){
                case 'a':   
                    a_count++;  
                    break;
                case 'e':   
                    e_count++;
                    break;
                case 'i':   
                    i_count++; 
                    break;
                case 'o':   
                    o_count++;  
                    break;
                case 'u':   
                    u_count++;  
                    break;
            }
         }
         Map<String,Integer> output= new LinkedHashMap<>();
         output.put("Number of A: ", a_count);
         output.put("Number of E: ", e_count);
         output.put("Number of I: ", i_count);
         output.put("Number of O: ", o_count);
         output.put("Number of U: ", u_count);
        for (Map.Entry<String, Integer> me :
             output.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

    public static void countDigits(String input) {
        int zero_count=0;
        int one_count=0;
        int two_count=0;
        int three_count=0;
        int four_count=0;
        int five_count=0;
        int six_count=0;
        int seven_count=0;
        int eight_count=0;
        int nine_count=0;
        for (int i=0 ; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
            switch(ch){
                case '0':   
                    zero_count++; 
                    break;
                case '1':   
                    one_count++;   
                    break;
                case '2':   
                    two_count++; 
                    break;  
                case '3':   
                    three_count++;  
                    break;
                case '4':   
                    four_count++;  
                    break;
                case '5':   
                    five_count++;  
                    break;
                case '6':  
                 
                    six_count++;
                    break;    
                case '7':   
                    seven_count++;
                    break;    
                case '8':   
                    eight_count++;
                    break;    
                case '9':   
                    nine_count++;
                    break;      
                    }
                 }
        }
        Map<String,Integer> output= new LinkedHashMap();
         output.put("Number of 0: ", zero_count);
         output.put("Number of 1: ", one_count);
         output.put("Number of 2: ", two_count);
         output.put("Number of 3: ", three_count);
         output.put("Number of 4: ", four_count);
         output.put("Number of 5: ", five_count);
         output.put("Number of 6: ", six_count);
         output.put("Number of 7: ", seven_count);
         output.put("Number of 8: ", eight_count);
         output.put("Number of 9: ", nine_count);
         for (Map.Entry<String, Integer> me :
         output.entrySet()) {
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
        }
    }
    
    public static void mostUsed(String input) {
            List<String> list = textToArray(input);
            String[] words=list.toArray(new String[0]);
            Map<String,Integer> map=new LinkedHashMap<>();
            ArrayList<Integer> a=new ArrayList();
            Map<String,Integer> output=new LinkedHashMap<>();
            for(int i=0;i<words.length;i++){
                map.put(words[i],map.getOrDefault(words[i],0)+1);
            }
            
            for(Map.Entry<String,Integer> e:map.entrySet()){
                a.add(e.getValue());
            }
            Collections.sort(a);
            
            int j=a.size()-1;
            for(int i=0;i<5;i++){
                for(Map.Entry<String,Integer>e:map.entrySet()){
                    if(a.get(j)==e.getValue()){
                        output.put(e.getKey(),e.getValue());
                        map.remove(e.getKey());
                        j--;
                        break;
                    }
                }
            }
            for (Map.Entry<String, Integer> me :
         output.entrySet()) {
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
        }
    }
    
    public static void leastUsed(String input) {
            List<String> list = textToArray(input);
            String[] words=list.toArray(new String[0]);
            Map<String,Integer> map=new LinkedHashMap<>();
            ArrayList<Integer> a=new ArrayList();
            Map<String,Integer> output=new LinkedHashMap<>();
            for(int i=0;i<words.length;i++){
                map.put(words[i],map.getOrDefault(words[i],0)+1);
            }
            
            for(Map.Entry<String,Integer> e:map.entrySet()){
                a.add(e.getValue());
            }
            Collections.sort(a, Collections.reverseOrder());
            
            int j=a.size()-1;
            for(int i=0;i<5;i++){
                for(Map.Entry<String,Integer>e:map.entrySet()){
                    if(a.get(j)==e.getValue()){
                        output.put(e.getKey(),e.getValue());
                        map.remove(e.getKey());
                        j--;
                        break;
                    }
                }
            }
            for (Map.Entry<String, Integer> me :
         output.entrySet()) {
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
        }
    }
    
    public static void mostUsedChar(String input) {
        List<String> list = textToArray(input);
        String[] words=list.toArray(new String[0]);
        List<String> chars=new ArrayList<>();
        for(String i:words){
            for(String j:i.split("")){
                if(Character.isAlphabetic(j.charAt(0))){
                    chars.add(j);
                }
            }
        }
        Map<String,Integer> map=new LinkedHashMap<>();
            ArrayList<Integer> a=new ArrayList();
            Map<String,Integer> output=new LinkedHashMap<>();
            String[] characters=chars.toArray(new String[0]);
            for(int i=0;i<characters.length;i++){
                map.put(characters[i],map.getOrDefault(characters[i],0)+1);
            }
            
            for(Map.Entry<String,Integer> e:map.entrySet()){
                a.add(e.getValue());
            }
            Collections.sort(a);
            
            int j=a.size()-1;
            for(int i=0;i<5;i++){
                for(Map.Entry<String,Integer>e:map.entrySet()){
                    if(a.get(j)==e.getValue()){
                        output.put(e.getKey(),e.getValue());
                        map.remove(e.getKey());
                        j--;
                        break;
                    }
                }
            }
            for (Map.Entry<String, Integer> me :
         output.entrySet()) {
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
        }
    }
            
    public static void leastUsedChar(String input) {
        List<String> list = textToArray(input);
        String[] words=list.toArray(new String[0]);
        List<String> chars=new ArrayList<>();
        for(String i:words){
            for(String j:i.split(""))
            if(Character.isAlphabetic(j.charAt(0))){
            chars.add(j);
        }
    }
        Map<String,Integer> map=new LinkedHashMap<>();
            ArrayList<Integer> a=new ArrayList();
            Map<String,Integer> output=new LinkedHashMap<>();
            String[] characters=chars.toArray(new String[0]);
            for(int i=0;i<characters.length;i++){
                map.put(characters[i],map.getOrDefault(characters[i],0)+1);
            }
            
            for(Map.Entry<String,Integer> e:map.entrySet()){
                a.add(e.getValue());
            }
            Collections.sort(a, Collections.reverseOrder());
            
            int j=a.size()-1;
            for(int i=0;i<5;i++){
                for(Map.Entry<String,Integer>e:map.entrySet()){
                    if(a.get(j)==e.getValue()){
                        output.put(e.getKey(),e.getValue());
                        map.remove(e.getKey());
                        j--;
                        break;
                    }
                }
            }
            for (Map.Entry<String, Integer> me :
         output.entrySet()) {
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
        }
    }
  
  public static void main(String[] args)
  {
    // pass the path to the file as a parameter
    try{
        File file = new File("C:/Users/Priyo/Downloads/text.txt");
        Scanner sc = new Scanner(file);
        StringBuilder ip = new StringBuilder();
        
        while (sc.hasNextLine()){
            ip.append(sc.nextLine());
        }
        sc.close();
        String paragraph = ip.toString();
        // System.out.println(paragraph);
        System.out.println("Counts of vowels are the following.");
        System.out.println();
        countVowels(paragraph);
        System.out.println();
        System.out.println("Number of Digits are the following.");
        System.out.println();
        countDigits(paragraph);
        System.out.println();
        System.out.println("The top five most used words and their counts are the following.");
        System.out.println();
        mostUsed(paragraph);
        System.out.println();
        System.out.println("The top five least used words and their counts are the following.");
        System.out.println();
        leastUsed(paragraph);
        System.out.println();
        System.out.println("The top five most repeated characters and their counts are the following.");
        System.out.println();
        mostUsedChar(paragraph);
        System.out.println();
        System.out.println("The top five least used characters and their counts are the following.");
        System.out.println();
        leastUsedChar(paragraph);
    } catch(FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      } 
}
}
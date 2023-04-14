import java.io.*;
import java.util.*;
import java.util.Arrays;

public class lab7{
    static int nrow = -1;
    
    public static void Mean(String[][] data){
        double setosa_sepal_lengthhhhh = 0;
        double setosa_sepal_width = 0;
        double setosa_petal_length = 0;
        double setosa_petal_width = 0;
        double versicolor_sepal_length = 0;
        double versicolor_sepal_width = 0;
        double versicolor_petal_length = 0;
        double versicolor_petal_width = 0;
        double virginica_sepal_length = 0;
        double virginica_sepal_width = 0;
        double virginica_petal_length = 0;
        double virginica_petal_width = 0;

        for(int i = 1; i <= 50; i++){
            setosa_sepal_lengthhhhh +=  Double.parseDouble(data[i][1]);
            setosa_sepal_width +=  Double.parseDouble(data[i][2]);
            setosa_petal_length +=  Double.parseDouble(data[i][3]);
            setosa_petal_width +=  Double.parseDouble(data[i][4]);
        }
        for(int i = 51; i <= 100; i++){
            versicolor_sepal_length +=  Double.parseDouble(data[i][1]);
            versicolor_sepal_width+=  Double.parseDouble(data[i][2]);
            versicolor_petal_length +=  Double.parseDouble(data[i][3]);
            versicolor_petal_width +=  Double.parseDouble(data[i][4]);
        }
        for(int i = 101; i <= 150; i++){
            virginica_sepal_length +=  Double.parseDouble(data[i][1]);
            virginica_sepal_width +=  Double.parseDouble(data[i][2]);
            virginica_petal_length+=  Double.parseDouble(data[i][3]);
            virginica_petal_width +=  Double.parseDouble(data[i][4]);
        }
        
        System.out.println("----------------Mode------------------")        
        System.out.println("Iris-setosa: ");
        System.out.println(data[0][1] + ": " + setosa_sepal_lengthhhhh/50);
        System.out.println(data[0][2] + ": " + setosa_sepal_width/50);
        System.out.println(data[0][3] + ": " + setosa_petal_length/50);
        System.out.println(data[0][4] + ": " + setosa_petal_width/50 + "\n");
        System.out.println("Iris-versicolor: ");
        System.out.println(data[0][1] + ": " + versicolor_sepal_length/50);
        System.out.println(data[0][2] + ": " + versicolor_sepal_width/50);
        System.out.println(data[0][3] + ": " + versicolor_petal_length/50);
        System.out.println(data[0][4] + ": " + versicolor_petal_width/50 + "\n");
        System.out.println("Iris-virginica: ");
        System.out.println(data[0][1] + ": " + virginica_sepal_length/50);
        System.out.println(data[0][2] + ": " + virginica_sepal_width/50);
        System.out.println(data[0][3] + ": " + virginica_petal_length/50);
        System.out.println(data[0][4] + ": " + virginica_petal_width/50 + "\n");       
        
    }

    static void Median(double[] sl, double[] sw, double[] pl, double[] pw){   

        
        if(50 % 2 == 0){
            System.out.println("sepalLength= "+sl[((50/2)+1 + (50/2))/2]);
            System.out.println("sepalWidth= "+sw[((50/2)+1 + (50/2))/2]);
            System.out.println("petalLength= "+pl[((50/2)+1 + (50/2))/2]);
            System.out.println("PetalWidth= "+pw[((50/2)+1 + (50/2))/2] + "\n");
        } 

    }

    public static void Mode(double[] sl, double[] sw, double[] pl, double[] pw){
        System.out.println("sepalLength: "+ MaxFrequency(sl));
        System.out.println("sepalWidth: "+ MaxFrequency(sw));
        System.out.println("petalLength: "+ MaxFrequency(pl));
        System.out.println("PetalWidth: "+ MaxFrequency(pw) + "\n");
    }

    public static double MaxFrequency(double[] arr){
        HashMap<Double, Integer> count = new HashMap<>();
        for(double num : arr){
            if(!count.containsKey(num)){
                count.put(num, 1);
            }
            else{
                count.put(num, count.get(num) + 1);
            }
        }

        int max = 0;
        double key = 0;
        for(double num : arr){
            if(count.get(num) > max){
                max = count.get(num);
                key = num;
            }
        }

        return key;

    }

    public static void Max(double[] sl, double[] sw, double[] pl, double[] pw){
        
        System.out.println("sepalLength: "+ sl[sl.length - 1]);
        System.out.println("sepalWidth: "+ sw[sl.length - 1]);
        System.out.println("petalLength: "+ pl[sl.length - 1]);
        System.out.println("PetalWidth: "+ pw[sl.length - 1] + "\n");
    }

    public static void Min(double[] sl, double[] sw, double[] pl, double[] pw){
        
        System.out.println("sepalLength: "+ sl[1]);
        System.out.println("sepalWidth: "+ sw[1]);
        System.out.println("petalLength: "+ pl[1]);
        System.out.println("PetalWidth: "+ pw[1] + "\n");
    }


    static String[][] CSVReader_fun(){
        String[][] data = new String[200][6];
        try{
            File file = new File("Iris.csv");
            Scanner read = new Scanner(file);
            String[] line = new String[20];

            
            int j = -1;

            while(read.hasNextLine()){
                nrow++;
                line = read.nextLine().split(",");
                for(int k = 0; k < 6; k++){
                    data[nrow][++j] = line[k];
                    }
                j = -1; 
                
                }
            
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            return data;
            
        }
        
    
    public static void main(String args[]){
        String[][] data = CSVReader_fun();
        String[][] setosa = new String[50][5];

        Mean(data);               

      
        double[] setosa_sepal_lengthhhhh = new double[51];
        double[] setosa_sepal_width = new double[51];
        double[] setosa_petal_length = new double[51];
        double[] setosa_petal_width = new double[51];
        double[] versicolor_sepal_length = new double[51];
        double[] versicolor_sepal_width = new double[51];
        double[] versicolor_petal_length = new double[51];
        double[] versicolor_petal_width = new double[51];
        double[] virginica_sepal_length = new double[51];
        double[] virginica_sepal_width = new double[51];
        double[] virginica_petal_length = new double[51];
        double[] virginica_petal_width = new double[51];

        int j = -1;
        for(int i = 1; i <= 50 ; i++){
            j++;
            setosa_sepal_lengthhhhh[j] = Double.parseDouble(data[i][1]);
            setosa_sepal_width[j] = Double.parseDouble(data[i][2]);
            setosa_petal_length[j] = Double.parseDouble(data[i][3]);
            setosa_petal_width[j] = Double.parseDouble(data[i][4]);
        }
        j = -1;
        for(int i = 51; i <= 100 ; i++){
            j++;
            versicolor_sepal_length[j] = Double.parseDouble(data[i][1]);
            versicolor_sepal_width[j] = Double.parseDouble(data[i][2]);
            versicolor_petal_length[j] = Double.parseDouble(data[i][3]);
            versicolor_petal_width[j] = Double.parseDouble(data[i][4]);
            
        }
        j = -1;
        for(int i = 101; i <= 150 ; i++){
            j++;
            virginica_sepal_length[j] = Double.parseDouble(data[i][1]);
            virginica_sepal_width[j] = Double.parseDouble(data[i][2]);
            virginica_petal_length[j] = Double.parseDouble(data[i][3]);
            virginica_petal_width[j] = Double.parseDouble(data[i][4]);
            
        }
        
        Arrays.sort(setosa_sepal_lengthhhh);
        Arrays.sort(setosa_sw);
        Arrays.sort(setosa_pl);
        Arrays.sort(setosa_pw);
        Arrays.sort(versicolor_sl);
        Arrays.sort(versicolor_sw);
        Arrays.sort(versicolor_pl);
        Arrays.sort(versicolor_pw);
        Arrays.sort(virginica_sl);
        Arrays.sort(virginica_sw);
        Arrays.sort(virginica_petal_length);
        Arrays.sort(virginica_petal_width);

        
        System.out.println("Median");
        System.out.println("Setosa: ");
        Median(setosa_sepal_lengthhhh, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Median(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Median(virginica_sl, virginica_sw, virginica_petal_length, virginica_petal_width);

        System.out.println("Mode");
        System.out.println("Setosa: ");
        Mode(setosa_sepal_lengthhhh, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Mode(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Mode(virginica_sl, virginica_sw, virginica_petal_length, virginica_petal_width);

        System.out.println("Min-");
        System.out.println("Setosa: ");
        Min(setosa_sepal_lengthhhh, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Min(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Min(virginica_sl, virginica_sw, virginica_petal_length, virginica_petal_width);

        System.out.println("Max");
        System.out.println("Setosa: ");
        Max(setosa_sepal_lengthhhh, setosa_sw, setosa_pl, setosa_pw);
        System.out.println("versicolor: ");
        Max(versicolor_sl, versicolor_sw, versicolor_pl, versicolor_pw);
        System.out.println("virginica: ");
        Max(virginica_sl, virginica_sw, virginica_petal_length, virginica_petal_width);
    }
}
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainKlass {
    public static void main(String[] args) {


        //Calculate(1,16);

        Date date = new Date();
        int hour = date.getHours();
        int minute = date.getMinutes();
        Calculate(hour, minute);

    }//     END OF MAİN----------------------------------
    public static void Calculate(int uhr, int minuten){
        if(uhr>24 || minuten>59){
            System.out.println("ungülgig zeit angabe");
            throw new RuntimeException();
        }
        if(uhr>12){
            uhr = uhr%12;
        }
        int[] fibonacciZahl = new int[]{1,2,3,5};
        int fünf_rot=0;
        int drei_rot =0;
        int zwei_rot=0;
        int eins1_rot=0;
        int eins2_rot=0;

        int fünf_grün=0;
        int drei_grün =0;
        int zwei_grün=0;
        int eins1_grün=0;
        int eins2_grün=0;

        int fünf_blau=0;
        int drei_blau =0;
        int zwei_blau=0;
        int eins1_blau=0;
        int eins2_blau=0;

            if(uhr>=5) {
            fünf_rot = 1;
            uhr = uhr - 5;
        }
            if(uhr>=3){
                drei_rot=1;
                uhr=uhr-3;
            }
            if(uhr>=2){
                zwei_rot=1;
                uhr =uhr-2;
            }
            if(uhr>=1){
              eins1_rot=1;
              uhr = uhr -1;
            }
            if(uhr>=1){
                eins2_rot=1;
            }


        int minutenTeil = minuten/5;
            if(minutenTeil>=5) {
            fünf_grün = 1;
            minutenTeil = minutenTeil - 5;
        }
            if(minutenTeil>=3){
                drei_grün=1;
                minutenTeil=minutenTeil-3;
            }
            if(minutenTeil>=2){
                zwei_grün=1;
                minutenTeil =minutenTeil-2;
            }
            if(minutenTeil>=1){
                eins1_grün=1;
                minutenTeil = minutenTeil -1;
            }
            if(minutenTeil>=1){
                eins2_grün=1;
            }


//       change for blue
        if(fünf_rot==1 && fünf_grün==1){
            fünf_blau=1;
            fünf_rot=0;
            fünf_grün=0;
        }
        if(drei_rot==1 && drei_grün==1){
            drei_blau =1;
            drei_rot =0;
            drei_grün =0;
        }
        if(zwei_rot ==1 && zwei_grün==1){
            zwei_blau =1;
            zwei_rot =0;
            zwei_grün =0;
        }
        if(eins1_rot ==1 && eins1_grün==1){
            eins1_blau =1;
            eins1_rot =0;
            eins1_grün =0;
        }
        if(eins2_rot ==1 && eins2_grün==1){
            eins2_blau =1;
            eins2_rot =0;
            eins2_grün =0;
        }

//  buiding string
        String rot = "R";
        if(fünf_rot==1){rot+="5";}
        if(drei_rot==1){rot+="3";}
        if(zwei_rot==1){rot+="2";}
        if(eins1_rot==1){rot+="1";}
        if(eins2_rot==1){rot+="1";}

        String grün = "G";
        if(fünf_grün==1){grün+="5";}
        if(drei_grün==1){grün+="3";}
        if(zwei_grün==1){grün+="2";}
        if(eins1_grün==1){grün+="1";}
        if(eins2_grün==1){grün+="1";}

        String blau = "B";
        if(fünf_blau==1){blau+="5";}
        if(drei_blau==1){blau+="3";}
        if(zwei_blau==1){blau+="2";}
        if(eins1_blau==1){blau+="1";}
        if(eins2_blau==1){blau+="1";}

        System.out.println(rot+" "+grün+" "+blau);
    }




   }//END OF CLASS--------------------------------------

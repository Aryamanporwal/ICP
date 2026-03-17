package End_Game.Mock;
import java.util.*;
public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0){
            int a = sc.nextInt(); //1st pile
            int b = sc.nextInt(); //2nd pile
            int c = sc.nextInt(); //3rd pile
            int x = sc.nextInt(); //remaining
            int y = sc.nextInt(); //remaining

            int [] mindifx = new int [3];
            int [] mindify = new int [3];

            mindifx[0] = x-a;
            mindify[0] = y-a;
            mindifx[1] = x-b;
            mindify[1] = y-b;
            mindifx[2] = x-c;
            mindify[2] = y-c;
            
            for(int i = 0 ; i<3 ; i++){
                System.out.print(mindifx[i]+" ");
            }
            for(int i = 0 ; i<3 ; i++){
                System.out.print(mindify[i]+" ");
            }
            System.out.println();
            int mindiffx = Integer.MAX_VALUE;
            int mindiffy = Integer.MAX_VALUE;
            int idx = -1;
            for(int i = 0; i<3 ; i++){
                if(mindifx[i] >= 0 && mindify[i] >= 0){
                    if(mindifx[i] <= mindify[i]){
                        if(mindifx[i] < mindiffx){
                            mindiffx = mindifx[i];
                            idx = i;
                        }
                    }else{
                        if(mindify[i] < mindiffy){
                            mindiffy = mindify[i];
                            idx = i;
                        }
                    }
                }
            }
    
            int idx2 = -1;
            if(mindiffy == Integer.MAX_VALUE){
                for(int i = 0 ; i<3 ; i++){
                    if(i != idx){
                        if(mindify[i] >= 0 && mindiffy > mindify[i]){
                            mindiffy = Math.min(mindiffy , mindify[i]); 
                            idx2 = i;
                        }
                    }
                }
            }else{
                for(int i = 0 ; i<3 ; i++){
                    if(i != idx){
                        if(mindifx[i] >= 0 && mindiffx > mindifx[i]){
                            mindiffx = Math.min(mindiffx , mindifx[i]);
                            idx2 = i; 
                        }
                    }
                }
            }


            char ch1 = (idx == 0)?'a' : (idx == 1) ? 'b' : 'c'; 
            char ch2 = (idx2 == 0)?'a' : (idx2 == 1) ? 'b' : 'c';

            if(ch1 == ch2){
                System.out.println("NO");
            }
            else if(ch1 == 'a'){
                if(ch2 == 'b'){
                    if(mindiffx + mindiffy == c) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else if(ch2 == 'c'){
                    if(mindiffx + mindiffy == b) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else if(ch1 == 'b'){
                if(ch2 == 'a'){
                    if(mindiffx + mindiffy == c) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else if(ch2 == 'c'){
                    System.out.println(mindiffx +" "+mindiffy);
                    if(mindiffx + mindiffy == a) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else if(ch1 == 'c'){
                if(ch2 == 'b'){
                    if(mindiffx + mindiffy == a) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else if(ch2 == 'a'){
                    if(mindiffx + mindiffy == b) {
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }



        }
        sc.close();
    }
}

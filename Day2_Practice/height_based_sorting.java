package Day2_Practice;
import java.util.*;
class Person implements Comparable<Person>{
    String name;
    int age;
    int height;
    Person(String n , int a, int h){
        this.name = n;
        this.age = a;
        this.height = h;
    }

    //if we do not write this then , class name , object name , hashcode -> address
    @Override
    public String toString(){
        return "[ name : " + name + " age : " + age + " height : " + height + "]";
    }

    @Override
    public int compareTo(Person other){
        if(this.age < other.age){
            return -1;
        }
        else if (this.age < other.age) return 1;
        else {
              if(this.height < other.height){
                    return -1;
                }
                else if (this.height < other.height) return 1;
                else {
                    if((this.name).equals(other.name)){
                        return -1;
                    }
                    else if ((other.name).equals(this.name)) return 1;
                    else return 0;
                }
        }
    }
} //to initialize the constructor




public class height_based_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String name[] = new String[n];
        // int age[] = new int[n];
        // int height[] = new int[n];

        // for(int i = 0; i<n ; i++){
        //     name[i] = sc.next();
        //     age[i] = sc.nextInt();
        //     height[i] = sc.nextInt();
        // }
        // PriorityQueue<Person> pq = new PriorityQueue<>((a,b)-> a.height-b.height);
        // for(int i = 0; i<n ; i++){
        //     Person p = new Person(name[i] , age[i] , height[i]);
        //     pq.add(p);
        // }

        // while(!pq.isEmpty()){
        //     System.out.println(pq.poll());
        // }

        Person p1 = new Person("Amit" , 162 , 22);
        Person p2 = new Person("Aryaman" , 145 , 21);

        Person[] arr = {p1 , p2};
        Arrays.sort(arr);
        sc.close(); 
    }
}


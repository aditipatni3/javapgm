public class Main{
    public static void main(String[] args){
        System.out.println("hello");
        int salary= 275000;
        if(salary>1000){
            salary=salary+100;
        } 
        else if(salary>2000){
            salary=salary+200;
        }
        else{
            salary=salary+50;
        }
        System.out.println(salary);
        }
    }

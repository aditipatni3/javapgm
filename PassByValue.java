public class PassByValue{
    public static void main(String[] args) {
        String name="Kunal";
        changeName(name);
        System.out.println(name);
    }
    static void changeName( String naam){
        naam="Aditi";
    }
}
public class Singleton {

    private String name;
    private static Singleton unique;

    public Singleton (String name){
        this.name = name;
    }

    public static Singleton getInstance (String name){
        if (unique == null){
            unique = new Singleton(name);
        }else return null;
        return unique;
    }
}

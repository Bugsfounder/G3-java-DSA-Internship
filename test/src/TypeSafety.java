import java.lang.reflect.Type;

class Test2{
    public  void print(){
        // base logic
    }
}

public class TypeSafety<T>  extends Test2{
    @Override
    public  void print(){
        // overriding base logic --> different from base
    }
    TypeSafety(T   course){
        System.out.println(course);
    }
    public static void main(String[] args) {
        TypeSafety<String >s1 = new TypeSafety<String >("DSA in JAVA");
        TypeSafety<Integer>s2 = new TypeSafety<Integer>(1);
        TypeSafety<Float>s3 = new TypeSafety<>(23.4f);
        TypeSafety<Boolean>s4 = new TypeSafety<>(true);
        TypeSafety<Character>s5 =  new TypeSafety<>('r');
    }
}

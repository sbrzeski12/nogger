class A{
    public void present(String phrase){
        System.out.println("A: "+ phrase);
    }
}
class B extends A{
    @Override
    public void present(String phrase){
        super.present(phrase);
        System.out.println("B: "+ phrase);
    }
}
class C extends B{
    @Override
    public void present(String phrase){
        super.present(phrase);
        System.out.println("C: "+ phrase);
    }
}
class D extends C{
    @Override
    public void present(String phrase) {
        super.present(phrase);
        System.out.println("D: "+phrase);
    }
}
class E extends D {
    @Override
    public void present(String phrase) {
        super.present(phrase);
        System.out.println("E: " + phrase);
    }
}
public class Zad2 {
    public static void main(String[] args){
        E e = new E();

        e.present("wolny pies");
    }
}

package stackUsingArray;

public class StackImplementation {
    public static void main(String[] args) {

        Stack obj = new Stack(10);

        System.out.println(obj.pop());

        obj.push(34);
        obj.push(45);
        obj.push(78);
        obj.push(37);
        obj.push(90);

        System.out.println(obj.seek());

        System.out.println(obj.pop());
        System.out.println(obj.seek());


    }
}

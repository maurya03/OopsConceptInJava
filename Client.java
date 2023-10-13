public class Client {
    public static void main(String[] args) {
        Class1 s = new Class1();
        int x = 10;
        int y = 20;
        s.swap(x,y);// call by value

        //s.swap(&x, &y); call by reference
        // ref type -- call by value
        Class1 obj = new Class1();
        obj.x = 10;
        obj.y = 20;

        System.out.print(obj.x + " and " + obj.y + " ");

        obj.fun(obj);

    }
}

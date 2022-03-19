/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/03/2022
 */
@FunctionalInterface
interface MyLambda {
    public void display();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m = () -> System.out.println("Hello Rahul");
        m.display();
    }

}
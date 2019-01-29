package SuperClasses.QuackInterface;

public class Silent implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("<silence>");
    }
}

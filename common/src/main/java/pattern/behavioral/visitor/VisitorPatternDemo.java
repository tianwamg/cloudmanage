package pattern.behavioral.visitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}

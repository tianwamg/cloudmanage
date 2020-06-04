package pattern.behavioral.visitor;

public interface ComputerPart {

    public void accept(ComputerPartVisitor visitor);
}

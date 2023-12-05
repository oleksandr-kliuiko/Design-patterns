package BehavioralPatterns.Visitor;

public interface Visitor {
    void visit(Electronics electronics);
    void visit(Book book);
}

package Behavioral.Visitor;
//Visitor : 데이터와 구조를 분리하여 구조를 수정하지 않고 새로운 기능을 추가할 수 있는 패턴
public interface Car {
    int drive();

    int getFuel();

    String visit(ViewVisitor viewVisitor);
}
package testgit;

public class ClassA {

    private String field1;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public ClassA(String field1) {
        super();
        this.field1 = field1;
    }

    @Override
    public String toString() {
        return "ClassA [field1=" + field1 + "]";
    }

}

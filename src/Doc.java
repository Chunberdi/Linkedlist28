public class Doc extends Animals{

    public Doc(int age){
        super(age);
    }

    @Override
    public String toString() {
        return "Doc{}"+
                "age=" + getAge() +
                '}';
    }
}

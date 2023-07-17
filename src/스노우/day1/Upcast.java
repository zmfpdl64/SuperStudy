package 스노우.day1;



class a{
    public String name;

    public a(String name) {
        this.name = name;
    }
}
class b extends  a{
    public int age;

    public b(int age) {
        super("name");
        this.age = age;
    }
}
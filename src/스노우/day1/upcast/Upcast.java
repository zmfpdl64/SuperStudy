package 스노우.day1.upcast;



class a{
    public String name;
    public a(String name) {
        this.name = name;
    }
}
class b extends a{
    public int age;

    public b(int age) {
        super("name");
        this.age = age;
    }
}
class c extends a{
    public String nickName;

    public c(String nickName) {
        super("name");
        this.nickName = nickName;
    }
}


interface ai {
    public void sayAge();
}

class bi implements ai{
    @Override
    public void sayAge() {
        System.out.println(10);
    }
}
class ci implements ai{
    @Override
    public void sayAge() {
        System.out.println(30);
    }
}

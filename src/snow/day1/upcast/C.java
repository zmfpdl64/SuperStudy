package snow.day1.upcast;

public class C extends A{
    public String nickName;

    public C(String nickName) {
        super("name");
        this.nickName = nickName;
    }
}
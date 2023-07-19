package snow.day1.upcast;


interface AI {
    public void sayAge();
}

class BI implements AI {
    @Override
    public void sayAge() {
        System.out.println(10);
    }
}
class CI implements AI {
    @Override
    public void sayAge() {
        System.out.println(30);
    }
}

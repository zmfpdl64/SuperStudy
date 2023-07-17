package 네이버클라우드.day4;

public class Pizza {
    private String topping;
    private int size;

    private Pizza(Builder builder) {
        this.topping = builder.topping;
        this.size = builder.size;
    }

    public static class Builder {
        private String topping;
        private int size;

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    // 일반 메소드
    public void bake() {
        System.out.println("Baking the pizza...");
    }
}


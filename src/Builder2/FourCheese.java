package Builder2;

import java.util.Objects;

public class FourCheese extends Pizza{
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public FourCheese build() {
            return new FourCheese(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public FourCheese(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "FourCheese pizza with" + toppings;
    }
}

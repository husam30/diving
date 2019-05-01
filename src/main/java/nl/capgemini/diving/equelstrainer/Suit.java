package nl.capgemini.diving.equelstrainer;

import java.util.Objects;

public class Suit {
    public String size;
    public String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suit suit = (Suit) o;
        return Objects.equals(size, suit.size) &&
                Objects.equals(color, suit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }

    @Override
    public String toString() {
        return "Suit{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

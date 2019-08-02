package MapSetHash_Learning;

import java.util.Objects;

public class Person_HashSet {
    int id;
    String name;

    public Person_HashSet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_HashSet that = (Person_HashSet) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person_HashSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

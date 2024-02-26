package EqualsTostring;

import java.util.Objects;

public class OverridedPerson {

    public String name;
    public String surname;
    public int age;

    public OverridedPerson(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "This person's name is " + name +
                        " surname is " + surname +
                        " and age is " + age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(this instanceof OverridedPerson)){
            return false;
        }

        OverridedPerson other = (OverridedPerson)o;

        if(this.name.equals(other.name)
                && this.surname.equals(other.surname)
                && this.age == other.age){

            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

}

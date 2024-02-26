package EqualsTostring;

public class ObjectMethodsMain {

    public static void main(String[] args) {

        Person person = new Person("Emre", "Irgoren", 25);
        System.out.println(person); //toString metotu cagrılır

        Person person2 = new Person("Emre", "Irgoren", 25);

        boolean isSame = person.equals(person2);
        System.out.println(isSame);

        OverridedPerson overridedPerson = new OverridedPerson("Emre", "Irgoren", 25);
        System.out.println(overridedPerson); //override edilmis metod

        OverridedPerson overridedPerson2 = new OverridedPerson("Emre", "Irgoren", 25);

        isSame = overridedPerson.equals(overridedPerson2);
        System.out.println(isSame);

        System.out.println("First person hash code is " + overridedPerson.hashCode());
        System.out.println("Second person hash code is " + overridedPerson2.hashCode());

    }

}

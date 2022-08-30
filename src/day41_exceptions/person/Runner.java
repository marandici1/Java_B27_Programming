package day41_exceptions.person;

class Runner {
    public static void main(String[] args) {
        // could I have declared as a normal reference then access the variable. Yes but just to show quickly we made objects without reference
        System.out.println(new Person().name);
        System.out.println(new SecretIdentity().name);
    }
}

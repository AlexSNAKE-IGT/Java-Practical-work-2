package ru.mirea.IKBO2519.ex1;

public class Author {
    private String Name, Email;
    private char Gender;

    public Author(String name, String email, char gender) {
        Name = name;
        Email = email;
        Gender = gender;
    }

    public String GetName(String name) {
        return name;
    }

    public String GetEmail(String email) {
        return email;
    }

    public void SetEmail(String email) {
        this.Email = email;
    }

    public char GetGender() {
        return Gender;
    }

    public String toString() {
        return this.Name + this.Email + this.Gender;
    }

    public void out() {
        System.out.println("Имя - "+Name + "; Почта - " + Email + "; Гендер - " + Gender+";");
    }
}

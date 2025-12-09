package ru.javarush.java.core.level15.task02;


public class Person {
    private String memberName;
    private int memberAge;


    public Person(String memberName, int memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }
}

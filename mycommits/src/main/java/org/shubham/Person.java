package org.shubham;

public class Person {
    private  String firstName;
    private  String lastName;
    private  String age;
    private  Long contactNo;

    public Person() {
    }

    public Person(String firstName, String lastName, String age, Long contactNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contactNo = contactNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}

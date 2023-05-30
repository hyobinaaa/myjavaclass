package Lambda;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String emailAddress;
    private String gender;

public Person(String name, LocalDate birDate, String emailAddress, Sex gender){
    this.name = name;
    this.birthDate = birDate;
    this.emailAddress = emailAddress;
    this.gender = gender;
}

public String getName(){
    return name;
}

public LocalDate getBirthDate(){
    return birthDate;
}

public String getEmailAddress(){
    return emailAddress;
}
public String getGender(){
    return gender;
}

public void printPerson(){
    System.out.printf("Name : %s , Email : %s, Gender : %d, BirthDate : %s" ,name, emailAddress,gender,birthDate.toString());
}


    
}

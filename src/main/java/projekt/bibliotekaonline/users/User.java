package projekt.bibliotekaonline.users;

import java.util.Date;


public class User {
    private Integer id;
    private String name;
    private String surname;
    private Date birthDate;
    private Integer userBalance;
    private UserType userType;

    public User(Integer id, String name, String surname, Date birthDate, Integer userBalance, UserType userType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.userBalance = userBalance;
        this.userType = userType;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Integer getUserBalance() {
        return userBalance;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setUserBalance(Integer userBalance) {
        this.userBalance = userBalance;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}

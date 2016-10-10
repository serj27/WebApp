package DTO;

import java.time.LocalDate;

/**
 * Created by serjd on 06.10.2016.
 */
public class UserDTO extends Entity<Integer> {

    private String firstName;
    private String secondName;
    private LocalDate birthday;
    private String email;
    private String password;

    public UserDTO(){

    }

    public UserDTO(String firstName, String secondName, LocalDate birthday, String email, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UserDTO userDTO = (UserDTO) o;

        if (firstName != null ? !firstName.equals(userDTO.firstName) : userDTO.firstName != null) return false;
        if (secondName != null ? !secondName.equals(userDTO.secondName) : userDTO.secondName != null) return false;
        if (birthday != null ? !birthday.equals(userDTO.birthday) : userDTO.birthday != null) return false;
        if (email != null ? !email.equals(userDTO.email) : userDTO.email != null) return false;
        return password != null ? password.equals(userDTO.password) : userDTO.password == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "First Name='" + firstName + '\'' +
                ", Second Name='" + secondName + '\'' +
                ", Birthday=" + birthday +
                ", Email='" + email + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}

package pl.coderslab.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
    @JsonIgnoreProperties(ignoreUnknown = true)
//        @JsonProperty("id") long id;
        @JsonProperty("name") String name;
        @JsonProperty("surname") String surname;
        @JsonProperty("email") String email;
        @JsonProperty("password") String password;

//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        public String toString() {
            return "UserDto{" +
                    "name='" + getName() + '\'' +
                    ", surname='" + getSurname() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", password='" + getPassword() + '\'' +
                    '}';

    }

}

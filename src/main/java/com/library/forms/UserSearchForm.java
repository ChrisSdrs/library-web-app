package com.library.forms;

public class UserSearchForm {

    String membNumber;
    String email;

    public String getMembNumber() {
        return membNumber;
    }

    public void setMembNumber(String membNumber) {
        this.membNumber = membNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSearchForm() {
    }

    public UserSearchForm(String membNumber, String email) {
        this.membNumber = membNumber;
        this.email = email;
    }
}

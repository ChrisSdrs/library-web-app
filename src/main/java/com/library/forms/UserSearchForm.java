package com.library.forms;

public class UserSearchForm {

    String ssn;
    String email;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSearchForm() {
    }

    public UserSearchForm(String ssn, String email) {
        this.ssn = ssn;
        this.email = email;
    }
}

package com.library.domain;

import javax.persistence.*;

@Entity
@Table(name = "Members")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "membership_number", unique = true,  nullable = false)
    private String membNumber;

    @Column(name = "member_first_name")
    private String firstName;

    @Column(name = "member_last_name")
    private String lastName;

    @Column(name = "member_phone")
    private String phone;

    @Column(name = "member_email")
    private String email;

    @Column(name = "member_username")
    private String username;

    @Column(name = "member_password")
    private String password;

    @Column(name = "member_role")
    private String role;

    public User(){

    }

    public User(Long id, String membNumber, String firstName, String lastName, String phone, String email, String username, String password, String role) {
        this.id = id;
        this.membNumber = membNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembNumber() {
        return membNumber;
    }

    public void setMembNumber(String membNumber) {
        this.membNumber = membNumber;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String toString(){

        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", membership_number='").append(membNumber);
        sb.append(", name='").append(firstName);
        sb.append(", lastname=").append(lastName);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}

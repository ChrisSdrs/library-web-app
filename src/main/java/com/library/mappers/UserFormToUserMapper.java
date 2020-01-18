package com.library.mappers;

import com.library.domain.Customer;
import com.library.forms.UserCreateForm;
import org.springframework.stereotype.Component;


@Component
public class UserFormToUserMapper {

    public Customer toUser(UserCreateForm userCreateForm) {
        Customer customer = new Customer();
        customer.setSsn(userCreateForm.getSsn());
        customer.setFirstName(userCreateForm.getFirstName());
        customer.setLastName(userCreateForm.getLastName());
        customer.setPhone(userCreateForm.getPhone());
        customer.setEmail(userCreateForm.getEmail());
        customer.setUsername(userCreateForm.getUsername());
        customer.setPassword(userCreateForm.getPassword());
        customer.setRole(userCreateForm.getRole());

        return customer;
    }

}

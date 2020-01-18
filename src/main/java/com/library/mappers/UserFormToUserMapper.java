package com.library.mappers;

import com.library.domain.User;
import com.library.forms.UserCreateForm;
import org.springframework.stereotype.Component;


@Component
public class UserFormToUserMapper {

    public User toUser(UserCreateForm userCreateForm) {
        User user = new User();
        user.setSsn(userCreateForm.getSsn());
        user.setFirstName(userCreateForm.getFirstName());
        user.setLastName(userCreateForm.getLastName());
        user.setPhone(userCreateForm.getPhone());
        user.setEmail(userCreateForm.getEmail());
        user.setUsername(userCreateForm.getUsername());
        user.setPassword(userCreateForm.getPassword());
        user.setRole(userCreateForm.getRole());

        return user;
    }

}

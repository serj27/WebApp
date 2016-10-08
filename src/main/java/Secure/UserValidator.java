package Secure;

import Model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by serjd on 06.10.2016.
 */
public class UserValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email", "Email is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password", "Password is required");
    }
}

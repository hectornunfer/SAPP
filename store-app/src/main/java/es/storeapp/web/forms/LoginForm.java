package es.storeapp.web.forms;

import jakarta.validation.constraints.*;

public class LoginForm {

    @NotNull(message = "El campo de correo electrónico no puede ser nulo")
    @NotBlank(message = "El campo de correo electrónico no puede estar en blanco")
    @Email(message = "Debe ingresar una dirección de correo electrónico válida")
    private String email;

    @NotNull(message = "El campo de contraseña no puede ser nulo")
    @NotBlank(message = "El campo de contraseña no puede estar en blanco")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    private Boolean rememberMe;

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

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}

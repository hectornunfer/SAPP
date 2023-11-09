package es.storeapp.web.forms;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ChangePasswordForm {

    @NotNull(message = "El campo de contraseña antigua no puede ser nulo")
    @NotBlank(message = "El campo de contraseña antigua no puede estar en blanco")
    private String oldPassword;

    @NotNull(message = "El campo de nueva contraseña no puede ser nulo")
    @NotBlank(message = "El campo de nueva contraseña no puede estar en blanco")
    @Size(min = 8, message = "La nueva contraseña debe tener al menos 8 caracteres")
    private String password;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

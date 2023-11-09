package es.storeapp.web.forms;
import jakarta.validation.constraints.*;

public class ResetPasswordForm {

    @NotNull(message = "El token no puede ser nulo")
    @NotBlank(message = "El token no puede estar en blanco")
    private String token;

    @NotNull(message = "El correo electrónico no puede ser nulo")
    @NotBlank(message = "El correo electrónico no puede estar en blanco")
    @Email(message = "Debe ingresar una dirección de correo electrónico válida")
    private String email;

    @NotNull(message = "La contraseña no puede ser nula")
    @NotBlank(message = "La contraseña no puede estar en blanco")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

}

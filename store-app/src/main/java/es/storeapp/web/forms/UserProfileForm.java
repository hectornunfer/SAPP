package es.storeapp.web.forms;

import jakarta.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;

public class UserProfileForm {

    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Size(min = 4, message = "El nombre debe tener al menos 4 caracteres")
    private String name;

    @NotNull(message = "El correo electrónico no puede ser nulo")
    @NotBlank(message = "El correo electrónico no puede estar en blanco")
    @Email(message = "Debe ingresar una dirección de correo electrónico válida")
    private String email;


    private String password;

    @NotNull(message = "La dirección no puede ser nula")
    @NotBlank(message = "La dirección no puede estar en blanco")
    private String address;

    private MultipartFile image;

    public UserProfileForm() {
    }

    public UserProfileForm(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}

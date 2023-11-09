package es.storeapp.web.forms;

import jakarta.validation.constraints.*;

public class PaymentForm {

    @NotNull(message = "La opción de tarjeta de crédito predeterminada no puede ser nula")
    private Boolean defaultCreditCard;

    @NotBlank(message = "El número de tarjeta de crédito no puede estar en blanco")
    private String creditCard;

    @NotNull(message = "El CVV no puede ser nulo")
    private Integer cvv;

    @NotNull(message = "El mes de vencimiento no puede ser nulo")
    private Integer expirationMonth;

    @NotNull(message = "El año de vencimiento no puede ser nulo")
    private Integer expirationYear;

    private Boolean save;

    public Boolean getDefaultCreditCard() {
        return defaultCreditCard;
    }

    public void setDefaultCreditCard(Boolean defaultCreditCard) {
        this.defaultCreditCard = defaultCreditCard;
    }
    
    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Boolean getSave() {
        return save;
    }

    public void setSave(Boolean save) {
        this.save = save;
    }
    
}

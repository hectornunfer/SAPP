package es.storeapp.web.forms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CommentForm {

    @NotNull(message = "El ID del producto no puede ser nulo")
    private Long productId;

    private String text;

    @NotNull(message = "El campo de calificación no puede ser nulo")
    private Integer rating;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

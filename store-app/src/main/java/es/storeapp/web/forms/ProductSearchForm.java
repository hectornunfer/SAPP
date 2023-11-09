package es.storeapp.web.forms;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ProductSearchForm {

    @Size(max = 50, message = "La categoría debe tener como máximo 50 caracteres")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

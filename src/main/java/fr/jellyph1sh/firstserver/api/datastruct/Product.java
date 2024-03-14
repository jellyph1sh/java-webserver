package fr.jellyph1sh.firstserver.api.datastruct;

import org.springframework.data.annotation.Id;

public class Product {
    @Id private String id;

    private String label;
    private String name;
    private float price;

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

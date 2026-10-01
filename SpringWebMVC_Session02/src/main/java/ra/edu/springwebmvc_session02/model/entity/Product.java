package ra.edu.springwebmvc_session02.model.entity;

import java.time.LocalDate;

public class Product {
    private String proId;
    private String proName;
    private String producer;
    private Integer yearMaking;
    private LocalDate expireDate;
    private Double price;

    public Product() {
    }

    public Product(LocalDate expireDate, Double price, String producer, String proId, String proName, Integer yearMaking) {
        this.expireDate = expireDate;
        this.price = price;
        this.producer = producer;
        this.proId = proId;
        this.proName = proName;
        this.yearMaking = yearMaking;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Integer getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(Integer yearMaking) {
        this.yearMaking = yearMaking;
    }
}

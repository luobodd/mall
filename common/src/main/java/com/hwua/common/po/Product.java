package com.hwua.common.po;

public class Product {
    private Integer productId;
    private String productName;
    private String productDetail;
    private double productPrice;
    private Integer categoryId;
    private Integer brandId;
    private Integer productStock;
    private String productFile;
    private String productDerail1;
    private String productDerail2;
    private String productDerail3;
    private String productDerail4;
    private String productDerail5;
    private String valid;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDetail='" + productDetail + '\'' +
                ", productPrice=" + productPrice +
                ", categoryId=" + categoryId +
                ", brandId=" + brandId +
                ", productStock=" + productStock +
                ", productFile='" + productFile + '\'' +
                ", productDerail1='" + productDerail1 + '\'' +
                ", productDerail2='" + productDerail2 + '\'' +
                ", productDerail3='" + productDerail3 + '\'' +
                ", productDerail4='" + productDerail4 + '\'' +
                ", productDerail5='" + productDerail5 + '\'' +
                ", valid='" + valid + '\'' +
                '}';
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductFile() {
        return productFile;
    }

    public void setProductFile(String productFile) {
        this.productFile = productFile;
    }

    public String getProductDerail1() {
        return productDerail1;
    }

    public void setProductDerail1(String productDerail1) {
        this.productDerail1 = productDerail1;
    }

    public String getProductDerail2() {
        return productDerail2;
    }

    public void setProductDerail2(String productDerail2) {
        this.productDerail2 = productDerail2;
    }

    public String getProductDerail3() {
        return productDerail3;
    }

    public void setProductDerail3(String productDerail3) {
        this.productDerail3 = productDerail3;
    }

    public String getProductDerail4() {
        return productDerail4;
    }

    public void setProductDerail4(String productDerail4) {
        this.productDerail4 = productDerail4;
    }

    public String getProductDerail5() {
        return productDerail5;
    }

    public void setProductDerail5(String productDerail5) {
        this.productDerail5 = productDerail5;
    }
}

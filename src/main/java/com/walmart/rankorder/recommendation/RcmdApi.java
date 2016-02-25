package com.walmart.rankorder.recommendation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.walmart.rankorder.searchapi.Item;

/**
 * Created by samao on 2/25/16.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class RcmdApi extends Item {

    private String brandName;
    private Boolean ninetySevenCentShipping;
    private String color;
    private Boolean shipToStore;
    private Boolean freeShipToStore;
    private Long[] variants;
    private Boolean clearance;
    private Boolean preOrder;
    private String stock;
    private Attribute attributes;
    private Boolean freeShippingOver50Dollars;
    private Long maxItemsInOrder;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Boolean getNinetySevenCentShipping() {
        return ninetySevenCentShipping;
    }

    public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping) {
        this.ninetySevenCentShipping = ninetySevenCentShipping;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getShipToStore() {
        return shipToStore;
    }

    public void setShipToStore(Boolean shipToStore) {
        this.shipToStore = shipToStore;
    }

    public Boolean getFreeShipToStore() {
        return freeShipToStore;
    }

    public void setFreeShipToStore(Boolean freeShipToStore) {
        this.freeShipToStore = freeShipToStore;
    }

    public Long[] getVariants() {
        return variants;
    }

    public void setVariants(Long[] variants) {
        this.variants = variants;
    }

    public Boolean getClearance() {
        return clearance;
    }

    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    public Boolean getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(Boolean preOrder) {
        this.preOrder = preOrder;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    public Boolean getFreeShippingOver50Dollars() {
        return freeShippingOver50Dollars;
    }

    public void setFreeShippingOver50Dollars(Boolean freeShippingOver50Dollars) {
        this.freeShippingOver50Dollars = freeShippingOver50Dollars;
    }

    public Long getMaxItemsInOrder() {
        return maxItemsInOrder;
    }

    public void setMaxItemsInOrder(Long maxItemsInOrder) {
        this.maxItemsInOrder = maxItemsInOrder;
    }
}

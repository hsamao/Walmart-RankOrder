package com.walmart.rankorder.searchapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samao on 2/24/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GiftOptions {

    private Boolean allowGiftWrap;
    private Boolean allowGiftMessage;
    private Boolean allowGiftReceipt;

    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    public void setAllowGiftWrap(Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    public void setAllowGiftMessage(Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    public void setAllowGiftReceipt(Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
    }
}

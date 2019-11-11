package com.extenddev.railway.pcm.Encryption;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EncryptedCode {

    @SerializedName("CustomsEncResponse")
    @Expose
    private String CustomsEncResponse ;

    public EncryptedCode(String customsEncResponse) {
        CustomsEncResponse = customsEncResponse;
    }

    public String getCustomsEncResponse() {
        return CustomsEncResponse;
    }

    public void setCustomsEncResponse(String customsEncResponse) {
        CustomsEncResponse = customsEncResponse;
    }
}

package com.extenddev.railway.pcm.Encryption;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomsEnc {

        @SerializedName("CustomsEncResponse")
        @Expose
        private String customsEncResponse;

        public String getCustomsEncResponse() {
            return customsEncResponse;
        }

        public void setCustomsEncResponse(String customsEncResponse) {
            this.customsEncResponse = customsEncResponse;
        }

    }


package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public class BannerMessage extends InAppMessage {
    private final Action action;
    private final String backgroundHexColor;
    private final Text body;
    private final ImageData imageData;
    private final Text title;

    /* loaded from: classes2.dex */
    public static class Builder {
        public Action action;
        public String backgroundHexColor;
        public Text body;
        public ImageData imageData;
        public Text title;

        public BannerMessage build(CampaignMetadata campaignMetadata, Map<String, String> map) {
            if (this.title != null) {
                if (!TextUtils.isEmpty(this.backgroundHexColor)) {
                    return new BannerMessage(campaignMetadata, this.title, this.body, this.imageData, this.action, this.backgroundHexColor, map);
                }
                throw new IllegalArgumentException("Banner model must have a background color");
            }
            throw new IllegalArgumentException("Banner model must have a title");
        }

        public Builder setAction(Action action) {
            this.action = action;
            return this;
        }

        public Builder setBackgroundHexColor(String str) {
            this.backgroundHexColor = str;
            return this;
        }

        public Builder setBody(Text text) {
            this.body = text;
            return this;
        }

        public Builder setImageData(ImageData imageData) {
            this.imageData = imageData;
            return this;
        }

        public Builder setTitle(Text text) {
            this.title = text;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerMessage) {
            BannerMessage bannerMessage = (BannerMessage) obj;
            if (hashCode() != bannerMessage.hashCode()) {
                return false;
            }
            Text text = this.body;
            if ((text != null || bannerMessage.body == null) && (text == null || text.equals(bannerMessage.body))) {
                ImageData imageData = this.imageData;
                if ((imageData != null || bannerMessage.imageData == null) && (imageData == null || imageData.equals(bannerMessage.imageData))) {
                    Action action = this.action;
                    return (action != null || bannerMessage.action == null) && (action == null || action.equals(bannerMessage.action)) && this.title.equals(bannerMessage.title) && this.backgroundHexColor.equals(bannerMessage.backgroundHexColor);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public Action getAction() {
        return this.action;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public String getBackgroundHexColor() {
        return this.backgroundHexColor;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public Text getBody() {
        return this.body;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public ImageData getImageData() {
        return this.imageData;
    }

    @Override // com.google.firebase.inappmessaging.model.InAppMessage
    public Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        Text text = this.body;
        int hashCode = text != null ? text.hashCode() : 0;
        ImageData imageData = this.imageData;
        int hashCode2 = imageData != null ? imageData.hashCode() : 0;
        Action action = this.action;
        return this.backgroundHexColor.hashCode() + this.title.hashCode() + hashCode + hashCode2 + (action != null ? action.hashCode() : 0);
    }

    private BannerMessage(CampaignMetadata campaignMetadata, Text text, Text text2, ImageData imageData, Action action, String str, Map<String, String> map) {
        super(campaignMetadata, MessageType.BANNER, map);
        this.title = text;
        this.body = text2;
        this.imageData = imageData;
        this.action = action;
        this.backgroundHexColor = str;
    }
}

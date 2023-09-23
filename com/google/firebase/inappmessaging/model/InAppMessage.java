package com.google.firebase.inappmessaging.model;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class InAppMessage {
    @Deprecated
    public Button actionButton;
    @Deprecated
    public String backgroundHexColor;
    @Deprecated
    public Text body;
    @Deprecated
    public String campaignId;
    public CampaignMetadata campaignMetadata;
    @Deprecated
    public String campaignName;
    private Map<String, String> data;
    @Deprecated
    public ImageData imageData;
    @Deprecated
    public String imageUrl;
    @Deprecated
    public Boolean isTestMessage;
    public MessageType messageType;
    @Deprecated
    public Text title;

    @Deprecated
    public InAppMessage(Text text, Text text2, String str, ImageData imageData, Button button, Action action, String str2, String str3, String str4, Boolean bool, MessageType messageType, Map<String, String> map) {
        this.title = text;
        this.body = text2;
        this.imageUrl = str;
        this.imageData = imageData;
        this.actionButton = button;
        this.backgroundHexColor = str2;
        this.campaignId = str3;
        this.campaignName = str4;
        this.isTestMessage = bool;
        this.messageType = messageType;
        this.campaignMetadata = new CampaignMetadata(str3, str4, bool.booleanValue());
        this.data = map;
    }

    @Deprecated
    public abstract Action getAction();

    @Deprecated
    public Button getActionButton() {
        if (getAction() != null) {
            return getAction().getButton();
        }
        return this.actionButton;
    }

    @Deprecated
    public String getBackgroundHexColor() {
        return this.backgroundHexColor;
    }

    @Deprecated
    public Text getBody() {
        return this.body;
    }

    @Deprecated
    public String getCampaignId() {
        return this.campaignMetadata.getCampaignId();
    }

    public CampaignMetadata getCampaignMetadata() {
        return this.campaignMetadata;
    }

    @Deprecated
    public String getCampaignName() {
        return this.campaignMetadata.getCampaignName();
    }

    public Map<String, String> getData() {
        return this.data;
    }

    @Deprecated
    public ImageData getImageData() {
        return this.imageData;
    }

    @Deprecated
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Deprecated
    public Boolean getIsTestMessage() {
        return Boolean.valueOf(this.campaignMetadata.getIsTestMessage());
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    @Deprecated
    public Text getTitle() {
        return this.title;
    }

    public InAppMessage(CampaignMetadata campaignMetadata, MessageType messageType, Map<String, String> map) {
        this.campaignMetadata = campaignMetadata;
        this.messageType = messageType;
        this.data = map;
    }
}

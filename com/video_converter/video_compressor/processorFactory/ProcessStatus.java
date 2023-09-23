package com.video_converter.video_compressor.processorFactory;

/* loaded from: classes2.dex */
public enum ProcessStatus {
    SUCCESS("Successful"),
    FAILED("Failed"),
    ON_PROGRESS("Processing"),
    CANCELLED("Cancelled"),
    IN_QUEUE("In Queue");
    
    private String status;

    ProcessStatus(String str) {
        this.status = str;
    }

    public String getStatusValue() {
        return this.status;
    }
}

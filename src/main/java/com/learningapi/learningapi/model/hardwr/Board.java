package com.learningapi.learningapi.model.hardwr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Board {
    public Board(
        @JsonProperty(value="url", required=true) String url,
        @JsonProperty(value="version", required=true) String version,
        @JsonProperty(value="model", required=true) String model,
        @JsonProperty(value="type", required=true) String type,
        @JsonProperty(value="status", required=true) String status
    ) {
        this.url = url;
        this.version = version;
        this.model = model;
        this.type = type;
        this.status = status;
    }

    private String url;
    private String version;
    private String model;
    private String type;
    private String status;

    public String getURL() { return url; }
    public String getVersion() { return version; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public String getStatus() { return status; }

    public void KeepAlive() {}
}

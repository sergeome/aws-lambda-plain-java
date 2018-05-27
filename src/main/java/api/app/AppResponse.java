package api.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppResponse {

    private String message;
    private ObjectMapper objectMapper;

    public AppResponse(String message) {
        this.message = message;
        this.objectMapper = new ObjectMapper();
    }

    public String getMessage() {
        return message;
    }

    public String toJson() {
        String serializedResponse;
        try {
            serializedResponse = this.objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            serializedResponse = "{\"message\":\"Json Conversion Exception\"}";
            e.printStackTrace();
        }
        return serializedResponse;
    }
}

import api.app.AppResponse;
import api.gateway.ApiGatewayRequest;
import api.gateway.ApiGatewayResponse;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LambdaHandler implements RequestHandler<ApiGatewayRequest, ApiGatewayResponse> {

    public ApiGatewayResponse handleRequest(ApiGatewayRequest request, Context context) {

        // Setting headers
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");

        return new ApiGatewayResponse(200, headers, new AppResponse("Hello World!").toJson());
    }
}

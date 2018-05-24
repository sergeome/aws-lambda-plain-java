import api.RequestClass;
import api.ResponseClass;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<RequestClass, ResponseClass> {

    public static void main(String[] args) {}

    public ResponseClass handleRequest(RequestClass request, Context context) {
        return new ResponseClass("Hello World");
    }

}

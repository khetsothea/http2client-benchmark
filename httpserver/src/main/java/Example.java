import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;


public class Example implements HandlerProvider {
    private static final String MESSAGE = "Hello World!";

    public HttpHandler getHandler() {
        return Handlers.path()
        .addPrefixPath("/", new HttpHandler() {
                public void handleRequest(HttpServerExchange exchange) {
                    exchange.getResponseSender().send(MESSAGE);
            	}
            }
        );
    }
}

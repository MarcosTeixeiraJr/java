package dio.beans.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {

    private final Gson gson = new Gson();

    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}


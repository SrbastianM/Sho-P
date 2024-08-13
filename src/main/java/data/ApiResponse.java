package data;

import io.github.cdimascio.dotenv.Dotenv;

public class ApiResponse {
    Dotenv dotenv = Dotenv.load();

    String url = dotenv.get("API_URL");


}

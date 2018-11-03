import static spark.Spark.*;
import Service.ApiService;

public class Main
{
    public static void main(String[] args)
    {
        /*
            routes of application
         */
        get("/", (req, res) -> "hello");

        get("hello/:name", (req, res) ->
        {
            return "Hello:" + req.params(":name");
        });

        get("/ip", (req, res) ->
        {
            return "Your ip: " + req.ip();
        });

        path("/api", () ->
        {
            path("/books", () ->
            {
                get("/allBooks", (req, res) ->
                {
                    res.status(200);
                    res.type("application/json");
                    return ApiService.getBooks();
                });
            });
        });
    }
}

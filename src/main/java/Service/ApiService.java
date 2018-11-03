package Service;

import Service.DBService.DbOps;
import com.google.gson.Gson;

public class ApiService
{

    public static String getBooks()
    {
        Gson gson = new Gson();

        return gson.toJson(DbOps.getAllBooks());

    }


}

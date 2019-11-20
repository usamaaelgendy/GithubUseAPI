package res;

import model.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubUserEndPoints {

    // put url and / --> and in {user} one unique string

    @GET("/users/{user}")

        //path variable substitution for the api endpoint .
        // in the path we change the "user" with the string user we get from getUser Method
        // parsing the last parameter or url --> String user
    Call<GitHubUser> getUser(@Path("user") String user);

}





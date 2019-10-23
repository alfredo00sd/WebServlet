package servlets;

import models.User;
import services.UserServices;
import utils.TransformToJson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//Handle user requests
@WebServlet("/users")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserServices userServices = new UserServices();

        //user the service to get all the users
        List<User> users = userServices.getAllUsers();

        //Transform to a json response
        String jsonBody = TransformToJson.toJson(users);

        //give the response to the client
        response.setContentType("application/json");
        response.getWriter().write(jsonBody);
    }

}

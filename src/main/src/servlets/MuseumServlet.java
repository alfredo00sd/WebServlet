package servlets;

import models.Museum;
import services.MuseumService;
import utils.TransformToJson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/museums")
public class MuseumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MuseumService museumService = new MuseumService();

        //List the museums
        List<Museum> museums = museumService.getAllMuseums();

        //transform the list to a json...
        String jsonBody = TransformToJson.museumToJson(museums);

        //Send response to the client
        response.setContentType("application/json");
        response.getWriter().write(jsonBody);
    }
}

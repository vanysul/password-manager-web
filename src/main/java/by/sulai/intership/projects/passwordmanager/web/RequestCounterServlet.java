package by.sulai.intership.projects.passwordmanager.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/count")
public class RequestCounterServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(RequestCounterServlet.class.getName());
    private static int requestCount = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Запрос получен на /count");

        String authHeader = req.getHeader("AUTH");
        if (authHeader == null || !authHeader.equals("Иван")) {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized: Invalid AUTH header");
            return;
        }

        requestCount++;
        System.out.println("Общее количество обращений: " + requestCount);

        resp.getWriter().write("Общее количество обращений: " + requestCount);
    }
}
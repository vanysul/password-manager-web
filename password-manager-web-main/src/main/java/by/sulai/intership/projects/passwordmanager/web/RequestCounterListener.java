package by.sulai.intership.projects.passwordmanager.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@WebListener
public class RequestCounterListener implements ServletRequestListener {

    private static final Logger logger = Logger.getLogger(RequestCounterListener.class.getName());
    private static final AtomicInteger requestCount = new AtomicInteger(0);

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();


        int currentCount = requestCount.incrementAndGet();
        logger.info("Обработан запрос: " + request.getRequestURI());
        logger.info("Общее количество запросов: " + currentCount);


        String authHeader = request.getHeader("AUTH");
        if (authHeader == null || !authHeader.equals("Иван")) {
            logger.warning("Неавторизованный доступ: " + request.getRemoteAddr());
        }
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    public static int getRequestCount() {
        return requestCount.get();
    }
}

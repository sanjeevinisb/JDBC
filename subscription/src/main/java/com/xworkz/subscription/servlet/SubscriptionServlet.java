package com.xworkz.subscription.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.subscription.dto.SubscriptionDTO;
import com.xworkz.subscription.service.SubscriptionServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/subscribe")
public class SubscriptionServlet extends HttpServlet {

    public SubscriptionServlet() {
        System.out.println("No-Args const of SubscriptionServlet");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String subscriptionType = request.getParameter("subscriptionType");

        if (id != null && !id.isEmpty()) {
            int convertedId = Integer.parseInt(id);

            SubscriptionDTO subscriptionDTO = new SubscriptionDTO(convertedId, name, email, address, phoneNumber,
                    subscriptionType);
            SubscriptionServiceImpl subscriptionServiceImpl = new SubscriptionServiceImpl();
            boolean saved = subscriptionServiceImpl.save(subscriptionDTO);
            if (saved) {
                System.out.println("this is saved in servlet");
                request.setAttribute("success", "saved");
            } else {
                System.out.println("this is not saved in servlet");
                request.setAttribute("failure", "not saved");
            }
            RequestDispatcher dispatcher = request.getRequestDispatcher("subscription.jsp");
            dispatcher.forward(request, response);
        } else {
            System.err.println("ID is null or empty");
        }
    }
}

package com.xworkz.enrollment.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.enrollment.dto.EnrollmentDTO;
import com.xworkz.enrollment.service.EnrollmentServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/save")
public class EnrollmentServlet extends HttpServlet {

    public EnrollmentServlet() {
        System.out.println("running service in EnrollmentServlet...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phoneNumber");

        if (id != null && !id.isEmpty()) {
            int convertedId = Integer.parseInt(id);

            EnrollmentDTO enrollmentDTO = new EnrollmentDTO(convertedId, name, email, address, phoneNumber);

            EnrollmentServiceImpl enrollmentServiceImpl = new EnrollmentServiceImpl();
            enrollmentServiceImpl.save(enrollmentDTO);
        } else {
            System.out.println("ID parameter is missing or empty");
        }
    }
}

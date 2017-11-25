package com.usatu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reqAttribute = req.getParameter("age");
        try {
            double age = Integer.parseInt(reqAttribute);
            String answer;
            if (age >= 7){
                answer = ((age * 150)/ 1000) + " кг";
            } else {
                answer = ((age * 150)) + " г";
            }

            req.setAttribute("answer", "Вам понадобится - " +  answer);
        } catch (NumberFormatException exception) {
            req.setAttribute("answer", "- Нужно написать цифрами. Попробуйте снова.");
        }
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}

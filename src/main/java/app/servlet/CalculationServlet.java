package app.servlet;

import app.entities.Primer;
import app.memory.MemoryBlock;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculationServlet extends HttpServlet {

    private String answer = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/calc.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstNumber = req.getParameter("first");
        String secondNumber = req.getParameter("second");
        String functionType = req.getParameter("function");

        Primer primer = new Primer(firstNumber, functionType, secondNumber);
        answer = Model.calcAction(primer);
        MemoryBlock memoryBlock = MemoryBlock.getCalculations();
        memoryBlock.addCalculation(firstNumber + " " + functionType + " " + secondNumber + " ---> " + answer);

        req.setAttribute("answer", answer);
        doGet(req, resp);
        refresh();
    }

    private void refresh() {
        answer = null;
    }
}

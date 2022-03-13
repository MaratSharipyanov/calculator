package app.servlet;

import app.memory.MemoryBlock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class MemoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MemoryBlock memoryBlock = MemoryBlock.getCalculations();
        ArrayList<String> memory = memoryBlock.list();
        req.setAttribute("memory", memory);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/memory.jsp");
        requestDispatcher.forward(req, resp);
    }
}

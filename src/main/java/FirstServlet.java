import logic.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FirstServlet", value = "/test-servlet")
public class FirstServlet extends HttpServlet {
    private String greetMessage;
    private String countMessage;

    public void init() {
        greetMessage = "Hello, Brave New User ";
        countMessage = "You have opened this page ";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

        //PrintWriter printWriter = response.getWriter();
        //printWriter.println("<html><body>");
        //printWriter.println("<h1>" + countMessage + count + "</h1>");
        //printWriter.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destroy() {
    }
}
//http://localhost:8080/Gradle___com_example___EEExample_1_0_SNAPSHOT_war/BraveWorld

/*
Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<h1>" + countMessage + count + "</h1>");
        printWriter.println("</body></html>");
 */

/*
        RequestDispatcher dispatcher = request.getRequestDispatcher("/firstJsp.jsp");
        dispatcher.forward(request, response);
        response.sendRedirect("/firstJsp.jsp");
        response.sendRedirect("https://www.google.com");
         */

/*
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<h1>" + message + name + " " + surname + "</h1>");
        printWriter.println("</body></html>");
         */
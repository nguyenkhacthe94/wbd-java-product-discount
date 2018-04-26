import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/display-discount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("Product Description");
        double discountPercent = Double.parseDouble(request.getParameter("Discount Percent"));
        double listPrice = Double.parseDouble(request.getParameter("List Price"));

        double discountAmount = listPrice * discountPercent / 100;
        double discountedPrice = listPrice - discountAmount;

        request.setAttribute("Product Description", productDescription);
        request.setAttribute("List Price", listPrice);
        request.setAttribute("Discount Percent", discountPercent);
        request.setAttribute("Discount Amount", discountAmount);
        request.setAttribute("Discounted Price", discountedPrice);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("Product Description: " + productDescription);
        printWriter.println("Discounted Price: " + discountedPrice);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

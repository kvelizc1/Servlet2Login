package Edureka;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try (PrintWriter pw = res.getWriter()) {
            res.setContentType("text/html");
            String user = req.getParameter("userName");
            String pass = req.getParameter("userPassword");
            pw.println("Login Success...!");
            if (user.equals("edureka") && pass.equals("edureka")) {
                pw.println("Login Success...!");
            } else {
                pw.println("Login Failed...!");
            }
        }
    }
}

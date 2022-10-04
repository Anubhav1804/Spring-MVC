package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

    private PlayerService service = new PlayerService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String playerName = req.getParameter("playername");
        System.out.println(playerName);

        Player player = service.getPlayerByName(playerName);

        req.setAttribute("name", playerName);
        req.setAttribute("id", player.getId());
        req.setAttribute("nationality", player.getNationality());
        req.setAttribute("age", player.getAge());

       // req.setAttribute("jspPlayerName", playerName);
        req.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(req, res);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String playerName = req.getParameter("playername");
        System.out.println(playerName);
        req.setAttribute("PlayerName", playerName);
        req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, res);


//        PrintWriter writer = res.getWriter();
//        writer.println("<html>");
//        writer.println("<head>" +
//                       "<title>Player</title>" +
//                       "<head>");
//        writer.println("<body>" +
//                       "<h1>Welcome to Player Application</h1>" +
//                       "<body>");
//        writer.println("</html>");
    }
}

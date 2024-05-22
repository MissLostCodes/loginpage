package pack1;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class login extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();

String s1 = request.getParameter("username");
String s2 = request.getParameter("password");
out.println("<!DOCTYPE html>");
out.println("<html lang=\"en\">");
out.println("<head>");
out.println("<meta charset=\"UTF-8\">");
out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
out.println("<title>Learning</title>");
out.println("<style>");
out.println("h2 { text-align: center; }");
out.println("</style>");
out.println("</head>");
out.println("<body>");
out.println("<div class=\"container\">");
out.println("<h1>Hi "+ s1 +"! Welcome to your learning journey !!!!</h1>");
out.println("<h4>Today's topic is ---------- </h4>");
out.println("<h2>JAVA SERVLETS</h2>");
out.println("<p>");
out.println("Servlet technology is used to create a web application (resides at server side and generates a dynamic web page).");
out.println("Servlet technology is robust and scalable because of java language. Before Servlet, CGI (Common Gateway Interface) scripting language was common as a server-side programming language. However, there were many disadvantages to this technology. We have discussed these disadvantages below.");
out.println("There are many interfaces and classes in the Servlet API such as Servlet, GenericServlet, HttpServlet, ServletRequest, ServletResponse, etc.<br>");
out.println("<br>");
out.println("<ul>");
out.println("<li>");
out.println("<ul>Servlet is a technology which is used to create a web application.</ul>");
out.println("<ul>Servlet is an API that provides many interfaces and classes including documentation.</ul>");
out.println("<ul>Servlet is an interface that must be implemented for creating any Servlet.</ul>");
out.println("<ul>Servlet is a web component that is deployed on the server to create a dynamic web page.</ul>");
out.println("</li>");
out.println("</ul>");
out.println("<img src=\"image.png\" alt=\"Image\">");
out.println("</p>");
out.println("</div>");
out.println("</body>");
out.println("</html>");

}
}

package servlet;

import main.Loading;
import main.Operater;
import main.Reader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registerservlet")
public class registerservlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        Reader reader =new Reader();
        Operater operater=new Operater();
        java.sql.Connection con= Loading.getConnection();
        try{
            String account=request.getParameter("account");
            String password =request.getParameter("password");
            reader.setAccount(account);
            reader.setPassword(password);
            operater.register(account,password);
            String heads[] = request.getParameterValues("head");
            for(String head:heads){
                if(head!=null && !"".equals(head)){
                    System.out.println(head+"被选中！");
                }
            }
//            if(true){
                request.getRequestDispatcher("/index1.jsp").forward(request,response);
//            }
            request.getSession().setAttribute("head",heads);
            //将数据传进去
            //跳转到下一界面
//            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

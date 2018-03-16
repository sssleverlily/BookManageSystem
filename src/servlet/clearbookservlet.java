package servlet;

import main.Book;
import main.Loading;
import main.Operater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "clearbookservlet")
public class clearbookservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            Book book=new Book();
            Connection con= Loading.getConnection();
            Operater operater=new Operater();
            try{
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from dvd1");
               // ResultSetMetaData rm = rs.getMetaData();
                List<Map<String, Object>> list = new ArrayList();//存放数据库中的数据
                operater.clearBook();
                while (rs.next()) {
                    Map<String, Object> m = new HashMap();
              //      for (int i = 1; i <= rm.getColumnCount(); i++) {
                //        m.put(rm.getColumnName(i), rs.getObject(i));
                    }
                  //  list.remove(m);
                //}

            }catch(Exception ex){
                ex.printStackTrace();
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

package servlet;

import main.Loading;
import main.Operater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "idfindservlet")
public class findservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = Loading.getConnection();
        Operater operater=new Operater();
        try {
            String bookname=request.getParameter("bookname");
            int id = Integer.parseInt(request.getParameter("id"));
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from dvd1");//存放数据库中的数据
            ResultSetMetaData rm = rs.getMetaData();//获取数据库中字段的名称、字段的值和属性
            List<Map<String, Object>> list = new ArrayList();//存放数据库中的数据
            operater.findBook(id,bookname);
            while (rs.next()) {//一个遍历数据中的数据，直到字段对应的值为null为止
                Map<String, Object> m = new HashMap();//使用Map的键值对，来对数据库中的字段和字段对应的值进行存储
                for (int i = 1; i <= rm.getColumnCount(); i++) {//rm.getColumnCount()是字段的个数
                    m.put(rm.getColumnName(i), rs.getObject(i));//rm.getColumnName(i)遍历的是字段的名称，rs.getObject(i)遍历是字段对应的值
                }
                list.add(m);//把Map集合的键值存放到List集合中
            }
            rs.close();//对用的完的资源进行关闭
            st.close();
            con.close();
            request.setAttribute("lists", list);//把List集合中数据放到request的域中
            request.getRequestDispatcher("/showbook.jsp").forward(request,response);//把上面的request域的输送到showbook.jsp中
            response.sendRedirect(request.getContextPath()+"/showbook.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

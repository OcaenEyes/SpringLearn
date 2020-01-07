package com.gzy.servlet;

import com.gzy.model.Goods;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类型转换器的意义
 */
public class AddGoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        //获取参数值
        String goodsName = req.getParameter("goodsName");
        String goodsPrice = req.getParameter("goodsPrice");
        String goodsNumber = req.getParameter("goodsNumber");

        //进行类型转换
        double newGoodsPrice = Double.parseDouble(goodsPrice);
        int newGoodsNumber = Integer.parseInt(goodsNumber);

        //将转换后的数据封装为goods值对象
        Goods goods = new Goods(goodsName,newGoodsPrice,newGoodsNumber);

    }
}

package com.rail;



import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;



public class AddToFavoritesServlet extends HttpServlet {

             protected void doPost(HttpServletRequest request, HttpServletResponse response)

                                        throws ServletException, IOException {

                          String crossingId = request.getParameter("crossingId");

                          if (crossingId != null && !crossingId.isEmpty()) {

                                        int railwayCrossingId = Integer.parseInt(crossingId);


                                        RailwayCrossingDAO crossingDAO = new RailwayCrossingDAO();

                                        crossingDAO.addToFavorites(railwayCrossingId); 

                          }

                          response.sendRedirect("userHome.jsp");


             }

}

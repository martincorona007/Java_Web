<%-- 
    Document   : guest
    Created on : Jun 3, 2020, 7:13:43 PM
    Author     : sicar
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
  
        <title>Guest</title>
         <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Raleway:500italic,600italic,600,700,700italic,300italic,300,400,400italic,800,900' rel='stylesheet' type='text/css'>
        
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,300italic,400italic,600italic,700,900' rel='stylesheet' type='text/css'>
        
        <!-- favicon -->
        <link rel="icon" type="image/png" href="images/favicon.png">
        
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        
        <!-- Fontawesome  -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        
        <!-- Animate CSS -->
        <link rel="stylesheet" type="text/css" href="css/animate.css">
        
        <link rel="stylesheet" type="text/css" href="css/style.css">
        
        <!-- BX slider CSS -->
        <link rel="stylesheet" type="text/css" href="css/jquery.bxslider.css">
        
        <!-- responsive css -->
        <link rel="stylesheet" type="text/css" href="css/responsive.css">
    </head>
    <body>
         <section class="section-reserv1">
            <div class="back-grounded1">
                <div class="back-ground1">
                    <div class="container">
                        <div class="">
                            <form method="POST" action="restaurantController" name="frmAddProduct">
                                <div class="reserva-inners">
                                    <div class="item text-center">
                                        <img id="alters" src="images/p15.png" alt = "header-logo">
                                    </div>
                                 </div>
                                
                                
                            </form>
                            
                        </div>
                                
                    </div>
                    <div class="container">
                        <div class="row">
                            <div>
                                <div class="text-center">
                                    <img id="alterk" src="images/p19.png" alt = "header-logo">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="container">
                        <div class="row">
                            <div class="col-md-4 col-md-offset-8">
                                <p><a class="btn btn-success btn-lg" href="restaurantController?action=listMenu">Aceptar</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="color-footer">
                <!-- Footer -->
               <footer class="footer">
               
                   <div class="container">
                   
                       <div class="row">
                       
                           <div class="col-md-12">
                               
                           
                                   <div class="copys">
                                       <p>Copyright &copy; 2020 <a href="#"> - La Chata Restaurant</a></p>    
                                   </div>
                                   
                           
                           </div>
                       
                       
                       </div>
                   
                   </div>
               
               
               </footer>
           </div>
           <div class="color-footer-strong">

           </div>
        </section>
        
         <!-- Bootstrap JavaScript -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <!-- Bx Slider JS -->
        <script src="js/jquery.bxslider.min.js"></script>
        
        <!-- Add JS counter lib -->
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        
        <!-- Add wow js lib -->
        <script src="js/wow.min.js"></script>
      
        <!-- Custom Js -->
        <script src="js/custom.js"></script>
    </body>
</html>
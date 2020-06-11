<%-- 
    Document   : reservation
    Created on : Jun 3, 2020, 7:14:23 PM
    Author     : sicar
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>La Chata Restaurant</title>
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

        <section class="section-reserv">
            <div class="back-grounded">
                <div class="back-ground">
                    <div class="container">
                        <div class="row">
                            <div class="reserva-inner">
                                    <div class="item text-center">
                                        <img id="alter" src="images/chata-logo.png" alt = "header-logo">
                                    </div>
                            </div>
                        </div>
                    </div>
                    <div class="container">
                        <div class="">
                            <form method="POST" action="restaurantController" name="frmAddProduct">
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="example-date-input" class="label-all" class="col-2 col-form-label">First Name</label>
                                            <div class="col-3">
                                            <input class="form-control" type="text" name="f_name"value="<c:out value="${reservatt.f_name}" />" /> <br />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="example-time-input" class="label-all" class="col-2 col-form-label">Time</label>
                                            <div class="col-10">
                                                <select name="time_res" class="custom-select mb-2 mr-sm-2 mb-sm-0 form-control" id="inlineFormCustomSelect">
                                                <option class="form-control" selected>Choose...</option>
                                            
                                                <option name="time_res" value="11:00:00">11:00:00</option>
                                                <option name="time_res" value="12:00:00" >12:00:00</option>
                                                <option name="time_res" value="12:50:00" >12:50:00</option>
                                                <option name="time_res" value="13:40:00" >13:40:00</option>
                                                <option name="time_res" value="14:30:00" >14:30:00</option>
                                                <option name="time_res" value="15:20:00" >15:20:00</option>
                                                <option name="time_res" value="16:10:00" >16:10:00</option>
                                                <option name="time_res" value="17:00:00" >17:00:00</option>
                                                <option name="time_res" value="17:40:00" >17:40:00</option>
                                                <option name="time_res" value="18:30:00" >18:30:00</option>
                                                <option name="time_res" value="19:00:00" >19:00:00</option>
                                            </select>
                                            </div>
                                            
                                        </div>
                                       
                                        
                                       
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="example-date-input" class="label-all" class="col-2 col-form-label">Last Name</label>
                                            <div class="col-3">
                                            <input class="form-control" type="text" name="l_name"value="<c:out value="${reservatt.l_name}" />" /> <br /> 
                                            </div>
                                        </div>
                                        
                                        
                                        <div class="form-group row">
                                            <label for="example-time-input" class="label-all" class="col-2 col-form-label">Numero de invitados</label>
                                            <div class="col-10">
                                                <select name="guest_n" class="custom-select mb-2 mr-sm-2 mb-sm-0 form-control" id="inlineFormCustomSelect">
                                                <option class="form-control" selected>Choose...</option>
                                            
                                                <option name="guest_n" value="1">1</option>
                                                <option name="guest_n" value="2" >2</option>
                                                <option name="guest_n" value="3" >3</option>
                                                <option name="guest_n" value="4" >4</option>
                                                <option name="guest_n" value="5" >5</option>
                                                <option name="guest_n" value="6" >6</option>
                                                <option name="guest_n" value="7" >7</option>
                                                <option name="guest_n" value="8" >8</option>
                                                <option name="guest_n" value="9" >9</option>
                                            </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="example-date-input" class="label-all" class="col-2 col-form-label">Cell Phone</label>
                                            <div class="col-3">
                                            <input  class="form-control" type="text" name="cell_phone"value="<c:out value="${reservatt.cell_phone}" />" /> <br /> 
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="example-date-input" class="label-all" class="col-2 col-form-label">Date</label>
                                            <div class="col-3">
                                            <input class="form-control" type="text" name="date_res" value="<c:out value="${reservatt.date_res}" />">
                                            </div>
                                        </div>
                                       
            
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label for="example-date-input" class="label-all" class="col-2 col-form-label">Anotaciones</label>
                                            <div class="col-3">
                                            <input class="form-control" type="text" name="request_t" /> <br />
                                            </div>
                                        </div>
                                    <div class="col-md-4 col-md-offset-8">
                                            <!--
                                            
                                                <p><a type="submit" class="btn btn-success btn-lg" href="restaurantController?action=guest">Reservarci?n</a></p>
                                        -->
                                        <div class="copys1">
                                            <input class="btn btn-success" type="submit"  name="button1" value="Reservar"/>
                                        
                                        </div>
                                        
                                    </div>
                                    </div>
                                </div>
                               
                            </form>
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
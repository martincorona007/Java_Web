<%-- 
    Document   : home
    Created on : Jun 3, 2020, 7:13:09 PM
    Author     : sicar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <!--Header-->
        <header class="header">
            <!-- Navigation-->
            <nav class="navbar navbar-default navbar-fixed-top">
              
                
                <div class="container">
                  
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#chata-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                      </button>
                      
                    </div>
                 
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="loso-navbar-collapse-1">
                  <ul class="nav navbar-nav navbar-right">
                      <img src="../../../../Build by me/ITS/JAVAWEB/P3/markup/pictures/chata-logo.png" alt=""/>
                        <li><a href="#HOME" class="nav-item">Inicio</a></li>
                        <li><a href="#FEATURES" class="nav-item">Reservarción</a></li>
                        <li><a href="#SCREENS" class="nav-item">Galeria</a></li>
                        <li><a href="#DOWNLOAD" class="nav-item">Contacto</a></li>
                  </ul>
                 
                </div><!-- /.navbar-collapse -->
              </div><!-- /.container-fluid -->
	    </nav>
            
            <div class="header-overlay">
                <div class="centers">
                 
                       <div class="picture-1">
                                 <img id="alter"src="images/chata-logo.png" alt = "header-logo">
                       </div>
                  
                </div>
            </div>
            <div class="boton">
                
                <form method="POST" action="restaurantController" name="frmAddProduct">
                    
                    <p><a class="btn btn-success btn-lg" href="restaurantController?action=reserva">Reservarción</a></p>
                </form>

            
            </div>
        </header>
        <!--Gallery-->
        <section class="gallery">
              <div class="container">
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="section-title">
                            <h1>Gallery</h1>
                        </div>
                            
                    </div>
                </div>
               </div>
            <div class="container">
                <div class="division">
                    <div class="row">
                   
                        <div class="col-md-4">
                           <img class="image-pics" src="images/p1.jpg" class="rounded float-left" alt="">
                       </div>
                       <div class="col-md-4">
                           <img class="image-pics" src="images/p2.jpg" class="rounded float-left" alt="">
                       </div>
                       <div class="col-md-4">
                           <img class="image-pics" src="images/p3.png" class="rounded float-left" alt="">
                       </div>
                   
                    </div>
                </div>
                <div class="division">
                    <div class="row">
                   
                        <div class="col-md-4">
                           <img class="image-pics" src="images/p4.jpg" class="rounded float-left" alt="">
                       </div>
                       <div class="col-md-4">
                           <img class="image-pics" src="images/p5.jpg" class="rounded float-left" alt="">
                       </div>
                       <div class="col-md-4">
                           <img class="image-pics" src="images/p6.png" class="rounded float-left" alt="">
                       </div>
                   
                    </div>
                </div>
                <div class="division">
                   <div class="row">
                   
                        <div class="col-md-4">
                           <img class="image-pics" src="images/p7.jpg" class="rounded float-left" alt="">
                       </div>
                       <div class="col-md-4">
                           <img class="image-pics" src="images/p8.jpg" class="rounded float-left" alt="">
                       </div>
                       <div class="col-md-4">
                           <img class="image-pics" src="images/p9.jpg" class="rounded float-left" alt="">
                       </div>
                   
                   </div>

                </div>
                
            </div>
            
        </section>
        <!--Contact Address Schedule-->
        <section class="conctact">
            <div class="container">
                <div class="row">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="section-title">
                            <h1>Conctact</h1>
                        </div>
                            
                    </div>
                </div>
               </div>
            <div class="separ">
                <div class="row">
                    <div class="col-md-4">
                    <h3>Contacto</h3>
                    <p>Cel : 331 051 0024 </p>
                    </div>
                    <div class="col-md-4">
                        <h3>Dirección</h3>
                        <p>Federación #250 Col. La Perla, Gdl. Jal.</p>
                    </div>
                    <div class="col-md-4">
                        <h3>Horario</h3>
                        <p>Horarios : 11:00am–8:00pm</p>
                    </div>
                </div>
                
            </div>
        </section>
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

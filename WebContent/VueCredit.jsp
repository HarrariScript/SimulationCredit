<%@page import="web.CreditModel"%>
<% 
   CreditModel mod = (CreditModel)request.getAttribute("mod");

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
<title>Simulateur Credit</title>
</head>
<body>
       <div>
          <form action="controller.do" method="POST">
             <table>
                <tr>
                   <td> Montant : </td>
                   <td> <input type="text" name="Montant" value="<%=mod.getMontant()%>"></td>
                </tr>
                
                <tr>
                   <td> Duree : </td>
                   <td> <input type="text" name="Duree" value="<%=mod.getDuree()%>"></td>
                </tr>
                
                <tr>
                   <td> Taux : </td>
                   <td> <input type="text" name="Taux" value="<%=mod.getTaux()%>"></td>
                </tr>
                
                  <tr>
                   <td> <input type="submit" value="calculer" ></td>
                </tr>
                
             </table>
          
           </form>
       </div>
       <div>
          <table>
              <tr>
                 <td> mensulite :</td>
                 <td> <%out.println(mod.getMensulite());%></td>
              
              </tr>
          </table>
       </div>
</body>
</html>
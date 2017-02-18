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
      
<div class="container" style=" padding-top: 100px">


    <form class="form-horizontal" method="post" action="controller.do">
        <div class="form-group">
            <label for="montant" class="col-sm-2 control-label">Montant</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="montant" name="Montant" placeholder="Montant" value="<%=mod.getMontant()%>">
            </div>
        </div>
        <div class="form-group">
            <label for="duree" class="col-sm-2 control-label">Duree</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="duree"  name="Duree" placeholder="Duree" value="<%=mod.getDuree()%>">
            </div>
        </div>
        <div class="form-group">
            <label for="taux" class="col-sm-2 control-label">Taux</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="taux"  name="Taux" placeholder="Taux" value="<%=mod.getTaux()%>">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Calculer</button>
            </div>
        </div>
    </form>
    <div>
        <table>
            <tr>
                <td> mensulite :</td>
                <td> <%out.println(mod.getMensulite());%></td>

            </tr>
        </table>
    </div>
    
</div>
</body>
</html>
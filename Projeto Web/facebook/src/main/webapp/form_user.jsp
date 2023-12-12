<jsp:directive.page contentType="text/html; charset=UTF-8" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cadastro Usuário</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/bootstrap-icons.css">
    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="col-2"></div>
                <form method="GET" class="col-8" action="/facebook/save">

                    <h1 class="mb-3">Cadastrar Usuário</h1>

                    <div class="form-group mb-3">
                        <label for="user-name-id">Nome Usuário</label>
                        <input type="text" class="form-control" id="user-name-id" name="user-name" placeholder="Nome de Usuário">
                    </div>

                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="user-gender" id="user-gender-id-f" value="F">
                        <label class="form-check-label" for="user-gender-id-f">
                          Feminino
                        </label>
                    </div>

                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="user-gender" id="user-gender-id-m" value="M">
                        <label class="form-check-label" for="user-gender-id-m">
                          Masculino
                        </label>
                    </div>

                    <div class="form-group mb-3">
                        <label for="email-id">Email</label>
                        <input type="email" class="form-control" id="email-id" name="email" placeholder="Email">
                    </div>

                    
                
                    <button type="submit" class="btn btn-primary">Cadastrar</button>                    
                </form>
                <div class="col-2"></div>
            </div>            
        </div>

		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.bundle.min.js"></script>    
    </body>

</html>
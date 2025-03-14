
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dashboroad member</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light ">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">SportTalent</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Activite</a>
                </li>
                <li class="nav-item dropdown">

                <li class="nav-item">
                    <a class="nav-link " href="#" tabindex="-1" aria-disabled="true">member</a>
                </li>
            </ul>
            <form class="d-flex">

                <a href="login.jsp" class="btn btn-success me-2 ">
                    Log out
                </a>

            </form>
        </div>
    </div>
</nav>
<h1>hello member</h1>

<div class="container mt-5">
    <div class="card shadow-sm">

        <div class="card-body">
            <form action="add" method="post" >
                <div class="mb-3">
                    <label for="date1" class="form-label">Date</label>
                    <input type="date" class="form-control" id="date1" name="date" required>
                </div>



                <div class="mb-3">
                    <label for="sport" class="form-label">Sport</label>
                    <input type="text" class="form-control" id="sport" name="sport" placeholder="Enter sport" required>
                </div>

                <button type="submit" class="btn btn-success w-100">Add Member</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>

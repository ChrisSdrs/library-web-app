<form action="/login" id="login" class="form-signin" name="loginForm" method="POST">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
    <div class="wrapper fadeInDown">
        <div id="formContent">
            <!-- Login Form -->
            <form>
                <input type="text" id="username" class="fadeIn second" name="username" placeholder="username" autofocus>
                <input type="password" id="password" class="fadeIn third" name="password" placeholder="password">

                <div class="checkbox mb-3">
                    <#if loginAuthentication?has_content>
                        <#if
                        loginAuthentication == "fail">
                        </#if>
                        <div><p class="error"> Invalid username or password.</p></div>
                    </#if>
                </div>

                <input type="submit" class="fadeIn fourth">
            </form>
        </div>
    </div>
</form>

<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Borrows</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Borrows-Create">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Create Borrow</h3>
            <div class="table-responsive">

                <#include "../forms/borrowCreateForm.ftlh" />
            </div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
<script src="/scripts/borrowValidation.js"></script>
</body>
</html>


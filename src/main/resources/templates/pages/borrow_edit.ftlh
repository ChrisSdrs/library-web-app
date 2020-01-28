<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Borrows</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Repair-Edit">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Edit Borrow ${id}</h3>
<div class="table-responsive">

    <#include "../forms/borrowEditForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
<script src="/scripts/borrowValidation.js"></script>
</body>
</html>

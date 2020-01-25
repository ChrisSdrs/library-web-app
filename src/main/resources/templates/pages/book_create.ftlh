<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Books</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Books-Create">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Create Book</h3>
<div class="table-responsive">

    <#include "../forms/bookCreateForm.ftlh" />
</div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/bookValidation.js"></script>
<script src="/scripts/main.js"></script>

</body>
</html>


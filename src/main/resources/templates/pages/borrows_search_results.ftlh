<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Borrows</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Borrows-Search">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Search Borrows</h3>
            <div class="table-responsive">
                <#include "../forms/borrowSearchForm.ftlh" />
                <#include "../partials/borrows_table.ftlh" />
            </div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/scripts.ftlh">
</body>
</html>


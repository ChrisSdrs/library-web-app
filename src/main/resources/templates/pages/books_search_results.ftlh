<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Books</title>
    <#include "../partials/head.ftlh">
</head>
<body>

<#include "../partials/navbar.ftlh">

<#assign page = "Books-Search">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Search Book</h3>
            <div class="table-responsive">
                <#include "../forms/bookSearchForm.ftlh" />
                <div class="Dynamic-Load">
                    <#include "../partials/books_table.ftlh" />
                </div>
            </div>

<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/scripts.ftlh">
</body>
</html>


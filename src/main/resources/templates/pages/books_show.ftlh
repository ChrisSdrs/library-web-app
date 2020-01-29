<#import "/spring.ftl" as spring />


<html>
<head>
    <title>Books</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Books">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">Books</h3>
<div class="table-responsive">
    <#include "../partials/books_table.ftlh" />
</div>

<!-- Modal -->
<#include "../partials/delete_confirm_modal.ftlh" />
<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="/scripts/main.js"></script>
</body>
</html>
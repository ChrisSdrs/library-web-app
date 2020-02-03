<html>
<head>
    <title>Members</title>
    <#include "../partials/head.ftlh">
</head>
<body>


<#assign page = "Users">
<#include "../partials/main_content_top.ftlh">

            <h3 class="mb-3">Members</h3>
            <div class="table-responsive">

                <#include "../partials/users_table.ftlh" />
            </div>

<!-- Modal -->
<#include "../partials/delete_confirm_modal.ftlh" />

<#include "../partials/main_content_bottom.ftlh">
<script src="/scripts/main.js"></script>
<#include "../partials/scripts.ftlh">
</body>
</html>